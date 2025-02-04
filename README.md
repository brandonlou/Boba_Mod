# [BobaCraft](https://www.curseforge.com/minecraft/mc-mods/bobacraft)

> Satisfy your boba cravings in Minecraft!
 
![Six boba drinks](https://user-images.githubusercontent.com/14984696/93945029-a873cc80-fd25-11ea-9a20-f36daeb5276c.png)

View the Wiki for crafting recipes and information!

### Setup
1. Requirements: `JDK 8`
2. Clone this repo: `git clone https://github.com/brandonlou/BobaCraft.git`
3. Open `IntelliJ`. Import the project by selecting `build.gradle`.
2. Gradle will automatically download dependencies. Once that is complete, run `./gradlew genIntellijRuns`. Replce `./gradlew` with `gradlew` if on Windows.

### Testing
1. Run `./gradlew runClient`.
2. All Minecraft game files will be stored in the `run` directory (useful if you want to look at crash reports, screenshots, etc).

### Building
1. Run `./gradlew build --warning-mode all`.
2. The mod jar file will be located in `build/libs`.
3. Rename the jar file appropriately.

## Possible Features
* Better pixel art
* ~~Boba ball crafting from scratch (growing tapioca, etc)~~
* Boba straw colors
* Different toppings (grass jelly, etc.)

## License
[GNU General Public License v3.0](LICENSE)
