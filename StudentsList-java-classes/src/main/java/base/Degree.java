package base;

public enum Degree {
    BACHELOR("03", 4),
    SPECIALIST("05", 5),
    MASTER("04", 2);

    private String degreeCode;
    private int studyingDurationYears;

    private Degree(String degreeCode, int studyingDurationYears){
        this.degreeCode = degreeCode;
        this.studyingDurationYears = studyingDurationYears;
    }

    public int getStudyingDurationYears() {
        return studyingDurationYears;
    }

    public String getDegreeCode() {
        return degreeCode;
    }

    private Degree(){

    }

}
