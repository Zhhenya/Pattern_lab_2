import Controller.Facade;
import Controller.MainForm;
import Teams.Team;
import UI.ConsoleUI;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args){
       /* Team Griffindor = new Team("Griffindor");
        Team Slitherin = new Team("Slitherin");

        //init Griffindor




        //init Slitherin



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
        FXMLLoader loader = new FXMLLoader();
        Facade facade = new Facade();
       /* Parent root = (Parent) loader.load(getClass().getResourceAsStream("forms/mainForm.fxml"));
        MainForm mainForm = loader.getController();
        mainForm.setFacade(facade);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);*/
        ConsoleUI consoleUI = new ConsoleUI(facade);
        consoleUI.start();





        /*primaryStage.show();*/
    }
}
