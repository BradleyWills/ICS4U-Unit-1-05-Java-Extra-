import java.util.Random;
import java.util.Scanner;

/**
* The ExtraDiceGame program implements an application that generates a random 
* number based on the inputed max and evaluates if the user guesses it.
*
* @author  Bradley Wills
* @version 1.0
* @since   2020-03-01 
*/

public class ExtraDiceGame {
  // Create variables 
  static int randomizedNum;
  static int guesses;
  static boolean correct;
  static int maxValue;
  
  /**
  * Calculates and checks if the users input is the same as the guess.
  */
  
  public static void main(String[] args) {
    // Create scanner and randomizer
    Scanner userInput = new Scanner(System.in);
    Random randomizer = new Random();
    // Ask for input
    System.out.println("Input the max value.");
    try {
      maxValue = Integer.parseInt(userInput.nextLine());
      // Ask for input
      System.out.println("Guess a number between 1 and " + maxValue + ".");
      // Generate random number 1-6
      randomizedNum = (randomizer.nextInt(maxValue)) + 1;
      try { 
        while (correct == false) {
          // Increases the guesses value
          guesses += 1;
          int userGuess = Integer.parseInt(userInput.nextLine()); 
          if (userGuess == randomizedNum) {
            // Stops the while loop
            correct = true;
            // Informs the user that they are correct
            System.out.println("Correct! It took you " + guesses + " tries.");
          } else if ((userGuess < 1) || (userGuess > maxValue)) {
            // Informs the user that their input is invalid
            System.out.println("Invalid Input. Your guess should be between 1 and " + maxValue);
          }
        }
      } catch (Exception e) {
        // Informs the user that their input is invalid
        System.out.println("Invalid Input.");
      }
    } catch (Exception e) {
      // Informs the user that their input is invalid
      System.out.println("Invalid Input.");
    }
  }
}