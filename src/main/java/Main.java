import Characters.Catcher;
import Properties.FlyProperties.FlyWithBroom;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.event.KeyEvent;

public class Main extends Application {

    public static void main(String[] args){
       /* Team Griffindor = new Team("Griffindor");
        Team Slitherin = new Team("Slitherin");

        //init Griffindor

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



        //init Slitherin

        hunter = new Hunter();
        hunter.setNamePlayer("Urghart");
        Slitherin.setFirstHunter(hunter);

        hunter = new Hunter();
        hunter.setNamePlayer("Veizy");
        Slitherin.setSecondHunter(hunter);

        hunter = new Hunter();
        hunter.setNamePlayer("Kassius Worringthon");
        Slitherin.setThirdHunter(hunter);

        beater = new Beater();
        beater.setNamePlayer("Vinsent Greb");
        Slitherin.setFirstBeater(beater);

        beater = new Beater();
        beater.setNamePlayer("Greggory Goil");
        Slitherin.setSecondBeater(beater);

        catcher = new Catcher();
        catcher.setNamePlayer("Draco Malfoy");
        Slitherin.setCatcher(catcher);

        goalkeeper = new Goalkeeper();
        goalkeeper.setNamePlayer("Mailz Bletchly");
        Slitherin.setGoalkeeper(goalkeeper);

        //init balls

        Bladger firstBladger = new Bladger();
        Bladger secondBladger = new Bladger();
        Quaffle quaffle = new Quaffle();
        Snitch snitch = new Snitch();

        firstBladger.actionFly();
        secondBladger.actionFly();
        quaffle.actionFly();
        snitch.actionFly();


        //player

        Griffindor.getGoalkeeper().getFly();
        Griffindor.getCatcher().kill(Griffindor.getCatcher().getNamePlayer());


        //start play game

        Griffindor.getSecondHunter().hitBall(Griffindor.getSecondHunter().getNamePlayer(), firstBladger.getBallName());
        Griffindor.getFirstBeater().goal(
                Griffindor.getFirstBeater().getNamePlayer(), quaffle.getBallName(), quaffle.getPoints(), Griffindor.getTeamName());

        firstBladger.actionFly();
        secondBladger.actionTryKill(Slitherin.getSecondHunter().getNamePlayer());

        Griffindor.getFirstBeater().dodgeBall(firstBladger.getBallName(), Griffindor.getFirstBeater().getNamePlayer());
        Slitherin.getGoalkeeper().catchBall(quaffle.getBallName(), Slitherin.getGoalkeeper().getNameCharacterPosition());
        Slitherin.getThirdHunter().kill(Slitherin.getThirdHunter().getNamePlayer());



        //proxy

        System.out.println();
        System.out.println("Proxy");
        Proxy proxy = new Proxy();
        proxy.fly();

        //Composite
        Potion potion = new Potion();
        Potion interiorPotion = new Potion();

        interiorPotion.add(new BatWingMixture());


        potion.add(new BatWing());
        potion.add(new BatWing());
        potion.add(new Basalt());
        potion.add(interiorPotion);

        potion.getName();


        //Adapter
        BatWing batWing = new BatWing();
        AdapterBatWing adapterBatWing = new AdapterBatWing();
        System.out.println(adapterBatWing.getMixture(batWing));


        //FlyDecorator
        MagicAttributesDecorator magicAttributesDecorator = new MagicAttributesDecorator(new BatWing(), "Volatile power");
        System.out.println(magicAttributesDecorator.getName());

        //MagicAttributeIterator
        PotionCountIterator potionCountIterator = potion.createIterator();
        for(int i = 0; i < potion.getPotionSize(); i++)
            System.out.println(potionCountIterator.getNext().getName());
        potionCountIterator.setCurrentPosition(0);


       *//* for(int i = potion.getPotionSize() - 1; i> 0; i--){
            for(int j = 0; j < i; j++){
                MagicAttributes prevPotion = potionCountIterator.getNext();
                if(prevPotion.getName().compareTo(potionCountIterator.getNext().getName()) < 0){
                    MagicAttributes temp =
                }
            }
        }*//*

        potionCountIterator.getNext();
        potionCountIterator.remove();

        System.out.println("After remove");

        for(int i = 0; i < potion.getPotionSize(); i++)
            System.out.println(potionCountIterator.getNext().getName());

*/
        launch(args);

    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        final int startSpeed = 5;

        final FlyWithBroom flyWithBroomForCatcher = new FlyWithBroom();
        flyWithBroomForCatcher.setImage(new Image("characters/witch/broom.gif"));


        Catcher catcher = new Catcher();
        catcher.setFly(flyWithBroomForCatcher);
        Scene scene = new Scene(flyWithBroomForCatcher.getPane(), 500, 500);
        Image newImage = new Image("characters/witch/witch1.gif");

        scene.setOnKeyPressed(e ->{
            flyWithBroomForCatcher.changeFly(e, startSpeed, newImage);
        });

        primaryStage.setScene(scene);



        primaryStage.show();
    }
}
