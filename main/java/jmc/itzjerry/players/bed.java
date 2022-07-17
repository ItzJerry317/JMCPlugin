package jmc.itzjerry.players;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class bed implements Listener {
    @EventHandler
    public static void enterBed(PlayerBedEnterEvent e){
        Bukkit.broadcastMessage("§a"+e.getPlayer().getName()+"进入了床。");
        Bukkit.broadcastMessage("§a要想快速跳过夜晚，请所有玩家上床。");
    }
}
