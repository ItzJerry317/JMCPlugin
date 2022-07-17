package jmc.itzjerry.players;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class bedLeave implements Listener {
    @EventHandler
    public static void leaveBed(PlayerBedLeaveEvent e) {
        Bukkit.broadcastMessage("§a"+e.getPlayer().getName()+"离开了床。");
    }
}
