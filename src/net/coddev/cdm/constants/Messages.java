package net.coddev.cdm.constants;
import org.bukkit.ChatColor;
public enum Messages {
    COMMAND_INVALID_ARGS_LENGTH(ChatColor.AQUA + "[Maintenance]" + ChatColor.RED + " Commande invalide"),
    MAINTENANCE_ENABLED(ChatColor.AQUA + " La maintenance est maintenant activée"),
    MAINTENANCE_DISABLED(ChatColor.AQUA + " La maintenance est maintenant désactivée"),
    PLAYER_MAINTENANCE_KICK("Vous avez été kick Raison :" + ChatColor.RED +  " UNE MAINTENANCE A ETE ACTIVEE");
    private final String message;
    Messages(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
