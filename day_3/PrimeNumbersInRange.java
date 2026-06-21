import java.util.Scanner;

public class PrimeNumbersInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take range inputs from the user
        System.out.print("Enter the lower bound of the range: ");
        int lower = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upper = scanner.nextInt();

        System.out.println("Prime numbers between " + lower + " and " + upper + " are:");
        
        // Loop through the given range
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }

    

