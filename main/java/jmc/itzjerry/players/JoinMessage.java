package jmc.itzjerry.players;

import jmc.itzjerry.CustomConfig;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class JoinMessage implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        p.sendMessage("§a欢迎回来，"+p.getName()+"!");
        p.sendMessage("§7________________§b§l公告§7________________");
        if (CustomConfig.get().get("Announcement") != "Not Set") {
            p.sendMessage(CustomConfig.get().getString("Announcement"));
        } else {
            p.sendMessage("暂时还没有公告哟");
        }
        if (p.isOp()) {
            if (p.getName().equals("1tzJerry")) {
                String joinMessage = "§b>>> [§dOWNER§f] §d"+p.getName()+" §a加入了游戏！ §b<<<";
                e.setJoinMessage(joinMessage);
            } else {
                String joinMessage = "§b>>> [§dADMIN§f] §d"+p.getName()+" §a加入了游戏！ §b<<<";
                e.setJoinMessage(joinMessage);
            }
        } else {
            String joinMessage = p.getName()+" §a加入了游戏！";
            e.setJoinMessage(joinMessage);
        }
    }

}
