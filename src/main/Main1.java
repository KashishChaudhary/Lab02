package main;

import java.util.Scanner;

/**
 * @author Kashish Chaudhary
 * @version 1.0
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c, d, e, f;
        c = a + b;
        System.out.println("sum is = " + c);
        d = a - b;
        System.out.println("difference is = " + d);
        e = a * b;
        System.out.println("multiplication is = " + e);
        f = a / b;
        System.out.println("division is = " + f);

    }
}
