package FactoryMethod;

import Controller.Facade;
import javafx.scene.control.Alert;

public class SlitherinStory implements Story {
    @Override
    public void startStory(Facade facade) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Развитие событий");
        alert.setHeaderText(null);
        alert.setContentText("Здесь будет история Слизерин");
        alert.show();
        return;
    }
}