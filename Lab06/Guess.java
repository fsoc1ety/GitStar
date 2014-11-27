package Lab06;
import java.util.Scanner; 
import java.util.Random;

public class Guess {
    public static void main(String[] args) 
    {
        int numToGuess; //Number the user tries to guess 
        int guess;  //The user's guess 
        int attempts = 1;
        int attemptsHi = 0;
        int attemptsLo = 0;
        
        Scanner scan = new Scanner(System.in); 
        Random generator = new Random(); 
        
        //randomly generate the number to guess 
        numToGuess = generator.nextInt(10) + 1;
        
        //print message asking user to enter a guess 
        System.out.println("Guess a number from 1 and 10");
        
        //read in guess 
        guess = scan.nextInt();
        
        while (numToGuess != guess) //keep going as long as the guess is wrong 
            {
            if (guess > 10 || guess < 1) {
                System.out.println("That is an invalid guess, please pick a number between 1 to 10!");
                guess = scan.nextInt();
            }
            else {
                if (guess > numToGuess) {
                    System.out.println("Your guess is too high");
                    attemptsHi++;
                }
                else {
                    System.out.println("Your guess is too low");
                    attemptsLo++;
                }
                System.out.println("Incorect,  please try again");
                guess = scan.nextInt();
                attempts++;
                }
            }
        System.out.println("Congrats, that is the correct number!");
        System.out.println("Number of attempts:" + attempts);
        System.out.println("Number of HIGH attempts:" + attemptsHi);
        System.out.println("Number of LOW attempts:" + attemptsLo);
    }

}
