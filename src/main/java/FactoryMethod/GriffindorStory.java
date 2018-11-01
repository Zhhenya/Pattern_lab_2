package FactoryMethod;

import Controller.Facade;
import Controller.MainForm;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GriffindorStory implements Story {
    @Override
    public void startStory(Facade facade) {
        Stage stage = new Stage();

        FXMLLoader loader = new FXMLLoader();
        try {
            loader.setLocation(getClass().getResource("/forms/mainForm.fxml"));
            Parent root = loader.load();
            MainForm mainForm = loader.getController();
            mainForm.setFacade(facade);
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}