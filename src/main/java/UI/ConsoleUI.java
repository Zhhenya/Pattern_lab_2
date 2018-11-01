package UI;

import Box.BoxForMagicAttributes;
import Box.BoxIterator;
import Characters.Catcher;
import Characters.Character;
import Controller.Facade;
import MagicAtributes.Bladger;
import MagicAtributes.MagicAttributes;
import MagicAtributes.Quaffle;
import MagicAtributes.Snitch;
import poolBox.Pool;

public class ConsoleUI implements UI {

    Facade facade;

    public void setFacade(Facade facade){
        this.facade = facade;
    }

    public ConsoleUI(){};

    @Override
    public void initialize() {
        System.out.println("Объявляю матч открытым!!!");
    }

    @Override
    public void firstFrame() {
        facade.first();
        System.out.println("Гарри, ты кажется не здоров...\nТы не можешь играть в таком состоянии!!!");
        System.out.println("...раздаются покашливания...");
        System.out.println("...(Дамблдор): Ему нужно посетить мадам Помпфри! Немедленно!!!");
        getInfoAboutPlayer(facade.getCatcher());
    }

    @Override
    public void secondFrame() {
        facade.second();
        System.out.println();
        System.out.println();
        System.out.println("...Гарии вылетает из кабинета мадам Помпфри...");
        System.out.println("Он может играть.\nТеперь игроки готовы!!!\n Выпускаем мячи. Игра началась");
        System.out.println();
        getInfoAboutPlayer(facade.getCatcher());
    }

    @Override
    public void afterSecondFrame() {
      //  BoxIterator box = facade.afterSecondFrame();
        facade.getListOfMagicAttribute();
        findAllMagicAttributes(Pool.getPool());
        System.out.println();
        System.out.println();
        System.out.println("Выпускаем мячи. Игра началась");

    }

    @Override
    public void thirdFrame() {
        facade.third();
        System.out.println();
        System.out.println();
        System.out.println("Ой! Что это?");
        System.out.println("...что-то странное происходит со снитчем...");
        System.out.println();
        getInfoAboutBall(facade.getSnitch());

    }

    @Override
    public void forthFrame() {
        facade.applyDecoratorDangerous(facade.getSnitch());
        System.out.println();
        System.out.println();
        System.out.println("Кто-то заколдовал снитч!");
        System.out.println();
        getInfoAboutBall(facade.getSnitch());

    }

    @Override
    public void fifthFrame() {
        facade.applyDecoratorMinus(facade.getSnitch());
        System.out.println();
        System.out.println();
        System.out.println("Тепрь все впорядке");
        System.out.println();
        getInfoAboutBall(facade.getSnitch());
    }

    @Override
    public void sixFrame() {
        facade.applyDecoratorDangerous(facade.getSnitch());
        System.out.println();
        System.out.println();
        System.out.println("Он стал более опасным");
        System.out.println();
        getInfoAboutBall(facade.getSnitch());
    }

    @Override
    public void getInfoAboutPlayer(Character character) {
        System.out.println("Игрок\n");
        System.out.println("Имя: " + character.getNamePlayer());
        System.out.println("Позиция: " + character.getNameCharacterPosition());
        System.out.println("Здоровье: "  + character.getHealth());
    }

    @Override
    public void getInfoAboutBall(MagicAttributes ball) {
        System.out.println("Мяч\n");
        System.out.println("Название: " + ball.getBallName());
        System.out.println("Размер: " + ball.getBallSize());
        System.out.println("Количество очков: " + ball.getPoints());
        System.out.println("Опасность: "  + ball.getDangerous());
    }

    @Override
    public void findAllMagicAttributes(BoxIterator boxIterator){
      /*  System.out.println("\n\n" + boxIterator.getBox().getBoxName() + "\n");
        while(boxIterator.hasNext()) {
            MagicAttributes attributes = boxIterator.getNext();
            BoxIterator boxIterator1 = attributes.createBoxIterator();
            if(boxIterator1 != null) {
                boxIterator1.setBoxForMagicAttributes((BoxForMagicAttributes) attributes);
                findAllMagicAttributes(boxIterator1);
            }
            else
                getInfoAboutBall(attributes);
        }*/
    }


    public void findAllMagicAttributes(Pool pool){
        System.out.println("\n\n" + "коробка" + "\n");
        for(MagicAttributes attributes : Pool.magicAttributes)
            getInfoAboutBall(attributes);
    }


    public void playGame(){

    }


    public void start(){
        firstFrame();
        secondFrame();
        afterSecondFrame();
        thirdFrame();
        forthFrame();
        fifthFrame();
        sixFrame();
        sixFrame();
     //   facade.playGame();

    }
}