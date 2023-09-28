import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){


		// Create a Scanner object
        Scanner scan = new Scanner (System.in);   	 
    	
        // Read user input
        
    	
        
        //use hasNextDouble to check if input is numeric, 
        if (scan.hasNextDouble()) {
        double guess = scan.nextDouble();
            if (guess == rnd_number){
            System.out.println("GG");
        } else if(guess>rnd_number){
            System.out.println("too high");
            makeAGuess();
            }else{
            System.out.println("too low");
            makeAGuess();
   }

  }
  else {
        System.out.println("Enter a number you dumb-dumd");
        makeAGuess();
  }
 }
}