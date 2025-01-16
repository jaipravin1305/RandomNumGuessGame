import java.util.Scanner;
import java.util.Random;
public class RandomNumGuess {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //Runtime input for Guess the number
        Random random = new Random(); //Generate Random Number

        //Define the random number in specified range
        int lowerBound = 0;
        int upperBound = 100;
        int maxAttempts = 5;

        //Generate Random Number between lowerbound and upperbound
        int targetNumber = random.nextInt((upperBound - lowerBound) + 1) + lowerBound;
        int attemptsLeft = maxAttempts; //Maximum number of attempts

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have to select a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");

        while(attemptsLeft > 0){
            System.out.println("\nYou have " + attemptsLeft + " attempts left.");
            System.out.print("Enter your guess: ");

            int userGuess = sc.nextInt(); // Number to be enter by player

            if(userGuess == targetNumber){
                System.out.println("Congratulations, You guessed the correct number: " + targetNumber);
                break;
            }else if(userGuess > targetNumber){
                System.out.println("The number " + userGuess + " you guessed is too high. Try Again!");
            }else{
                System.out.println("The number " + userGuess + " you guessed is too low. Try Again!");
            }

            attemptsLeft--;

            if(attemptsLeft == 0){
                System.out.println("Sorry! You are run out of attempts. The correct number was: " + targetNumber);
            }
        }

        sc.close();
    }
}