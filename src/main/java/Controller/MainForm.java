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
import UI.UI;
import javafx.event.ActionEvent;
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

public class MainForm implements UI {
    public Button nextButton;
    public Pane pane;
    public TextArea dialog;
    public TextArea characteristics;
    public Button outfitButton;
    public Button saveButton;
    private int countOfFrames;
    TeamForm teamForm;
    OutfitForm outfitForm;
    Outfit outfit;


    private Facade facade;


    public void setFacade(Facade facade) {
        this.facade = facade;
    }


    public void nextFrame(ActionEvent actionEvent) {

        if(outfitForm!= null && outfitForm.outfit != null && outfit == null){
            outfit = outfitForm.outfit;
            outfitForm.outfit = null;
            outfitButton.setVisible(false);
        } else
            if(outfitForm == null && outfitForm.outfit == null && outfit == null ){
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


        switch (countOfFrames) {
            case 1: firstFrame();
                break;
            case 2: secondFrame();
                break;
            case 3: afterSecondFrame();
                break;
            case 4: thirdFrame();
                break;
            case 5: forthFrame();
                break;
            case 6: fifthFrame();
                break;
            case 7:sixFrame();
                break;
            case 8:sixFrame();
                break;

        }
    }

    public void initialize() {
        pane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        ImageView imageView = new ImageView(new Image("images/say.jpg"));
        imageView.setLayoutX(150);
        pane.getChildren().add(imageView);
        dialog.setText("Объявляю матч открытым!!!");
        countOfFrames++;
    }

    public void firstFrame() {
        remove();
        facade.first();
        pane.getChildren().addAll(facade.getImageView(), facade.getCatcher().getImage());
        dialog.setText("Гарри, ты кажется не здоров...\nТы не можешь играть в таком состоянии!!!");
        getInfoAboutPlayer(facade.getCatcher());
        countOfFrames++;
    }

    public void secondFrame() {
        remove();
        remove();
        facade.second();
        getInfoAboutPlayer(facade.getCatcher());
        pane.getChildren().addAll(facade.getCatcher().getImage());
        dialog.setText("Он может играть Теперь игроки готовы!!! \n Выпускаем мячи. Игра началась");
        countOfFrames++;
    }

    public void afterSecondFrame(){
        remove();
        dialog.setText("Выпускаем мячи. Игра началась");
        ImageView imageView = new ImageView(new Image("images/stadionjpg.jpg"));
        imageView.setLayoutX(150);
        pane.getChildren().add(imageView);
        facade.getListOfMagicAttribute();
        findAllMagicAttributes(Pool.getPool());
        facade.playGame();
        countOfFrames++;

    }

    @Override
    public void findAllMagicAttributes(BoxIterator boxIterator){
       /* characteristics.appendText("\n\n" + boxIterator.getBox().getBoxName() + "\n");
        while(boxIterator.hasNext()) {
            MagicAttributes attributes = boxIterator.getNext();
            BoxIterator boxIterator1 = attributes.createBoxIterator();
            if(boxIterator1 != null) {
                boxIterator1.setBoxForMagicAttributes((BoxForMagicAttributes) attributes);
                findAllMagicAttributes(boxIterator1);
            }
            else
                getInfoAboutBall(attributes);
        }*/
    }

    public void findAllMagicAttributes(Pool pool){
        characteristics.appendText("\n\n" + "коробка" + "\n");
        for(MagicAttributes attributes : Pool.magicAttributes)
            getInfoAboutBall(attributes);
    }

    public void thirdFrame() {
        remove();
        facade.third();
        pane.getChildren().add(facade.getSnitch().getImageView());
        dialog.setText("Ой! Что это?");
        characteristics.setText("");
        getInfoAboutBall(facade.getSnitch());
        countOfFrames++;
    }

    public void forthFrame() {
        remove();
        dialog.setText("Кто-то заколдовал снитч!");
        facade.applyDecoratorDangerous(facade.getSnitch());
        pane.getChildren().add(facade.getSnitch().getImageView());
        characteristics.setText("\n");
        getInfoAboutBall(facade.getSnitch());
        countOfFrames++;

    }
    public void fifthFrame(){
        remove();
        facade.applyDecoratorMinus(facade.getSnitch());
        pane.getChildren().add(facade.getSnitch().getImageView());
        characteristics.setText("");
        getInfoAboutBall(facade.getSnitch());
        countOfFrames++;
    }
    public void sixFrame(){
        remove();
        facade.applyDecoratorDangerous(facade.getSnitch());
        pane.getChildren().add(facade.getSnitch().getImageView());
        characteristics.setText("\n");
        getInfoAboutBall(facade.getSnitch());
        countOfFrames++;
    }

    private void remove() {
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