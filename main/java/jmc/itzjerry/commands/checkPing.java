package jmc.itzjerry.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getLogger;

public class checkPing implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            int ping = p.getPing();
            if (ping < 100) {
                p.sendMessage("§a" + p.getName() + " §f的延迟为§a" + p.getPing());
            } else if (ping < 200 && ping > 100) {
                p.sendMessage("§a"+ p.getName() + " §f的延迟为§6" + p.getPing());
            } else {
                p.sendMessage("§a"+ p.getName() + " §f的延迟为§4" + p.getPing());
            }
            return true;
        } else {
            getLogger().warning("这条指令只有玩家才能使用");
            return false;
        }
    }
}
