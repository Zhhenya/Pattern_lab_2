package ChooseTeam;

import Characters.Beater;
import Characters.Catcher;
import Characters.Goalkeeper;
import Characters.Hunter;

public interface CreateTeam {
    Hunter createHunterFirst();
    Hunter createHunterSecond();
    Hunter createHunterThird();
    Beater createBeaterFirst();
    Beater createBeaterSecond();
    Catcher createCatcher();
    Goalkeeper createGoalkeeper();
}