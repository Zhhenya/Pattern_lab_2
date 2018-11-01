package Controller;

import ChooseTeam.KeyWords;
import Outfit.CreateOutfit;
import Outfit.GetterOutfit;
import Outfit.Outfit;
import Outfit.OutfitBuilder;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class OutfitForm {
    public Pane simpleBroomPane;
    public Pane simpleCloakPane;
    public Pane speedBroomPane;
    public Pane protectedCloakPane;
    public RadioButton simpleBroomRaioButton;
    public RadioButton speedBroomRadioButton;
    public RadioButton simpleCloakRadioButton;
    public RadioButton protectedCloakRadioButton;
    public Button selectButton;
    public KeyWords selectedBroom = null;
    public KeyWords selectedCloak = null;
    GetterOutfit getterOutfit;
    OutfitBuilder builder;
    Outfit outfit;
    Stage stage;


    ToggleGroup broomToggleGroup = new ToggleGroup();
    ToggleGroup cloakToggleGroup = new ToggleGroup();


    private CreateOutfit createOutfit;

    public void initialize(){


        /*
        * фон пейнов
        * */
        simpleBroomPane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        simpleCloakPane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        speedBroomPane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        protectedCloakPane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));


        /*
        * инициализация pain картинками
        * */
        simpleBroomPane.getChildren().add(new ImageView(new Image("broom/simpleBroom.jpg")));
        speedBroomPane.getChildren().add(new ImageView(new Image("broom/advancedBroom.jpg")));
        simpleCloakPane.getChildren().add(new ImageView(new Image("cloak/simpleCloak.png")));
        protectedCloakPane.getChildren().add(new ImageView(new Image("cloak/advancedCloak.jpg")));


        /*
        * добавление в ToggleGroup
        * */
        simpleBroomRaioButton.setToggleGroup(broomToggleGroup);
        simpleBroomRaioButton.setSelected(true);
        speedBroomRadioButton.setToggleGroup(broomToggleGroup);

        simpleCloakRadioButton.setToggleGroup(cloakToggleGroup);
        simpleCloakRadioButton.setSelected(true);
        protectedCloakRadioButton.setToggleGroup(cloakToggleGroup);

        getterOutfit = new GetterOutfit();
        builder = new OutfitBuilder();
    }

/*

    public void simpleOutfitButtonClick(ActionEvent actionEvent) {
        createOutfit = new OutfitSBSC();
        createOutfit.createBroom();
        createOutfit.createCloak();
        broomPane.getChildren().add(((OutfitSBSC) createOutfit).getBroom().getImageView());
        cloakPane.getChildren().add(((OutfitSBSC) createOutfit).getCloak().getImageView());

    }

    public void advancedOutfitButtonClick(ActionEvent actionEvent) {
        createOutfit = new OutfitABAC();
        createOutfit.createBroom();
        createOutfit.createCloak();
        broomPane.getChildren().add(((OutfitABAC) createOutfit).getBroom().getImageView());
        cloakPane.getChildren().add(((OutfitABAC) createOutfit).getCloak().getImageView());
    }
*/

    public CreateOutfit getGetterOutfit() {
        return createOutfit;
    }

    public void selectButtonClick(ActionEvent actionEvent) {
        RadioButton tempButton = (RadioButton) broomToggleGroup.getSelectedToggle();


        if(tempButton.getText().compareTo("стандартная метла") == 0){
            tempButton = (RadioButton)cloakToggleGroup.getSelectedToggle();
            if(tempButton.getText().compareTo("стандартная мантия") == 0) {
                getterOutfit.createSimpleBroomSimpleCloak(builder);
                outfit = builder.getResult();
                stage = (Stage)selectButton.getScene().getWindow();
                stage.close();
            }
            if(tempButton.getText().compareTo("защитная мантия") == 0){
                getterOutfit.createSimpleBroomProtectedCloak(builder);
                outfit = builder.getResult();
                stage = (Stage)selectButton.getScene().getWindow();
                stage.close();
            }
        } else {
            tempButton = (RadioButton)broomToggleGroup.getSelectedToggle();
            if (tempButton.getText().compareTo("скоростная метла") == 0) {
                tempButton = (RadioButton)cloakToggleGroup.getSelectedToggle();
                if (tempButton.getText().compareTo("стандартная мантия") == 0) {
                    getterOutfit.createSpeedBroomSimpleCloak(builder);
                    outfit = builder.getResult();
                    stage = (Stage) selectButton.getScene().getWindow();
                    stage.close();
                }
                if (tempButton.getText().compareTo("защитная мантия") == 0) {
                    getterOutfit.createSpeedBroomProtectedCloak(builder);
                    outfit = builder.getResult();
                    stage = (Stage) selectButton.getScene().getWindow();
                    stage.close();
                }
            }
        }
    }

    public void protectedCloakRadioButtonClick(ActionEvent actionEvent) {
    }

    public void simpleCloakRadioButtonClick(ActionEvent actionEvent) {
    }

    public void speedBroomRadioButtonClick(ActionEvent actionEvent) {
    }

    public void simpleBroomRaioButtonClick(ActionEvent actionEvent) {
    }
}