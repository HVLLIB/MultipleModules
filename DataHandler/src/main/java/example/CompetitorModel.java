package example;

public class CompetitorModel {

    private String fullName;

    private int score;

    private int birthYear;

    public CompetitorModel(String fullName, int score, int birthYear) {
        this.fullName = fullName;
        this.score = score;
        this.birthYear = birthYear;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "CompetitorModel{" +
                "Name=" + fullName +
                ", Score=" + score +
                ", BirthYear=" + birthYear +
                '}';
    }
}
