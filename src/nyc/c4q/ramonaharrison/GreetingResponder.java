package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * GreetingResponder.java
 * This class responds to greetings9
 */

import java.util.Scanner;

public class GreetingResponder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String greeting1;
        String answer = "";

        System.out.print("Say hello in your favorite language:");
        greeting1 = input.next();
        System.out.print(greeting1 + "? Is that Spanish?");
        answer = input.next();
        if (answer.equals("yes")) {
            System.out.print("How lovely!");
        } else {
            System.out.print("Oops!");
        }

    }
}

if (repond1.equals("no") && )

if ((4 < 3) && (5 == 5))