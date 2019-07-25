package nycuro.tasks;

import cn.nukkit.command.ConsoleCommandSender;
import cn.nukkit.scheduler.Task;
import nycuro.api.API;
import nycuro.Loader;

/**
 * author: NycuRO
 * SkyblockCore Project
 * API 1.0.0
 */
public class RegisterTopsTask extends Task {

    @Override
    public void onRun(int i) {
        Loader.registerTops();
        API.getMainAPI().getServer().dispatchCommand(new ConsoleCommandSender(), "gc");
    }
}
