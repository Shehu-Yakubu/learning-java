import java.util.Scanner;

public class Item {
    Scanner scanner = new Scanner(System.in);
    
    /* ITEM DETAILS */
    int serialNumber;
    String description;
    int quantity;

    /*public Item(int serialNumber, String description, int quantity) {
        this.serialNumber = serialNumber;
        this.description = description;
        this.quantity = quantity;
    }*/

    public void acceptItemDetails() {
        System.out.print("Item Description: ");
        description = scanner.nextLine();
        
        System.out.print("Serial Number: ");
        serialNumber = scanner.nextInt();

        System.out.print("Quantity: ");
        quantity = scanner.nextInt();
    }

    public void displayItemDetails() {
        System.out.println(serialNumber);
        System.out.println(description);
        System.out.println(quantity);
    }
}