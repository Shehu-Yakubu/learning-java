import java.util.Scanner;

public class DecisionMaking {

    public static void main(String[] args) {
        // System.out.println("Pick a number between 1 and 10");
        // Scanner scanner = new Scanner(System.in);

        // int inputedNum = scanner.nextInt();
        
        // If Statement
        /*if (inputedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("Your selection will make you very happy today");
        }*/

        // While Statement
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes");
            String userInput = input.next();

            if (userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");
    }
}