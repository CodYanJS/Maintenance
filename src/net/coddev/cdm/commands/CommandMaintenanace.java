package net.coddev.cdm.commands;
import net.coddev.cdm.Maintenance;
import net.coddev.cdm.constants.Messages;
import net.coddev.cdm.utils.ServerManagement;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
public class CommandMaintenanace implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(label.equalsIgnoreCase("maintenance")) {
            if(args.length == 1) {
                if(args[0].equalsIgnoreCase("on")) {
                    Maintenance.ENABLED = true;
                    ServerManagement.kickAllNonOp();
                    sender.sendMessage(Messages.MAINTENANCE_ENABLED.getMessage());
                } else if (args[0].equalsIgnoreCase("off")) {
                    Maintenance.ENABLED = false;
                    sender.sendMessage(Messages.MAINTENANCE_DISABLED.getMessage());
                }else {
                    sender.sendMessage(Messages.COMMAND_INVALID_ARGS_LENGTH.getMessage());
                }
            } else {
                sender.sendMessage(Messages.COMMAND_INVALID_ARGS_LENGTH.getMessage());
            }
        }
        return false;
    }
}
