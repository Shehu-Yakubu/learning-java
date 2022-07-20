import java.util.Scanner;

public class Staff {
    Scanner scanner = new Scanner(System.in);

     /* STAFF DETAILS */
     String staffID;
     String hodName;
     String department;
     String reasonForRequest;
     String date;

     // Constructor
     /*public Staff(
        String staffID, 
        String hodName, 
        String department, 
        String reasonForRequest,
        String date
     ) {
        this.staffID = staffID;
        this.hodName = hodName;
        this.department = department;
        this.reasonForRequest = reasonForRequest;
        this.date = date;
     }*/

     public void acceptStaffDetails() {
        System.out.print("Staff ID: ");
        staffID = scanner.nextLine();

        System.out.print("HOD's Name: ");
        hodName = scanner.nextLine();

        System.out.print("Department: ");
        department = scanner.nextLine();

        System.out.print("Reason for Request: ");
        reasonForRequest = scanner.nextLine();

        System.out.print("Requsting Date: ");
        date = scanner.nextLine();
    }

    public void displayStaffDetails() {
        /* DISPLAYING USER INPUTED DETAILS */
        System.out.println(staffID);
        System.out.println(hodName);
        System.out.println(department);
        System.out.println(reasonForRequest);
        System.out.println(date);
    }
}