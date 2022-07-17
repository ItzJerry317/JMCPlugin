package jmc.itzjerry.players;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;

public class kick implements Listener {
    @EventHandler
    public static void onKick(PlayerKickEvent e) {
        String kickPlayer = e.getPlayer().getName();
        String kickReason = e.getReason();
        Bukkit.broadcastMessage("-----------------");
        Bukkit.broadcastMessage("§d"+kickPlayer+"已被踢出游戏！");
        Bukkit.broadcastMessage("§d原因："+kickReason);
        Bukkit.broadcastMessage("§d请遵守游戏规则，合理游玩！");
        Bukkit.broadcastMessage("-----------------");
    }
}
