package by.step.teach_java.classwork.classwork_290922_daysOfTheWeek.Task1;

public enum DaysOfTheWeek {
    FIRST_DAY ("Monday"),
    SECOND_DAY ("Tuesday"),
    THIRD_DAY ("Wednesday"),
    FOURTH_DAY ("Thursday"),
    FIFTH_DAY ("Friday"),
    SIXTH_DAY ("Saturday"),
    SEVENS_DAY ("Sunday");

    private String name;

    DaysOfTheWeek (String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }
}
