package us.skyywastaken.disablevillagerprofessions;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class DisableVillagerProfessions extends JavaPlugin {
    private static FileConfiguration config;
    private EventManager events = new EventManager();

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(events, this);
        config = this.getConfig();
        this.saveDefaultConfig();
    }

    @Override
    public void onDisable() {

    }

    static FileConfiguration getPluginConfig() {
        return config;
    }
}
