package fracCalc;
import java.util.Scanner;

public class FracCalc {

  public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean quit = false;
        while(!quit) {
        	System.out.print("Calculation: ");
        	System.out.println(produceAnswer(userInput.nextLine()));
        	System.out.print("Do you want to quit? Type \"quit\" to quit. ");
        	if(userInput.nextLine().equals("quit")) {
        		quit = true;
        	}
        }
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input){ 
        // TODO: Implement this function to produce the solution to the input
        String answer[] = input.split(" ");
        return answer[2];
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
