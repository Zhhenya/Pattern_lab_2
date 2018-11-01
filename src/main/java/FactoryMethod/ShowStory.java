package FactoryMethod;

import Controller.Facade;

public abstract class ShowStory {
    public void show(Facade facade){
        Story story = showStory();
        story.startStory(facade);
    }
    abstract public Story showStory();
}