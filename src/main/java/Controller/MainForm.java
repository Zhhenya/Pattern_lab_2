package Controller;

import Box.BoxForMagicAttributes;
import Box.BoxIterator;
import Characters.Catcher;
import Characters.HealthAdapterForPlayer;
import MagicAtributes.*;
import UI.GUI;
import UI.UI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

public class MainForm {
    public Button nextButton;
    public Pane pane;
    public TextArea dialog;
    public TextArea characteristics;
    private int countOfFrames;

    GUI ui = new GUI();

   /* Catcher catcher = new Catcher();
    Snitch snitch = new Snitch();
    Quaffle quaffle = new Quaffle();
    Bladger bladgerFirst = new Bladger();
    Bladger bladgerSecond = new Bladger();
    BoxForMagicAttributes boxForMagicAttributes = new BoxForMagicAttributes();*/
    private Facade facade = new Facade();


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


    @FXML
    private void initialize() {
      /*  pane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        ImageView imageView = new ImageView(new Image("images/say.jpg"));
        imageView.setLayoutX(150);
        pane.getChildren().add(imageView); */

        ui.startGame();
        pane.getChildren().add(ui.getImageView());
        dialog.setText("Объявляю матч открытым!!!");
        countOfFrames++;
    }

    public void firstFrame() {
        remove();
        ImageView imageView = new ImageView(new Image("images/images.jpg"));
        catcher.setImageView(new ImageView(new Image("images/1.jpg")));
        catcher.getImage().setLayoutY(30);
        catcher.setNamePlayer("Гарри Поттер");

        imageView.setLayoutX(450);
        imageView.setLayoutY(30);
        pane.getChildren().addAll(imageView, catcher.getImage());
        dialog.setText("Гарри, ты кажется не здаров...\nТы не можешь играть в таком состоянии!!!");
        getInfoAboutCatcher();
        countOfFrames++;
    }

    public void secondFrame() {
        remove();
        remove();
        facade.applyAdapter(catcher, new ImageView(new Image("images/harry.png")));
        getInfoAboutCatcher();
        pane.getChildren().addAll(catcher.getImage());
        dialog.setText("Он может играть Теперь игроки готовы!!! \n Выпускаем мячи. Игра началась");
        countOfFrames++;
    }

    public void afterSecondFrame(){
        remove();
        dialog.setText("Выпускаем мячи. Игра началась");
        ImageView imageView = new ImageView(new Image("images/stadionjpg.jpg"));
        imageView.setLayoutX(100);
        imageView.setLayoutY(50);
        pane.getChildren().add(imageView);
        getListOfMagicAttribute();
        BoxIterator boxIterator = boxForMagicAttributes.createBoxIterator();
        boxForMagicAttributes.setBoxName("Общая коробка");
        boxIterator.setBoxForMagicAttributes(boxForMagicAttributes);
        findAllMagicAttributes(boxIterator);
        countOfFrames++;

    }

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
        snitch.setImageView(new ImageView(new Image("characters/balls/snitch1.gif")));
        snitch.getImageView().setLayoutY(50);
        snitch.getImageView().setLayoutX(250);
        pane.getChildren().add(snitch.getImageView());
        dialog.setText("Ой! Что это?");
        characteristics.setText("");
        getInfoAboutBall(snitch);
        countOfFrames++;
    }

    public void forthFrame() {
        remove();
        dialog.setText("Кто-то заколдовал снитч!");
        facade.applyDecoratorDangerous(snitch);
        pane.getChildren().add(snitch.getImageView());
        characteristics.setText("\n");
        getInfoAboutBall(snitch);
        countOfFrames++;

    }
    public void fifthFrame(){
        remove();
        facade.applyDecoratorMinus(snitch);
        pane.getChildren().add(snitch.getImageView());
        characteristics.setText("");
        getInfoAboutBall(snitch);
        countOfFrames++;
    }
    public void sixFrame(){
        remove();
        facade.applyDecoratorDangerous(snitch);
        pane.getChildren().add(snitch.getImageView());
        characteristics.setText("\n");
        getInfoAboutBall(snitch);
        countOfFrames++;
    }

    private void remove() {
        pane.getChildren().remove(pane.getChildren().size() - 1);
    }

    private void getInfoAboutCatcher(){
        characteristics.setText("Игрок\n");
        characteristics.appendText("Имя: " + catcher.getNamePlayer() + "\n");
        characteristics.appendText("Позиция: " + catcher.getNameCharacterPosition() + "\n");
        characteristics.appendText("Здоровье: "  + catcher.getHealth() + "\n");
    }
    public void getInfoAboutBall(MagicAttributes balls){
        characteristics.appendText("Мяч\n");
        characteristics.appendText("Название: " + balls.getBallName() + "\n");
        characteristics.appendText("Размер: " + balls.getBallSize() + "\n");
        characteristics.appendText("Количество очков: " + balls.getPoints()+ "\n");
        characteristics.appendText("Опасность: "  + balls.getDangerous() + "\n");
    }

  /*  public void getInfoAboutBallConsole(MagicAttributes balls){
        //  characteristics.setText("");
        System.out.println("Мяч\n");
        System.out.println("Название: " + balls.getBallName());
        System.out.println("Размер: " + balls.getBallSize());
        System.out.println("Количество очков: " + balls.getPoints());
        System.out.println("Опасность: "  + balls.getDangerous());
    }*/


    private void getListOfMagicAttribute(){
        BoxForMagicAttributes box = new BoxForMagicAttributes();
        box.setBoxName("Мячи для тренировок");
        Snitch snitch1 =  new Snitch();
        Bladger bladger1 =  new Bladger();
        Bladger bladger2 =  new Bladger();
        Quaffle quaffle1 = new Quaffle();

        facade.createBallForOneTraining(snitch1, bladger1, bladger2, quaffle1);
        box.add(snitch1, bladger1, bladger2, quaffle1);
        facade.createBallForOneGame(snitch, bladgerFirst, bladgerSecond, quaffle);
        boxForMagicAttributes.add(snitch, quaffle, bladgerFirst, bladgerSecond, box);
    }





}