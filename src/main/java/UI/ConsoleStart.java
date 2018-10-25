package UI;

import Controller.Facade;

public class ConsoleStart implements Application {
    private static ConsoleUI consoleUI = new ConsoleUI();


    @Override
    public void startApplication(Facade facade) {
        consoleUI.setFacade(facade);
        consoleUI.start();
    }
}