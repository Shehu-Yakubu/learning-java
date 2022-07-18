import java.util.Scanner;

public class DecisionMaking {

    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputedNum = scanner.nextInt();
        
        // If Statement
        if (inputedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("Your selection will make you very happy today");
        }
    }
}