package Controller;

import Box.BoxForMagicAttributes;
import Box.BoxIterator;
import Characters.Catcher;
import Characters.Character;
import Characters.HealthAdapterForPlayer;
import MagicAtributes.*;
import UI.UI;
import javafx.event.ActionEvent;
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

public class MainForm implements UI {
    public Button nextButton;
    public Pane pane;
    public TextArea dialog;
    public TextArea characteristics;
    private int countOfFrames;


    private Facade facade;


    public void setFacade(Facade facade) {
        this.facade = facade;
    }


    public void nextFrame(ActionEvent actionEvent) {
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
        BoxIterator boxIterator = facade.afterSecondFrame();
        pane.getChildren().add(facade.getImageView());
        facade.getListOfMagicAttribute();
        findAllMagicAttributes(boxIterator);
        countOfFrames++;

    }

    @Override
    public void findAllMagicAttributes(BoxIterator boxIterator){
        characteristics.appendText("\n\n" + boxIterator.getBox().getBoxName() + "\n");
        while(boxIterator.hasNext()) {
            MagicAttributes attributes = boxIterator.getNext();
            BoxIterator boxIterator1 = attributes.createBoxIterator();
            if(boxIterator1 != null) {
                boxIterator1.setBoxForMagicAttributes((BoxForMagicAttributes) attributes);
                findAllMagicAttributes(boxIterator1);
            }
            else
                getInfoAboutBall(attributes);
        }
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
}