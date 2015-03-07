package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * MadLibs.java
 * This class asks for some words then creates a Mad Lib
 */
import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        int aNumber;
        String aColor, aFood, anAnimal, aFruit, aGame;
        Scanner input = new Scanner(System.in);

        // Asks the user some words
        System.out.println("Enter a color: ");
        aColor = input.nextLine();
        System.out.println("Enter a food: ");
        aFood = input.nextLine();
        System.out.println("Enter an animal: ");
        anAnimal = input.nextLine();
        System.out.println("Enter a fruit: ");
        aFruit = input.nextLine();
        System.out.println("Enter a game: ");
        aGame = input.nextLine();
        System.out.println("Enter a number: ");
        aNumber = input.nextInt();

        // Prints out a mad lib

        System.out.println("Here is your mad lib!!\n" +
                            "The " + aColor + " " + anAnimal + " shook a "
                            + aFruit + " tree and " + aNumber + " " + aFruit
                            + "s fell. The " + anAnimal + " ate " + aNumber + " "
                            + aFruit + "s and " + aFood + " for dinner then played "
                            + aGame + ".");


    }
}
