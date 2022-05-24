package example;

import java.util.Scanner;

public class ConsoleHandler {
    static Scanner sc = new Scanner(System.in);
    private static final String ERROR_MESSAGE = "Wrong number!!!";


    public static void printMainMenu() {
        System.out.println("Please select menu item: ");
        System.out.println("    1 - Add new competitor data");
        System.out.println("    2 - Get the max score competitor");
        System.out.println("    3 - Get the min score competitor");
        System.out.println("    4 - Get average grade of all competitors");
        System.out.println("    5 - Search in competitors");
    }

    public static int getUserInput() {return sc.nextInt();}

    public static CompetitorModel addNewCompetitor() {
        System.out.println("Please add a name to the new Competitor: ");
        String name = sc.next();
        System.out.println("Please add a birth age to the new Competitor: ");
        int age = sc.nextInt();
        System.out.println("Please add the score of the new Competitor: ");
        int score = sc.nextInt();
        return new CompetitorModel(name, age, score);
    }

    public static String getSearchTerm() {
        System.out.println("Add a term to search in names: ");
        return sc.next();
    }
}
