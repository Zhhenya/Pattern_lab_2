package State;

import Controller.MainForm;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ThirdFrameState extends State {
    ThirdFrameState(MainForm form) {
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
        form.remove();
        form.facade.third();
        form.pane.getChildren().add(form.facade.getSnitch().getImageView());
        form.dialog.setText("Ой! Что это?");
        form.characteristics.setText("");
        form.getInfoAboutBall(form.facade.getSnitch());

        form.changeState(new ForthFrameState(form));

    }

    @Override
    public void forthFrame() {

    }

    @Override
    public void fifthFrame() {

    }

    @Override
    public void sixFrame() {

    }
}