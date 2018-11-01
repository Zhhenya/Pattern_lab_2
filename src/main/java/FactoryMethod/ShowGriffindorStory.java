package FactoryMethod;

public class ShowGriffindorStory extends ShowStory {

    @Override
    public Story showStory() {
        return new GriffindorStory();
    }
}