package jmc.itzjerry.players;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

public class fish implements Listener {
    @EventHandler
    public static void onFish(PlayerFishEvent e){
        String state = String.valueOf(e.getState());
        if (state.equals("CAUGHT_FISH")) {
            Bukkit.broadcastMessage("§a" + e.getPlayer().getName() + " §f钓到了一个 §6§l" + e.getCaught().getName() + " §f!");
        }
    }
}
