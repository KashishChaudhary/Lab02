package main;

import java.util.Scanner;

/**
 * @author Kashish Chaudhary
 * @version 1.0
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s % 2 == 0) {
            System.out.println("even.");
        } else {
            System.out.println("odd.");
        }
    }
}
