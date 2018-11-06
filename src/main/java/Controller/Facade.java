package Controller;

import Box.BoxForMagicAttributes;
import Box.BoxIterator;
import Characters.*;
import Characters.Character;
import ChooseTeam.ChooseTeam;
import MagicAtributes.*;
import Properties.BreakProperties.BreakByBall;
import Properties.FlyProperties.FlyForBall;
import Properties.KillProperties.KillWithABall;
import Teams.Team;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import poolBox.Pool;

import java.util.List;
import java.util.Random;

public class Facade {
   // Catcher catcher = new Catcher();
    Snitch snitch = new Snitch();
    Quaffle quaffle = new Quaffle();
    Bladger bladgerFirst = new Bladger();
    Bladger bladgerSecond = new Bladger();
    Team team;
    Pool box = Pool.getPool();
   // BoxForMagicAttributes boxForMagicAttributes = new BoxForMagicAttributes();
    ImageView imageView;



    public Team getTeam() {
        return team;
    }


    public void setTeam(Team team) {
        this.team = team;
    }

    public Facade(){

    }

    public Catcher getCatcher() {
        return team.catcher;
    }

    public void setCatcher(Catcher catcher) {
        team.catcher = catcher;
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

    /*public BoxForMagicAttributes getBoxForMagicAttributes() {
        return boxForMagicAttributes;
    }*/

    /*public void setBoxForMagicAttributes(BoxForMagicAttributes boxForMagicAttributes) {
        this.boxForMagicAttributes = boxForMagicAttributes;
    }*/

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }






    public void first(){
        imageView = new ImageView(new Image("images/images.jpg"));
        team.catcher.setImageView(new ImageView(new Image("images/1.jpg")));
        team.catcher.getImage().setLayoutY(30);
        imageView.setLayoutX(450);
        imageView.setLayoutY(30);
    }

    public void second(){
        applyAdapter(team.catcher, new ImageView(new Image("images/harry.png")));
    }

    public void afterSecondFrame(){
        imageView = new ImageView(new Image("images/stadionjpg.jpg"));
        imageView.setLayoutX(100);
        imageView.setLayoutY(50);

      /*  BoxIterator boxIterator = boxForMagicAttributes.createBoxIterator();
        boxForMagicAttributes.setBoxName("Общая коробка");
        boxIterator.setBoxForMagicAttributes(boxForMagicAttributes);
        return boxIterator;*/
    }

    public void third(){
        snitch.setImageView(new ImageView(new Image("characters/balls/snitch1.gif")));
        snitch.getImageView().setLayoutY(50);
        snitch.getImageView().setLayoutX(250);
    }


    public void createBall(MagicAttributes magicAttributes, String name, int ballSize, int dangerous, int points){
        BallProperties ballProperties = BallPropertiesFactory.getBallProperties(new FlyForBall(), new BreakByBall(),
                new KillWithABall(), ballSize, points);
        magicAttributes.setBallProperties(ballProperties);
        magicAttributes.setBallName(name);
        magicAttributes.setDangerous(dangerous);
    }

    public void createBallForOneTraining(Snitch snitch, Bladger bladger1, Bladger bladger2, Quaffle quaffle){
        createBall(snitch, "Снитч тренировочный", 10, 3, 150);
        createBall(bladger1, "Бладжер 1 тренировочный", 40, 45, 2);
        createBall(bladger2, "Бладжер 2 тренировочный", 55, 50, 2);
        createBall(quaffle, "Квофл тренировочный", 25, 10, 10);

    }

    public void createBallForOneGame(Snitch snitch, Bladger bladgerFirst, Bladger bladgerSecond, Quaffle quaffle){
        createBall(snitch, "Золотой Снитч игровой", 10, 1, 150);
        createBall(bladgerFirst, "Бладжер игровой (черный)", 40, 60, 0);
        createBall(bladgerSecond, "Бладжер игровой (красный)", 40, 60, 0);
        createBall(quaffle, "Квофл игровой", 25, 10, 10);
    }

    public void applyDecoratorMinus(Snitch snitch){
        Random r = new Random();
        DecoratorForBallsDangerousMinus decoratorForBallsDangerousMinus = new DecoratorForBallsDangerousMinus(snitch);
        decoratorForBallsDangerousMinus.addDangerous(r.nextInt(50));
    }

    public void applyDecoratorDangerous(Snitch snitch){
        Random r = new Random();
        DecoratorForBalls decoratorForBalls = new DecoratorForBallDangerous(snitch);
        ((DecoratorForBallDangerous) decoratorForBalls).addDangerous(r.nextInt(50));
    }
    public void applyAdapter(Character character, ImageView imageView){
        HealthAdapterForPlayer catcherAdapter = new HealthAdapterForPlayer(character);
        catcherAdapter.addHealth();
        character.setImageView(imageView);
        character.getImage().setLayoutX(150);
        character.getImage().setLayoutY(50);
    }

    public void getListOfMagicAttribute(){
     //   BoxForMagicAttributes box = new BoxForMagicAttributes();
      //  box.setBoxName("Мячи для тренировок");



        Snitch snitch1 =  new Snitch();
        Bladger bladger1 =  new Bladger();
        Bladger bladger2 =  new Bladger();
        Quaffle quaffle1 = new Quaffle();

        createBallForOneTraining(snitch1, bladger1, bladger2, quaffle1);
        box.add(snitch1, bladger1, bladger2, quaffle1);
        createBallForOneGame(snitch, bladgerFirst, bladgerSecond, quaffle);
        box.add(snitch, quaffle, bladgerFirst, bladgerSecond);
    }



    public void playGame(){
        team.firstBeater.goal(
                team.firstBeater.getNamePlayer(), quaffle, team);
        team.secondBeater.goal(
                team.secondBeater.getNamePlayer(), quaffle, team);
        team.thirdHunter.goal(
                team.thirdHunter.getNamePlayer(), quaffle, team);
        int points = team.catcher.catchBall(snitch);
        System.out.println("Очки, полученные за всю игру: " + team.countOfPoints);



    }

}