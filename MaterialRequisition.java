import java.util.Scanner;

public class MaterialRequisition {
    public static void main(String[] args) {
        /* SCANNER PACKAGE - TO ACCEPT USER INPUT */
        Scanner scanner = new Scanner(System.in);

        /* STAFF DETAILS */
        String requestingStaff;
        String hodName;
        String department;
        String reasonForRequest;
        String date;

        /* ITEM DETAILS */
        int serialNumber;
        String description;
        int quantity;

        /* RECEIVING USER INPUT */
        System.out.print("Staff Name: ");
        requestingStaff = scanner.nextLine();

        System.out.print("HOD's Name: ");
        hodName = scanner.nextLine();

        System.out.print("Department: ");
        department = scanner.nextLine();

        System.out.print("Reason for Request: ");
        reasonForRequest = scanner.nextLine();

        System.out.print("Requsting Date: ");
        date = scanner.nextLine();

        System.out.print("Item Description: ");
        description = scanner.nextLine();
        
        System.out.print("Serial Number: ");
        serialNumber = scanner.nextInt();

        System.out.print("Quantity: ");
        quantity = scanner.nextInt();

        /* DISPLAYING USER INPUTED DETAILS */
        System.out.println(requestingStaff);
        System.out.println(hodName);
        System.out.println(department);
        System.out.println(reasonForRequest);
        System.out.println(date);
        System.out.println(serialNumber);
        System.out.println(description);
        System.out.println(quantity);
    }
}