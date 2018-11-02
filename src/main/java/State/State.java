package State;

import Characters.Character;
import Controller.MainForm;
import MagicAtributes.MagicAttributes;
import javafx.stage.Stage;
import poolBox.Pool;

public abstract class State {
    MainForm form;

    State(MainForm form){
        this.form = form;
    }

    public State getState(){
        return this;
    }

    abstract public void firstFrame();

    abstract public void secondFrame();

    abstract public void afterSecondFrame();

    abstract public void thirdFrame();

    abstract public void forthFrame();

    abstract public void fifthFrame();

    abstract public void sixFrame();



}
