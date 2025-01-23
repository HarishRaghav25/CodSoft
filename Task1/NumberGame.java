import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Welcome To Number Guessing Game!");

        while(true){
            int random = rand.nextInt(101);
            int maxAttempts = 5;
            int score = 0;
            boolean won = false;

            won = game(sc, random, maxAttempts);
    
                if (won) {
                    System.out.println("You Won! Congratulations!");
                } else {
                    System.out.println("You lost. The correct number was " + random);
                }
    
                System.out.println("Your final score is: " + score);
                System.out.println("Do you want to restart the game? (yes/no)");
    
                String str = sc.nextLine();
    
                if (str.equalsIgnoreCase("yes")) {
                    System.out.println(".........Restarting the game.........");
                } 
                else {
                    System.out.println("Thank you for playing! Game over.");
                    break;
                }
            }   
            sc.close();
        }

        public static boolean game(Scanner sc, int random, int maxAttempts) {
            int score = 0;
            for (int attempts = maxAttempts; attempts > 0; attempts--) {
                System.out.println("Guess a random number between 1 to 100");
                int guess = sc.nextInt();
                sc.nextLine();
    
                if( random-5<guess&&random+5>guess) {
                    System.out.println("You are close enough! ");
                } else if (guess < random) {
                    System.out.println("Too Low! Take a higher guess!");
                } 
                else if(guess > random){
                    System.out.println("Too high! Take a smaller guess!");
                }
                else {
                    System.out.println("You won! You have guessed the correct number " + random);
                    score = attempts * 10;
                    System.out.println("Your score is: " + score);
                    return true;
                }
    
                score = attempts * 2;
                System.out.println("You have " + (attempts - 1) + " attempts left.");
            }
    
            score = 0;
            return false;
        }
}
                  
