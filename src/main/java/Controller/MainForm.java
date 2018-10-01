package Controller;

import Box.BoxForMagicAttributes;
import Box.BoxIterator;
import Characters.Catcher;
import Characters.CatcherAdapter;
import MagicAtributes.*;
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
    Catcher catcher = new Catcher();
    Snitch snitch = new Snitch();
    Quaffle quaffle = new Quaffle();
    Bladger bladgerFirst = new Bladger();
    Bladger bladgerSecond = new Bladger();
    BoxForMagicAttributes boxForMagicAttributes = new BoxForMagicAttributes();


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

        }
    }


    @FXML
    private void initialize() {
        pane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        ImageView imageView = new ImageView(new Image("images/say.jpg"));
        imageView.setLayoutX(150);
        pane.getChildren().add(imageView);
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
   /*     ImageView imageView = new ImageView(new Image("images/magic.gif"));
        imageView.setLayoutX(150);
        pane.getChildren().addAll(imageView);
*/
        CatcherAdapter catcherAdapter = new CatcherAdapter(catcher);
        catcherAdapter.addHealth();
        catcher.setImageView(new ImageView(new Image("images/harry.png")));
        catcher.getImage().setLayoutX(150);
        catcher.getImage().setLayoutY(50);
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
        findAllMagicAttributes();
        countOfFrames++;

    }

    private void findAllMagicAttributes(){
        BoxIterator boxIterator = boxForMagicAttributes.createBoxIterator();
        boxIterator.setBoxForMagicAttributes(boxForMagicAttributes);
        while(boxIterator.hasNext()) {
            MagicAttributes attributes = boxIterator.getNext();
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
        characteristics.setText("\n\n");
        getInfoAboutBall(snitch);
        DecoratorForBalls decoratorForBalls = new DecoratorForBallDangerous(snitch);
        ((DecoratorForBallDangerous) decoratorForBalls).addDangerous(4);
        countOfFrames++;
    }

    public void forthFrame() {
        remove();
        dialog.setText("Кто-то заколдовал снитч!");
        snitch.setImageView(new ImageView(new Image("characters/balls/snitch3.gif")));
        snitch.getImageView().setLayoutX(50);
        snitch.getImageView().setLayoutY(-20);
        characteristics.setText("\n");
        getInfoAboutBall(snitch);
        pane.getChildren().add(snitch.getImageView());
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
      //  characteristics.setText("");
        characteristics.appendText("Мяч\n");
        characteristics.appendText("Название: " + balls.getBallName() + "\n");
        characteristics.appendText("Размер: " + balls.getBallSize() + "\n");
        characteristics.appendText("Количество очков: " + balls.getPoints()+ "\n");
        characteristics.appendText("Опасность: "  + balls.getDangerous() + "\n");
    }


    private void getListOfMagicAttribute(){
        BoxForMagicAttributes box = new BoxForMagicAttributes();
        box.setBoxName("Мячи для тренировок");
        Snitch snitch1 =  new Snitch();
        snitch1.setBallName("Снитч тренировочный");
        snitch1.setBallSize(10);
        snitch1.setDangerous(3);
        snitch1.setPoints(150);

        Bladger bladger1 =  new Bladger();
        bladger1.setBallName("Бладжер 1 тренировочный");
        bladger1.setBallSize(40);
        bladger1.setDangerous(45);
        bladger1.setPoints(2);

        Bladger bladger2 =  new Bladger();
        bladger2.setBallName("Бладжер 2 тренировочный");
        bladger2.setBallSize(55);
        bladger2.setDangerous(50);
        bladger2.setPoints(2);

        Quaffle quaffle1 = new Quaffle();
        quaffle1.setBallName("Квофл тренировочный");
        quaffle1.setBallSize(25);
        quaffle1.setDangerous(10);
        quaffle1.setPoints(10);


        box.add(snitch1, bladger1, bladger2, quaffle1);
        snitch.setBallName("Снитч игровой");
        bladgerFirst.setBallName("Бладжер игровой (черный)");
        bladgerSecond.setBallName("Бладжер игровой (красный)");
        quaffle.setBallName("Квофл игровой");
        boxForMagicAttributes.add(snitch, quaffle, bladgerFirst, bladgerSecond);
    }



}