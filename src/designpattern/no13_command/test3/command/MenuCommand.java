package designpattern.no13_command.test3.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单对象，宏命令对象
 */
public class MenuCommand implements Command {

    private List<FoodCommand> col = new ArrayList<FoodCommand>();

    public synchronized void addCommand(FoodCommand command) {
        col.add(command);
    }

    public synchronized boolean removeCommand(FoodCommand command) {
        return col.remove(command);
    }

    public synchronized boolean hasCommand(FoodCommand command) {
        return col.contains(command);
    }

    public List<FoodCommand> getCommands() {
        return col;
    }

    @Override
    public void execute() {
        CommandQueue.addMenu(this);
    }
}
