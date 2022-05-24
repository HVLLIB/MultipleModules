package example;

import java.util.*;
import java.util.stream.Collectors;

public class CompetitorDataHandler {

    static List<CompetitorModel> competitors = new ArrayList<>(Arrays.asList(
            new CompetitorModel("NagyBéla ", 45, 1945),
            new CompetitorModel("KissJenő", 55, 1985),
            new CompetitorModel("KerekFerenc", 34, 2005),
            new CompetitorModel("KissLevente", 21, 1999),
            new CompetitorModel("OraveczÁron", 20, 2002),
            new CompetitorModel("NagyPista", 10, 1975)
    ));

    public static void addNewCompetitor(CompetitorModel newCompetitor) {
        competitors.add(newCompetitor);
    }

    public static CompetitorModel getMaxCompetitor() {
        return competitors.stream().max(Comparator.comparing(CompetitorModel::getScore)).get();
    }

    public static CompetitorModel getMinCompetitor() {
        return competitors.stream().min(Comparator.comparing(CompetitorModel::getScore)).get();
    }

    public static double getAverageGradeOfCompetitors() {
        return competitors.stream().collect(Collectors.averagingDouble(comp -> comp.getScore()));
    }

    public static List<CompetitorModel> getCompetitorsThatNamesIncludeSearchTerm(String searchTerm) {
        return competitors.stream().filter(comp -> comp.getFullName().contains(searchTerm)).collect(Collectors.toList());
    }
}
