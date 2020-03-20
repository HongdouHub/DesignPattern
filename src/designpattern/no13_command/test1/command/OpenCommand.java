package designpattern.no13_command.test1.command;

import designpattern.no13_command.test1.mainboard.MainBoardApi;

public class OpenCommand implements Command {

    private MainBoardApi mainBoard = null;

    public OpenCommand(MainBoardApi mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public void execute() {
        this.mainBoard.open();
    }
}
