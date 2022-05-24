package example;

import java.util.List;

public class InputHandler {

    public static void HandleUserInput(int userInput) {
        if(userInput > 0 && userInput < 6){
            switch (userInput) {
                case 1:
                    CompetitorDataHandler.addNewCompetitor(ConsoleHandler.addNewCompetitor());
                    break;
                case 2:
                    System.out.println("Max score: " + CompetitorDataHandler.getMaxCompetitor());
                    break;
                case 3:
                    System.out.println("Min score: " + CompetitorDataHandler.getMinCompetitor());
                    break;
                case 4:
                    System.out.println("Average score: " + CompetitorDataHandler.getAverageGradeOfCompetitors());
                    break;
                case 5:
                    String searchTerm = ConsoleHandler.getSearchTerm();
                    List<CompetitorModel> competitorsAfterSearch = CompetitorDataHandler.getCompetitorsThatNamesIncludeSearchTerm(searchTerm);
                    System.out.println("Names including search term: ");
                    competitorsAfterSearch.forEach(comp -> System.out.println("     " + comp));
            }
        }else{
            System.out.println("Wrong number!");
        }

    }
}
