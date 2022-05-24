package example;

public class MainApp {

    public static void ApplicationRun() {
        while (true) {
            ConsoleHandler.printMainMenu();
            int userInput = ConsoleHandler.getUserInput();
            InputHandler.HandleUserInput(userInput);
        }
    }
}
