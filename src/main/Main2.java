package main;

import java.util.Scanner;

/**
 * @author Kashish Chaudhary
 * @version 1.0
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}

