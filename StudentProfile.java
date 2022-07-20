public class StudentProfile {
    // Instance Variables
    String studentFirstName;
    String studentLastName;
    int expectedYearToGraduate;
    double studentGPA;
    String studentMajor;

    // Constructor
    public StudentProfile(
        String studentFirstName,
        String studentLastName,
        int expectedYearToGraduate,
        double studentGPA,
        String studentMajor
    ) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.studentGPA = studentGPA;
        this.studentMajor = studentMajor;
    }

    public void incrementExpectedYearToGraduate() {
        this.expectedYearToGraduate += 1;
    }

    public static void main(String[] args) {
        StudentProfile student1 = new StudentProfile("Shehu", "Yakubu", 2019, 4.5, "Data Engineer");
        StudentProfile student2 = new StudentProfile("Usman", "Garba", 2022, 4.8, "Cloud Engineer");

        student2.incrementExpectedYearToGraduate();
        System.out.println(student2.expectedYearToGraduate);
    }
}