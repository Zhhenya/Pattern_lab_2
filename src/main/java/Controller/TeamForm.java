package Controller;

import ChooseTeam.*;
import ChooseTeam.KeyWords;
import FactoryMethod.*;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class TeamForm {

    public Button griffindorButton;
    public Button slitherinButton;
    public Pane griffindorPane;
    public Pane slitherinPane;
    public AnchorPane anchorPane;
    Facade facade;

    KeyWords chooseTeam = null;



    public void setFacade(Facade facade){
        this.facade = facade;
    }

    public void initialize(){
        anchorPane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

        griffindorPane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        slitherinPane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

        griffindorPane.getChildren().add(new ImageView(new Image("images/Гриффиндор.jpg")));
        slitherinPane.getChildren().add(new ImageView(new Image("images/Слизерин.jpg")));
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