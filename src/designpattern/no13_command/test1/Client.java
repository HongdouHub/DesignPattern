package designpattern.no13_command.test1;

import designpattern.no13_command.test1.box.Box;
import designpattern.no13_command.test1.command.OpenCommand;
import designpattern.no13_command.test1.command.ResetCommand;
import designpattern.no13_command.test1.mainboard.GAMainBoard;

public class Client {

    public static void main(String[] args) {
        GAMainBoard mainBoard = new GAMainBoard();

        OpenCommand openCommand = new OpenCommand(mainBoard);
        ResetCommand resetCommand = new ResetCommand(mainBoard);

        Box box = new Box();
        box.setOpenCommand(openCommand);
        box.setResetCommand(resetCommand);

        box.openButtonPressed();
        System.out.println();
        box.resetButtonPressed();
    }
}
