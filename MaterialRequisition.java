import java.util.Scanner;

public class MaterialRequisition {
     
    public static void main(String[] args) {
        Staff staff = new Staff();
        Item item = new Item();

        staff.acceptStaffDetails();
        item.acceptItemDetails();

        staff.displayStaffDetails();
        item.displayItemDetails();
    }
}