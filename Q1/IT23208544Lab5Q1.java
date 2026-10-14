
import java.util.Scanner;

public class IT23208544Lab5Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = input.nextInt();

        System.out.print("Enter the second integer: ");
        int b = input.nextInt();

        System.out.print("Enter the third integer: ");
        int c = input.nextInt();

        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));

        System.out.println("User entered numbers are : " + a + " " + b + " " + c);
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);

        input.close();
    }
}
