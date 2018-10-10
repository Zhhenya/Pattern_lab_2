package Controller;

import Box.BoxForMagicAttributes;
import Characters.*;
import Characters.Character;
import MagicAtributes.*;
import Teams.Team;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class Facade {
   /* Catcher catcher = new Catcher();
    Snitch snitch = new Snitch();
    Quaffle quaffle = new Quaffle();
    Bladger bladgerFirst = new Bladger();
    Bladger bladgerSecond = new Bladger();
    BoxForMagicAttributes boxForMagicAttributes = new BoxForMagicAttributes();*/


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

    public void createCommandGriffindor(Team Griffindor){
        Hunter hunter = new Hunter();
        hunter.setNamePlayer("Kethy Bell");
        Griffindor.setFirstHunter(hunter);

        hunter = new Hunter();
        hunter.setNamePlayer("Demelza Robins");
        Griffindor.setSecondHunter(hunter);

        hunter = new Hunter();
        hunter.setNamePlayer("Dzhinny Wizli");
        Griffindor.setThirdHunter(hunter);

        Beater beater = new Beater();
        beater.setNamePlayer("Richy Kut");
        Griffindor.setFirstBeater(beater);

        beater = new Beater();
        beater.setNamePlayer("Dzhimmy Picks");
        Griffindor.setSecondBeater(beater);

        Catcher catcher = new Catcher();
        catcher.setNamePlayer("Harry Potter");
        Griffindor.setCatcher(catcher);

        Goalkeeper goalkeeper = new Goalkeeper();
        goalkeeper.setNamePlayer("Ron Wizly");
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


}