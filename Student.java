import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        /* VARIABLES AND DATA TYPES
        int studentAge = 15; 
        double studentGPA = 3.45;
        boolean hasPerfectAttendance = true;

        String studentFirstName = "Shehu";
        String studentLastName = "Yakubu";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        */

        /* STRING CONCATENATION
        double studentGPA = 3.45;
        String studentFirstName = "Shehu";
        String studentLastName = "Yakubu";

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        */

        /* INPUT AND OUTPUT */
        double studentGPA = 3.45;
        String studentFirstName = "Shehu";
        String studentLastName = "Yakubu";

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);
    }
}