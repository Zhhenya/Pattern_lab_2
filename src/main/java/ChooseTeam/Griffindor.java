package ChooseTeam;

import Characters.Beater;
import Characters.Catcher;
import Characters.Goalkeeper;
import Characters.Hunter;
import Teams.Team;

public class Griffindor implements ChooseTeam {

    @Override
    public Team createTeam() {

        GriffindorPlayer griffindorPlayer = new GriffindorPlayer();

        Team Griffindor = new Team();
        Griffindor.teamName = "Гриффиндор";


        Griffindor.firstHunter =  griffindorPlayer.createHunterFirst();


        Griffindor.secondHunter = griffindorPlayer.createHunterSecond();


        Griffindor.thirdHunter = griffindorPlayer.createHunterThird();


        Griffindor.firstBeater = griffindorPlayer.createBeaterFirst();


        Griffindor.secondBeater = griffindorPlayer.createBeaterSecond();


        Griffindor.catcher = griffindorPlayer.createCatcher();


        Griffindor.goalkeeper = griffindorPlayer.createGoalkeeper();


        return Griffindor;
    }


}