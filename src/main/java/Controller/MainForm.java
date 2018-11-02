package Controller;

import Box.BoxForMagicAttributes;
import Box.BoxIterator;
import Characters.Catcher;
import Characters.Character;
import Characters.HealthAdapterForPlayer;
import ChooseTeam.*;
import MagicAtributes.*;
import Outfit.GetterOutfit;
import Outfit.Outfit;
import State.FirstFrameState;
import State.*;
import UI.UI;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import poolBox.Pool;

import java.io.IOException;

public class MainForm{
    public Button nextButton;

    public State state;
    public Pane pane;
    public TextArea dialog;
    public TextArea characteristics;
    public int countOfFrames;
    public TeamForm teamForm;
    public OutfitForm outfitForm;
    public Outfit outfit;

    public Facade facade;
    public Button outfitButton;

    public void setFacade(Facade facade) {
        this.facade = facade;
    }

    public void changeState(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }



    public void nextFrame(ActionEvent actionEvent) {

        if(outfitForm!= null && outfitForm.outfit != null && outfit == null){
            outfit = outfitForm.outfit;
            outfitButton.setVisible(false);
        } else if(outfitForm == null && outfitForm.outfit == null && outfit == null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Что-то пошло не так!!!");
            alert.setHeaderText(null);
            alert.setContentText("Вы не выбрали экипировку");
            alert.show();
            return;
        }

        if(teamForm != null && teamForm.getTeam() != null) {
            if (teamForm.getTeam() == KeyWords.Griffindor) {
                ChooseTeam chooseTeam = new Griffindor();
                facade.setTeam(((Griffindor) chooseTeam).createTeam());
            }
            if (teamForm.getTeam() == KeyWords.Slitherin) {
                ChooseTeam chooseTeam = new Slitherin();
                facade.setTeam(((Slitherin) chooseTeam).createTeam());
            }
        }

        if(facade.getTeam() == null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Что-то пошло не так!!!");
            alert.setHeaderText(null);
            alert.setContentText("Вы не выбрали команду");
            alert.show();
            return;
        }


    }

    public void initialize() {
        pane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        ImageView imageView = new ImageView(new Image("images/say.jpg"));
        imageView.setLayoutX(150);
        pane.getChildren().add(imageView);
        dialog.setText("Объявляю матч открытым!!!");

        changeState(new FirstFrameState(this));

        nextButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getState().firstFrame();

                nextButton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        getState().secondFrame();

                        nextButton.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                getState().afterSecondFrame();

                                nextButton.setOnAction(new EventHandler<ActionEvent>() {
                                    @Override
                                    public void handle(ActionEvent event) {
                                        getState().thirdFrame();

                                        nextButton.setOnAction(new EventHandler<ActionEvent>() {
                                            @Override
                                            public void handle(ActionEvent event) {
                                                getState().forthFrame();

                                                nextButton.setOnAction(new EventHandler<ActionEvent>() {
                                                    @Override
                                                    public void handle(ActionEvent event) {
                                                        getState().fifthFrame();

                                                        nextButton.setOnAction(new EventHandler<ActionEvent>() {
                                                            @Override
                                                            public void handle(ActionEvent event) {
                                                                getState().sixFrame();
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });

    }


    public void findAllMagicAttributesFree(Pool pool){
        characteristics.appendText("\n\n" + "Мячи в коробке" + "\n");
        for(MagicAttributes attributes : pool.magicAttributesFree)
            getInfoAboutBall(attributes);
    }

    public void findAllMagicAttributesUsed(Pool pool){
        characteristics.appendText("\n\n" + "Мячи на поле" + "\n");
        for(MagicAttributes attributes : pool.magicAttributesUsed)
            getInfoAboutBall(attributes);
    }

    public void remove() {
        pane.getChildren().remove(pane.getChildren().size() - 1);
    }
    public void getInfoAboutPlayer(Character character){
        characteristics.setText("Игрок\n");
        characteristics.appendText("Имя: " + character.getNamePlayer() + "\n");
        characteristics.appendText("Позиция: " + character.getNameCharacterPosition() + "\n");
        characteristics.appendText("Здоровье: "  + character.getHealth() + "\n");
    }
    public void getInfoAboutBall(MagicAttributes balls){
        characteristics.appendText("Мяч\n");
        characteristics.appendText("Название: " + balls.getBallName() + "\n");
        characteristics.appendText("Размер: " + balls.getBallSize() + "\n");
        characteristics.appendText("Количество очков: " + balls.getPoints()+ "\n");
        characteristics.appendText("Опасность: "  + balls.getDangerous() + "\n");
    }

    public void chooseOutfit(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/forms/outfitForm.fxml"));
        Parent root = null;
        try {
            root = loader.load();
            outfitForm = loader.getController();
            Scene scene = new Scene(root);
            Stage changeOutfitWindow = new Stage();
            changeOutfitWindow.setScene(scene);
            changeOutfitWindow.show();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}