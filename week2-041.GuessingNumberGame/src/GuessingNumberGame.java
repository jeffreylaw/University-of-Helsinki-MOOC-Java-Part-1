
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int numberOfGuesses = 0;
        // program your solution here. Do not touch the above lines!
        System.out.print("Guess a number: ");
        int guess = Integer.parseInt(reader.nextLine());
        while (guess != numberDrawn) {
            numberOfGuesses++;
            if (guess > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + numberOfGuesses);
            } else {
                System.out.println("The number is greater, guesses made: " + numberOfGuesses);
            }
            guess = Integer.parseInt(reader.nextLine());
        }
        
        System.out.println("Congratulations, your guess is correct!");

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
