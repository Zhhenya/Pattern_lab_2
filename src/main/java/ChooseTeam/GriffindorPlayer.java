package ChooseTeam;

import Characters.Beater;
import Characters.Catcher;
import Characters.Goalkeeper;
import Characters.Hunter;

public class GriffindorPlayer implements CreateTeam {
    @Override
    public Hunter createHunterFirst() {
        Hunter hunter = new Hunter();
        hunter.setNamePlayer("Кети Белл");
        return hunter;
    }

    @Override
    public Hunter createHunterSecond() {
        Hunter hunter = new Hunter();
        hunter.setNamePlayer("Демельза Робинс");
        return hunter;
    }

    @Override
    public Hunter createHunterThird() {
        Hunter hunter = new Hunter();
        hunter.setNamePlayer("Джинни Уизли");
        return hunter;
    }

    @Override
    public Beater createBeaterFirst() {
        Beater beater = new Beater();
        beater.setNamePlayer("Ричи Кут");
        return beater;
    }

    @Override
    public Beater createBeaterSecond() {
        Beater beater = new Beater();
        beater.setNamePlayer("Джимми Пикс");
        return beater;
    }

    @Override
    public Catcher createCatcher() {
        Catcher catcher = new Catcher();
        catcher.setNamePlayer("Гарри Поттер");
        return catcher;
    }

    @Override
    public Goalkeeper createGoalkeeper() {
        Goalkeeper goalkeeper = new Goalkeeper();
        goalkeeper.setNamePlayer("Рон Уизли");
        return goalkeeper;
    }
}