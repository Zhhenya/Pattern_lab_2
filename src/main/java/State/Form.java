/*
package State;

import Controller.Facade;
import Controller.OutfitForm;
import Controller.TeamForm;
import Outfit.Outfit;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Form {
    private State state;


    public Button nextButton;
    public Pane pane;
    public TextArea dialog;
    public TextArea characteristics;
    public int countOfFrames;
    public OutfitForm outfitForm;
    public Outfit outfit;
    public Facade facade;


    public Form(){
        this.state = new FirstFrameState(this);


        pane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        ImageView imageView = new ImageView(new Image("images/say.jpg"));
        imageView.setLayoutX(150);
        pane.getChildren().add(imageView);
        dialog.setText("Объявляю матч открытым!!!");
        countOfFrames++;
    }

    public void changeState(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }


}*/
