package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Main.java
 * This class prints a message to the console
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("You are " + age + " years old.");
    }

}
