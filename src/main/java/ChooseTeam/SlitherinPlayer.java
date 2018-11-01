package ChooseTeam;

import Characters.Beater;
import Characters.Catcher;
import Characters.Goalkeeper;
import Characters.Hunter;

public class SlitherinPlayer implements CreateTeam {
    @Override
    public Hunter createHunterFirst() {
        Hunter hunter = new Hunter();
        hunter.setNamePlayer("Ургхарт");
        return hunter;
    }

    @Override
    public Hunter createHunterSecond() {
        Hunter hunter = new Hunter();
        hunter.setNamePlayer("Вейзи");
        return hunter;
    }

    @Override
    public Hunter createHunterThird() {
        Hunter hunter = new Hunter();
        hunter.setNamePlayer("Кассиус Уорингтон");
        return hunter;
    }

    @Override
    public Beater createBeaterFirst() {
        Beater beater = new Beater();
        beater.setNamePlayer("Винсент Греб");
        return beater;
    }

    @Override
    public Beater createBeaterSecond() {
        Beater beater = new Beater();
        beater.setNamePlayer("Грегорри Гойл");
        return beater;
    }

    @Override
    public Catcher createCatcher() {
        Catcher catcher = new Catcher();
        catcher.setNamePlayer("Драко Малфой");
        return catcher;
    }

    @Override
    public Goalkeeper createGoalkeeper() {
        Goalkeeper goalkeeper = new Goalkeeper();
        goalkeeper.setNamePlayer("Майлз Блетчли");
        return goalkeeper;
    }
}