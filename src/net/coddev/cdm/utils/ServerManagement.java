package net.coddev.cdm.utils;
import net.coddev.cdm.constants.Messages;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
public class ServerManagement {
    public static void kickAllNonOp() {
        for(Player player : Bukkit.getOnlinePlayers()) {
            if (!player.isOp()) {
                player.kickPlayer(Messages.PLAYER_MAINTENANCE_KICK.getMessage());
            }
        }
    }
}
