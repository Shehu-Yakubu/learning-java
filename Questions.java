import java.util.Scanner;

public class Questions {

    public static void main(String[] args) {
        String question = "What's Nigeria's Capital called?";
        String choiceOne = "Lagos";
        String choiceTwo = "Abuja";
        String choiceThree = "Kano";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println("Choose one of the following: " + choiceOne + ", " + choiceTwo + ", or " + choiceThree + ".");

        Scanner input = new Scanner(System.in);
        String asnwer = input.next();

        if (correctAnswer.equals(asnwer)) {
            System.out.println("Congrats! That's the correct answer");
        } else {
            System.out.println("You're incorrect. The correct answer is " + correctAnswer);
        }
    }
}