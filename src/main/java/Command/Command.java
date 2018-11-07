package Command;

import Controller.MainForm;

public abstract class Command {
    public MainForm saveForm;
  //  private String backup;

    Command(MainForm saveForm){
        this.saveForm = saveForm;
    }

    public abstract boolean execute();
}