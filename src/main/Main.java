package main;

import java.util.Scanner;

/**
 * @author Kashish Chaudhary
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine().trim();
        System.out.println("Welcome," + userName + "!");
        System.out.println("chaudhary");
        scanner.close();
    }
}
