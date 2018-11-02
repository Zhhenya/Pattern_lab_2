package Controller;

import ChooseTeam.*;
import ChooseTeam.KeyWords;
import FactoryMethod.*;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

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

//        griffindorPane.getChildren().add(new ImageView(new Image()));
//        slitherinPane.getChildren().add(new ImageView(new Image()));

    }

    public void griffindorButtonClick(ActionEvent actionEvent) {
        chooseTeam = KeyWords.Griffindor;
        Stage stage = (Stage)griffindorButton.getScene().getWindow();
        ShowStory showStory = new ShowGriffindorStory();
        ChooseTeam choose = new Griffindor();
        facade.setTeam(choose.createTeam());
        showStory.show(facade);
        stage.close();
    }

    public void slitherinButtonClick(ActionEvent actionEvent) {
        chooseTeam = KeyWords.Slitherin;
        Stage stage = (Stage)slitherinButton.getScene().getWindow();
        ShowStory showStory = new ShowSlitherinStory();
        ChooseTeam choose = new Slitherin();
        facade.setTeam(choose.createTeam());

        showStory.show(facade);
        stage.close();
    }

    public KeyWords getTeam(){
        return chooseTeam;
    }
}