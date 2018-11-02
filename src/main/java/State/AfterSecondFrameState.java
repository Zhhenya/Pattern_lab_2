package State;

import Controller.MainForm;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import poolBox.Pool;

public class AfterSecondFrameState extends State {
    AfterSecondFrameState(MainForm form) {
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
        form.remove();
        form.dialog.setText("Выпускаем мячи. Игра началась");
        ImageView imageView = new ImageView(new Image("images/stadionjpg.jpg"));
        imageView.setLayoutX(150);
        form.pane.getChildren().add(imageView);
        form.facade.getListOfMagicAttribute();

        form.facade.afterSecondFrame();

        form.facade.getBox().remove(form.facade.getSnitch());
        form.facade.getBox().remove(form.facade.getBladgerFirst());
        form.facade.getBox().remove(form.facade.getBladgerSecond());
        form.facade.getBox().remove(form.facade.getQuaffle());
        form.facade.getBox().addInUsed(form.facade.getSnitch(), form.facade.getBladgerFirst(), form.facade.getBladgerSecond(), form.facade.getQuaffle());

        form.findAllMagicAttributesFree(Pool.getPool());
        form.findAllMagicAttributesUsed(Pool.getPool());


        form.changeState(new ThirdFrameState(form));
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