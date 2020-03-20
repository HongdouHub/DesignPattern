package designpattern.no13_command.test1.command;

import designpattern.no13_command.test1.mainboard.MainBoardApi;

public class ResetCommand implements Command {
    private MainBoardApi mainBoard = null;

    public ResetCommand(MainBoardApi mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public void execute() {
        mainBoard.reset();
    }
}
