package ChooseTeam;

import Characters.Beater;
import Characters.Catcher;
import Characters.Goalkeeper;
import Characters.Hunter;
import Teams.Team;

public class Slitherin implements ChooseTeam {
    @Override
    public Team createTeam() {
        SlitherinPlayer slitherinPlayer = new SlitherinPlayer();


        Team Slitherin = new Team();
        Slitherin.teamName = "Слизерин";


        Slitherin.firstHunter = slitherinPlayer.createHunterFirst();


        Slitherin.secondHunter = slitherinPlayer.createHunterSecond();


        Slitherin.thirdHunter = slitherinPlayer.createHunterThird();


        Slitherin.firstBeater = slitherinPlayer.createBeaterFirst();


        Slitherin.secondBeater = slitherinPlayer.createBeaterSecond();


        Slitherin.catcher = slitherinPlayer.createCatcher();


        Slitherin.goalkeeper = slitherinPlayer.createGoalkeeper();


        return Slitherin;
    }


}