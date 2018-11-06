package Controller;

import Outfit.CreateOutfit;
import Outfit.GetterOutfit;
import Outfit.Outfit;
import Outfit.OutfitBuilder;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class OutfitForm {
    public Pane simpleBroomPane;
    public Pane simpleCloakPane;
    public Pane speedBroomPane;
    public Pane protectedCloakPane;
    public RadioButton simpleBroomRadioButton;
    public RadioButton speedBroomRadioButton;
    public RadioButton simpleCloakRadioButton;
    public RadioButton protectedCloakRadioButton;
    public Button selectButton;
    public AnchorPane anchorPane;
    public Pane resultPaneBroom;
    public Pane resultPaneCloak;
    public Label broomLabel;
    public Label cloakLabel;
    GetterOutfit getterOutfit;
    OutfitBuilder builder;
    Outfit outfit;
    Stage stage;


    ToggleGroup broomToggleGroup = new ToggleGroup();
    ToggleGroup cloakToggleGroup = new ToggleGroup();


    private CreateOutfit createOutfit;

    public void initialize(){
        anchorPane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));


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


        cloakLabel.setText(simpleCloakRadioButton.getText());
        ImageView imageView = new ImageView(new Image("cloak/simpleCloakMini.png"));
        imageView.setLayoutY(25);
        resultPaneCloak.getChildren().add(imageView);

        broomLabel.setText(simpleBroomRadioButton.getText());
        imageView = new ImageView(new Image("broom/simpleBroomMini.jpg"));
        imageView.setLayoutY(25);
        resultPaneBroom.getChildren().add(imageView);

        /*
        * добавление в ToggleGroup
        * */
        simpleBroomRadioButton.setToggleGroup(broomToggleGroup);
        simpleBroomRadioButton.setSelected(true);
        speedBroomRadioButton.setToggleGroup(broomToggleGroup);

        simpleCloakRadioButton.setToggleGroup(cloakToggleGroup);
        simpleCloakRadioButton.setSelected(true);
        protectedCloakRadioButton.setToggleGroup(cloakToggleGroup);

        getterOutfit = new GetterOutfit();
        builder = new OutfitBuilder();
    }

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
        resultPaneCloak.getChildren().clear();
        cloakLabel.setText(protectedCloakRadioButton.getText());
        ImageView imageView = new ImageView(new Image("cloak/advancedCloakMini.jpg"));
        imageView.setLayoutY(25);
        resultPaneCloak.getChildren().addAll(cloakLabel, imageView);
    }

    public void simpleCloakRadioButtonClick(ActionEvent actionEvent) {
        resultPaneCloak.getChildren().clear();
        cloakLabel.setText(simpleCloakRadioButton.getText());
        ImageView imageView = new ImageView(new Image("cloak/simpleCloakMini.png"));
        imageView.setLayoutY(25);
        resultPaneCloak.getChildren().addAll(cloakLabel, imageView);
    }

    public void speedBroomRadioButtonClick(ActionEvent actionEvent) {
        resultPaneBroom.getChildren().clear();
        broomLabel.setText(speedBroomRadioButton.getText());
        ImageView imageView = new ImageView(new Image("broom/advancedBroomMini.jpg"));
        imageView.setLayoutY(25);
        resultPaneBroom.getChildren().addAll(broomLabel, imageView);
    }


    public void simpleBroomRaioButtonClick(ActionEvent actionEvent) {
        resultPaneBroom.getChildren().clear();
        broomLabel.setText(simpleBroomRadioButton.getText());
        ImageView imageView = new ImageView(new Image("broom/simpleBroomMini.jpg"));
        imageView.setLayoutY(25);
        resultPaneBroom.getChildren().addAll(broomLabel, imageView);

    }
}