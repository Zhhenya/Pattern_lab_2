package UI;

import Controller.Facade;
import Controller.MainForm;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class UIStart implements Application {


    private static Stage primaryStage = new Stage();

    @Override
    public void startApplication(Facade facade) {
        FXMLLoader loader = new FXMLLoader();
        try {
            loader.setLocation(getClass().getResource("/forms/mainForm.fxml"));
            Parent root = loader.load();
            MainForm mainForm = loader.getController();
            mainForm.setFacade(facade);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   /* public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }*/


}