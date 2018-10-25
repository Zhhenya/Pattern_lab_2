package Controller;

import Outfit.AdvancedOutfit;
import Outfit.CreateOutfit;
import Outfit.SimpleOutfit;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class OutfitForm {

    public Pane broomPane;
    public Pane cloakPane;
    public Button simpleOutfitButton;
    public Button advancedOutfitButton;

    private CreateOutfit outfit;

    public void initialize(){
        broomPane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        cloakPane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
    }


    public void simpleOutfitButtonClick(ActionEvent actionEvent) {
        outfit = new SimpleOutfit();
        outfit.createBroom();
        outfit.createCloak();
        broomPane.getChildren().add(((SimpleOutfit)outfit).getBroom().getImageView());
        cloakPane.getChildren().add(((SimpleOutfit)outfit).getCloak().getImageView());

    }

    public void advancedOutfitButtonClick(ActionEvent actionEvent) {
        outfit = new AdvancedOutfit();
        outfit.createBroom();
        outfit.createCloak();
        broomPane.getChildren().add(((AdvancedOutfit)outfit).getBroom().getImageView());
        cloakPane.getChildren().add(((AdvancedOutfit)outfit).getCloak().getImageView());
    }

    public CreateOutfit getOutfit() {
        return outfit;
    }
}