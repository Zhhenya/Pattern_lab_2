package UI;

import Characters.Catcher;
import MagicAtributes.Bladger;
import MagicAtributes.Quaffle;
import MagicAtributes.Snitch;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class GUI implements UI{
    Catcher catcher = new Catcher();
    Snitch snitch = new Snitch();
    Quaffle quaffle = new Quaffle();
    Bladger bladgerFirst = new Bladger();
    Bladger bladgerSecond = new Bladger();
    ImageView imageView;

    public Catcher getCatcher() {
        return catcher;
    }

    public void setCatcher(Catcher catcher) {
        this.catcher = catcher;
    }

    public Snitch getSnitch() {
        return snitch;
    }

    public void setSnitch(Snitch snitch) {
        this.snitch = snitch;
    }

    public Quaffle getQuaffle() {
        return quaffle;
    }

    public void setQuaffle(Quaffle quaffle) {
        this.quaffle = quaffle;
    }

    public Bladger getBladgerFirst() {
        return bladgerFirst;
    }

    public void setBladgerFirst(Bladger bladgerFirst) {
        this.bladgerFirst = bladgerFirst;
    }

    public Bladger getBladgerSecond() {
        return bladgerSecond;
    }

    public void setBladgerSecond(Bladger bladgerSecond) {
        this.bladgerSecond = bladgerSecond;
    }

    public ImageView getImageView() {
        return imageView;
    }

    @Override
    public void startGame() {
        imageView = new ImageView(new Image("images/say.jpg"));
        imageView.setLayoutX(150);
    }

    @Override
    public void getInfoAboutPlayer() {

    }

    @Override
    public void getInfoAboutBall() {

    }

    @Override
    public void getInfoAboutBox() {

    }


}