package State;

import Controller.MainForm;

public class SixFrameState extends State {
    SixFrameState(MainForm form) {
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

    }

    @Override
    public void sixFrame() {
        form.remove();
        form.facade.applyDecoratorDangerous(form.facade.getSnitch());
        form.pane.getChildren().add(form.facade.getSnitch().getImageView());
        form.characteristics.setText("\n");
        form.getInfoAboutBall(form.facade.getSnitch());
        form.countOfFrames++;
    }
}