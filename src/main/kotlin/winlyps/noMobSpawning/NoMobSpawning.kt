package winlyps.noMobSpawning

import org.bukkit.plugin.java.JavaPlugin

class NoMobSpawning : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doMobSpawning", "false")
        }
        logger.info("NoMobSpawning plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doMobSpawning", "true")
            logger.info("NoMobSpawning plugin has been disabled.")
        }
    }
}