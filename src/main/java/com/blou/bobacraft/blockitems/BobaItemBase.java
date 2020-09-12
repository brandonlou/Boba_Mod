package com.blou.bobacraft.blockitems;

import com.blou.bobacraft.BobaCraft;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Supplier;

public class BobaItemBase extends BlockItem {

    private static final int maxStackSize = 16;
    private static final int health = 16; // Restores 8 hearts.
    private static final float saturation = 1.5f;
    private static final float effectProbability = 0.10f; // 10% chance for special effect.

    public BobaItemBase(Block block, Supplier<EffectInstance> effectInstance, BobaCraft bobaCraft) {
        super(block, new Item.Properties()
                .group(bobaCraft.getTab())
                .maxStackSize(maxStackSize)
                .rarity(Rarity.UNCOMMON)
                .food(new Food.Builder()
                        .hunger(health)
                        .saturation(saturation)
                        // 25% chance for level 1 speed effect for 15 seconds (15 secs * 20 ticks/sec = 300 ticks)
                        .effect(effectInstance, effectProbability)
                        .setAlwaysEdible() // You can eat it even if you're not hungry.
                        .build()));
    }

    @Override @Nonnull
    @ParametersAreNonnullByDefault
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK; // Use drinking animation instead of eating animation when consumed.
    }

}
