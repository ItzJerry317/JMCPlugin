package jmc.itzjerry;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

import static org.bukkit.Bukkit.getLogger;
public class CustomConfig {
    private static File file;
    private static FileConfiguration customFile;


    public static void setup() {
        file = new File(Bukkit.getServer().getPluginManager().getPlugin("JMCPluginNew").getDataFolder(), "AnnouncementContent.yml");
        if (file.exists()) {
            try {
                file.createNewFile();
            }catch (IOException e) {
                //uh oh
            }
        }
        customFile = YamlConfiguration.loadConfiguration(file);
    }

    public static FileConfiguration get() {
        return customFile;
    }

    public static void save() {
        try {
            customFile.save(file);
        }catch (IOException e){
            getLogger().warning("JMC Plugin - Couldn't save file");
        }
    }

    public static void reload() {
        customFile = YamlConfiguration.loadConfiguration(file);
    }
}
