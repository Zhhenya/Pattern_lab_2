package Controller;

import ChooseTeam.*;
import ChooseTeam.KeyWords;
import FactoryMethod.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class TeamForm {

    public Button griffindorButton;
    public Button slitherinButton;
    public Pane griffindorPane;
    public Pane slitherinPane;
    Facade facade;

    KeyWords chooseTeam = null;



    public void setFacade(Facade facade){
        this.facade = facade;
    }

    public void initialize(){

    }

    public void griffindorButtonClick(ActionEvent actionEvent) {
        chooseTeam = KeyWords.Griffindor;
        Stage stage = (Stage)griffindorButton.getScene().getWindow();
        ShowStory showStory = new ShowGriffindorStory();
        ChooseTeam choose = new Griffindor();
        facade.setTeam(choose.createTeam());
        showStory.show(facade);
    //    openMainForm();
        stage.close();
    }

    public void slitherinButtonClick(ActionEvent actionEvent) {
        chooseTeam = KeyWords.Slitherin;
        Stage stage = (Stage)slitherinButton.getScene().getWindow();
        ShowStory showStory = new ShowSlitherinStory();

        ChooseTeam choose = new Slitherin();
        facade.setTeam(choose.createTeam());

        showStory.show(facade);
        /*openSlitherinForm*/

        stage.close();
    }


  /*  public void openMainForm(){
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
*/
    public KeyWords getTeam(){
        return chooseTeam;
    }
}