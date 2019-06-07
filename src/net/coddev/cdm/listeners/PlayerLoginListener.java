package net.coddev.cdm.listeners;

import net.coddev.cdm.Maintenance;
import net.coddev.cdm.constants.Messages;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerLoginListener implements Listener {
    @EventHandler (priority = EventPriority.HIGH)
    public void onPlayerJoin(PlayerJoinEvent event) {
        final Player player = event.getPlayer();
        if(Maintenance.ENABLED) {
            if(!player.isOp()) {
                player.kickPlayer(Messages.PLAYER_MAINTENANCE_KICK.getMessage());
            }
        }
    }
}
