import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("Multiplication Table for " + number + ":");
        
        // Loop from 1 to 10 to print the table
        for (int i = 1; i <= 10; i++) {
            // Calculate and print the product in standard formatting
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        
        // Close the scanner to release resources
        scanner.close();
    }
}
