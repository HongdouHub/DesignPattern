package designpattern.no13_command.test2.command;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 菜单对象，宏命令对象
 */
public class MenuCommand implements Command {

    private Collection<Command> col = new ArrayList<Command>();

    public void addCommand(Command command) {
        col.add(command);
    }

    public boolean removeCommand(Command command) {
        return col.remove(command);
    }

    @Override
    public void execute() {
        for (Command command : col) {
            command.execute();
        }
    }
}
