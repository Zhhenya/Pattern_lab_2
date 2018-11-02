package State;

import Controller.MainForm;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ForthFrameState extends State {
    ForthFrameState(MainForm form) {
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
        form.remove();
        form.dialog.setText("Кто-то заколдовал снитч!");
        form.facade.applyDecoratorDangerous(form.facade.getSnitch());
        form.pane.getChildren().add(form.facade.getSnitch().getImageView());
        form.characteristics.setText("\n");
        form.getInfoAboutBall(form.facade.getSnitch());

        form.changeState(new FifthFrameState(form));


    }

    @Override
    public void fifthFrame() {

    }

    @Override
    public void sixFrame() {

    }
}