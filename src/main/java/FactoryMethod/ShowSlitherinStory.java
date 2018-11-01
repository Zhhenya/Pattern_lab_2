package FactoryMethod;

public class ShowSlitherinStory extends ShowStory {

    @Override
    public Story showStory() {
        return new SlitherinStory();
    }
}