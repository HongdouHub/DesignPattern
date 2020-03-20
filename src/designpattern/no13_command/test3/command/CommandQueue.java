package designpattern.no13_command.test3.command;

import com.google.gson.reflect.TypeToken;
import designpattern.no13_command.test3.cook.BaseCooker;
import designpattern.no13_command.test3.cook.HotCooker;
import utils.FileOpenUtils;
import utils.GsonUtil;

import java.util.*;

public class CommandQueue {

    private static final String FILE_NAME = "D:\\Java\\workspace_intellij\\Test2019\\src\\designpattern\\no13_command\\test3\\command\\CommandQueue.txt";

    private static List<Command> hotCommands = new ArrayList<Command>();
    private static List<Command> coolCommands = new ArrayList<Command>();

    static {
        String fileData = FileOpenUtils.readFile(FILE_NAME);
        List<FoodCommand> data = GsonUtil.json2Array(fileData, new TypeToken<List<FoodCommand>>(){});
        if (data != null) {
            add(data);
        }
    }

    public static void addMenu(MenuCommand menuCommand) {
        add(menuCommand.getCommands()); //加入的是菜单里面的菜色命令
    }

    private synchronized static void add(List<FoodCommand> col) {
        for (Command command : col) {
            if (command instanceof FoodCommand) {
                BaseCooker cooker = ((FoodCommand) command).getCooker();

                if (cooker instanceof HotCooker) {
                    hotCommands.add(command);
                } else {
                    coolCommands.add(command);
                }
            }
        }
    }

    public static synchronized Command getHotCookerCommand() {
        Command command = null;

        if (!hotCommands.isEmpty()) {
            command = hotCommands.get(0);

            hotCommands.remove(0);

            writeFile();
        }
        return command;
    }

    public static synchronized Command getCoolCookerCommand() {
        Command command = null;

        if (!coolCommands.isEmpty()) {
            command = coolCommands.get(0);

            coolCommands.remove(0);

            writeFile();
        }
        return command;
    }

    private static void writeFile() {
        Set<Command> commands = new HashSet<Command>();

        commands.addAll(hotCommands);
        commands.addAll(coolCommands);

        String json = GsonUtil.bean2Json(commands);
        FileOpenUtils.writeFile(FILE_NAME, json);
    }
}
