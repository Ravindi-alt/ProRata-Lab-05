
import java.util.Scanner;

public class IT23208544Lab5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            input.close();
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            input.close();
            return;
        }

        int days = endDate - startDate;
        double discountRate = 0;

        if (days >= 5) {
            discountRate = 0.20;
        } else if (days >= 3) {
            discountRate = 0.10;
        }

        double total = days * ROOM_CHARGE;
        total = total - (total * discountRate);

        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
        System.out.println("Number of Days Reserved: " + days);
        System.out.println("Total Amount to be Paid: " + total);

        input.close();
    }
}
