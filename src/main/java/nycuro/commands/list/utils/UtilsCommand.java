package nycuro.commands.list.utils;

import cn.nukkit.Player;
import cn.nukkit.command.CommandSender;
import nycuro.api.API;
import nycuro.commands.PrincipalCommand;

/**
 * author: NycuRO
 * FactionsCore Project
 * API 1.0.0
 */
public class UtilsCommand extends PrincipalCommand {

    public UtilsCommand() {
        super("utils", "Utilites!");
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] strings) {
        Player player = (Player) commandSender;
        API.getUtilsAPI().sendUtilsContents(player);
        return true;
    }
}
