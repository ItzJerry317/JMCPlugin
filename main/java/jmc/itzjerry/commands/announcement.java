package jmc.itzjerry.commands;

import jmc.itzjerry.CustomConfig;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Arrays;

public class announcement implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp()){
            if (args.length == 0) {
                sender.sendMessage("§4语法错误！/announce <content>");
                return false;
            } else {
                CustomConfig.get().set("Announcement", args);
                Bukkit.broadcastMessage(Arrays.toString(args));
                return true;
            }
        } else {
            sender.sendMessage("§4你没有权限使用这条指令");
            return false;
        }
    }

}
