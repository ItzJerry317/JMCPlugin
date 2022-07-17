package jmc.itzjerry;

import jmc.itzjerry.commands.announcement;
import jmc.itzjerry.commands.checkPing;
import jmc.itzjerry.players.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class ItzJerry extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        //Custom Config Sets
        CustomConfig.setup();
        CustomConfig.get().addDefault("Announcement", "Not Set");
        CustomConfig.get().options().copyDefaults(true);
        CustomConfig.save();
        //Outputs
        getLogger().info("JMC Plugin NEW - started up!");
        getServer().getPluginManager().registerEvents(new JoinMessage(), this);
        getServer().getPluginManager().registerEvents(new Chat(), this);
        getServer().getPluginManager().registerEvents(new fish(), this);
        getServer().getPluginManager().registerEvents(new kick(), this);
        getServer().getPluginManager().registerEvents(new bed(), this);
        getServer().getPluginManager().registerEvents(new bedLeave(), this);
        this.getCommand("announce").setExecutor(new announcement());
        this.getCommand("checkping").setExecutor(new checkPing());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Shutting down JMC Plugin NEW");
    }
}
