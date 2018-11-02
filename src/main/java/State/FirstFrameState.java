package State;

import Controller.MainForm;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class FirstFrameState extends State {
    public FirstFrameState(MainForm form) {
        super(form);
    }

    @Override
    public void firstFrame() {
        form.remove();
        form.facade.first();
        form.pane.getChildren().addAll(form.facade.getImageView(), form.facade.getCatcher().getImage());
        form.dialog.setText("Гарри, ты кажется не здоров...\nТы не можешь играть в таком состоянии!!!");
        form.getInfoAboutPlayer(form.facade.getCatcher());

        form.changeState(new SecondFrameState(form));
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
    }

    @Override
    public void sixFrame() {
    }
}