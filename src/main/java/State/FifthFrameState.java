package State;

import Controller.MainForm;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class FifthFrameState extends State{
    FifthFrameState(MainForm form) {
        super(form);
    }

    @Override
    public void firstFrame() {

    }

    @Override
    public void secondFrame() {

    }

    @Override
    public void afterSecondFrame() {

    }

    @Override
    public void thirdFrame() {

    }

    @Override
    public void forthFrame() {

    }

    @Override
    public void fifthFrame() {
        form.remove();
        form.facade.applyDecoratorMinus(form.facade.getSnitch());
        form.pane.getChildren().add(form.facade.getSnitch().getImageView());
        form.characteristics.setText("");
        form.getInfoAboutBall(form.facade.getSnitch());

        form.changeState(new SixFrameState(form));

    }

    @Override
    public void sixFrame() {

    }
}