package designpattern.no13_command.test1.box;

import designpattern.no13_command.test1.command.OpenCommand;
import designpattern.no13_command.test1.command.ResetCommand;

public class Box {

    private OpenCommand openCommand;

    private ResetCommand resetCommand;

    public void setOpenCommand(OpenCommand openCommand) {
        this.openCommand = openCommand;
    }

    public void setResetCommand(ResetCommand resetCommand) {
        this.resetCommand = resetCommand;
    }

    public void openButtonPressed() {
        openCommand.execute();
    }

    public void resetButtonPressed() {
        resetCommand.execute();
    }
}
