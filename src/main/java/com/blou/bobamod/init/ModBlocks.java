package com.blou.bobamod.init;

import com.blou.bobamod.BobaMod;
import com.blou.bobamod.blocks.*;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.Map;

public class ModBlocks {

    private static ModBlocks instance;
    public static ModBlocks getInstance(BobaMod bobaMod) {
        if(instance == null) instance = new ModBlocks(bobaMod);
        return instance;
    }

    private final DeferredRegister<Block> blocks;
    private final Map<String, RegistryObject<Block>> bobaBlocks;

    private ModBlocks(BobaMod bobaMod) {
        blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, bobaMod.getModID());
        bobaBlocks = new HashMap<String, RegistryObject<Block>>() {{
            put("black_milk_tea_block", blocks.register("black_milk_tea_block", BlackMilkTeaBlock::new));
            put("thai_milk_tea_block", blocks.register("thai_milk_tea_block", ThaiMilkTeaBlock::new));
            put("green_milk_tea_block", blocks.register("green_milk_tea_block", GreenMilkTeaBlock::new));
            put("jasmine_milk_tea_block", blocks.register("jasmine_milk_tea_block", JasmineMilkTeaBlock::new));
            put("taro_milk_tea_block", blocks.register("taro_milk_tea_block", TaroMilkTeaBlock::new));
            put("strawberry_milk_tea_block", blocks.register("strawberry_milk_tea_block", StrawberryMilkTeaBlock::new));
        }};

    }

    public DeferredRegister<Block> getBlocksRegister() {
        return blocks;
    }

    public Block getBlock(String key) {
        return bobaBlocks.get(key).get();
    }

}
