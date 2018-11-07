package Command;

import Controller.MainForm;

public class SaveCommand extends Command{


    public SaveCommand(MainForm mainForm) {
        super(mainForm);
    }

    @Override
    public boolean execute() {
        return false;
    }
}