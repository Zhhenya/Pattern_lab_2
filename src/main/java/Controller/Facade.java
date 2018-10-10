package Controller;

import Box.BoxForMagicAttributes;
import Box.BoxIterator;
import Characters.*;
import Characters.Character;
import MagicAtributes.*;
import Teams.Team;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class Facade {
   // Catcher catcher = new Catcher();
    Snitch snitch = new Snitch();
    Quaffle quaffle = new Quaffle();
    Bladger bladgerFirst = new Bladger();
    Bladger bladgerSecond = new Bladger();
    Team team;
    BoxForMagicAttributes boxForMagicAttributes = new BoxForMagicAttributes();
    ImageView imageView;

    public Facade(){
        team = new Team();
        createCommandGriffindor(team);
    }

    public Team getTeam() {
        return team;
    }

    public Catcher getCatcher() {
        return team.getCatcher();
    }

    public void setCatcher(Catcher catcher) {
        this.team.setCatcher(catcher);
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

    public BoxForMagicAttributes getBoxForMagicAttributes() {
        return boxForMagicAttributes;
    }

    public void setBoxForMagicAttributes(BoxForMagicAttributes boxForMagicAttributes) {
        this.boxForMagicAttributes = boxForMagicAttributes;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }






    public void first(){
        imageView = new ImageView(new Image("images/images.jpg"));
        team.getCatcher().setImageView(new ImageView(new Image("images/1.jpg")));
        team.getCatcher().getImage().setLayoutY(30);
        team.getCatcher().setNamePlayer("Гарри Поттер");
        imageView.setLayoutX(450);
        imageView.setLayoutY(30);
    }

    public void second(){
        applyAdapter(team.getCatcher(), new ImageView(new Image("images/harry.png")));
    }

    public BoxIterator afterSecondFrame(){
        imageView = new ImageView(new Image("images/stadionjpg.jpg"));
        imageView.setLayoutX(100);
        imageView.setLayoutY(50);

        BoxIterator boxIterator = boxForMagicAttributes.createBoxIterator();
        boxForMagicAttributes.setBoxName("Общая коробка");
        boxIterator.setBoxForMagicAttributes(boxForMagicAttributes);
        return boxIterator;
    }

    public void third(){
        snitch.setImageView(new ImageView(new Image("characters/balls/snitch1.gif")));
        snitch.getImageView().setLayoutY(50);
        snitch.getImageView().setLayoutX(250);
    }


    public void createBall(MagicAttributes magicAttributes, String name, int ballSize, int dangerous, int points){
        magicAttributes.setBallName(name);
        magicAttributes.setBallSize(ballSize);
        magicAttributes.setDangerous(dangerous);
        magicAttributes.setPoints(points);
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
        BoxForMagicAttributes box = new BoxForMagicAttributes();
        box.setBoxName("Мячи для тренировок");
        Snitch snitch1 =  new Snitch();
        Bladger bladger1 =  new Bladger();
        Bladger bladger2 =  new Bladger();
        Quaffle quaffle1 = new Quaffle();

        createBallForOneTraining(snitch1, bladger1, bladger2, quaffle1);
        box.add(snitch1, bladger1, bladger2, quaffle1);
        createBallForOneGame(snitch, bladgerFirst, bladgerSecond, quaffle);
        boxForMagicAttributes.add(snitch, quaffle, bladgerFirst, bladgerSecond, box);
    }

    public void createCommandGriffindor(Team Griffindor){
        Griffindor.setTeamName("Гриффиндор");
        Hunter hunter = new Hunter();
        hunter.setNamePlayer("Кети Белл");
        Griffindor.setFirstHunter(hunter);

        hunter = new Hunter();
        hunter.setNamePlayer("Демельза Робинс");
        Griffindor.setSecondHunter(hunter);

        hunter = new Hunter();
        hunter.setNamePlayer("Джинни Уизли");
        Griffindor.setThirdHunter(hunter);

        Beater beater = new Beater();
        beater.setNamePlayer("Ричи Кут");
        Griffindor.setFirstBeater(beater);

        beater = new Beater();
        beater.setNamePlayer("Джимми Пикс");
        Griffindor.setSecondBeater(beater);

        Catcher catcher = new Catcher();
        catcher.setNamePlayer("Гарри Поттер");
        Griffindor.setCatcher(catcher);

        Goalkeeper goalkeeper = new Goalkeeper();
        goalkeeper.setNamePlayer("Рон Уизли");
        Griffindor.setGoalkeeper(goalkeeper);

    }

    public void createSlitherin(Team Slitherin){
        Hunter hunter = new Hunter();
        hunter.setNamePlayer("Urghart");
        Slitherin.setFirstHunter(hunter);

        hunter = new Hunter();
        hunter.setNamePlayer("Veizy");
        Slitherin.setSecondHunter(hunter);

        hunter = new Hunter();
        hunter.setNamePlayer("Kassius Worringthon");
        Slitherin.setThirdHunter(hunter);

        Beater beater = new Beater();
        beater.setNamePlayer("Vinsent Greb");
        Slitherin.setFirstBeater(beater);

        beater = new Beater();
        beater.setNamePlayer("Greggory Goil");
        Slitherin.setSecondBeater(beater);

        Catcher catcher = new Catcher();
        catcher.setNamePlayer("Draco Malfoy");
        Slitherin.setCatcher(catcher);

        Goalkeeper goalkeeper = new Goalkeeper();
        goalkeeper.setNamePlayer("Mailz Bletchly");
        Slitherin.setGoalkeeper(goalkeeper);
    }

    public void playGame(){
        team.getFirstBeater().goal(
                team.getFirstBeater().getNamePlayer(), quaffle, team.getTeamName());
        team.countPoints(quaffle.getPoints());
        team.getSecondBeater().goal(
                team.getSecondBeater().getNamePlayer(), quaffle, team.getTeamName());
        team.countPoints(quaffle.getPoints());
        team.getThirdHunter().goal(
                team.getThirdHunter().getNamePlayer(), quaffle, team.getTeamName());
        team.countPoints(quaffle.getPoints());
        int points = team.getCatcher().catchBall(snitch);
        team.countPoints(points);
        System.out.println("Очки, полученные за всю игру: " + team.getCountOfPoints());



    }

}