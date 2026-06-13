public class DigitCounter {
    public static int countDigits(int number) {
        // Handle 0 explicitly since the loop won't execute for 0
        if (number == 0) {
            return 1;
        }

        // Convert negative numbers to positive
        number = Math.abs(number);
        
        int count = 0;
        while (number > 0) {
            number = number / 10; // Remove the last digit
            count++;              // Increment the digit counter
        }
        
        return count;
    }

    public static void main(String[] args) {
        int num = -12345;
        System.out.println("Number of digits: " + countDigits(num)); 
        // Output: Number of digits: 5
    }
}
