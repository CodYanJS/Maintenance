package net.coddev.cdm;
import net.coddev.cdm.commands.CommandMaintenanace;
import org.bukkit.plugin.java.JavaPlugin;
public class Maintenance extends JavaPlugin {
    public static boolean ENABLED = false;
    public void onEnable() {
        System.out.println("[Maintenance] " + "Plugin de maintenanace ENABLED");
        getCommand("maintenance").setExecutor(new CommandMaintenanace());
    }
    public void onDisable(){
        System.out.println("[Maintenance] " + "Plugin de maintenanace DISABLED");
    }
}
