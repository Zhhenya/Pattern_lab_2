package State;

import Controller.MainForm;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import sun.applet.Main;

public class SecondFrameState extends State {
    SecondFrameState(MainForm form) {
        super(form);
    }

    @Override
    public void firstFrame() {
    }

    @Override
    public void secondFrame() {
        form.remove();
        form.remove();
        form.facade.second();
        form.getInfoAboutPlayer(form.facade.getCatcher());
        form.pane.getChildren().addAll(form.facade.getCatcher().getImage());
        form.dialog.setText("Он может играть Теперь игроки готовы!!! \n Выпускаем мячи. Игра началась");

        form.changeState( new AfterSecondFrameState(form));


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