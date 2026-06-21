package day_3;

import java.util.Scanner;

public class LCMCalculator {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // LCM formula: (a*b) / GCD(a,b)
    public static int findLCM(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("LCM: " + findLCM(n1, n2));
        sc.close();
    }
}
    

