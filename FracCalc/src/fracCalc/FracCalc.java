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
        String operation[] = input.split(" ");
        String op1 = operation[0];
        String op2 = operation[2];
        String operator = operation[1];
        String wholeOp1[] = {op1};
        if(op1.contains("_")) {
        	wholeOp1[] = op1.split("_");
        } else {
        	wholeOp1[] = ;
        }
        if(wholeOp1.length == 2) {
        	String fracOp1[] = wholeOp1[1].split("/");
        } else {
        	String fracOp1[] = wholeOp1[0];
        }
        if(op2.contains("_")) {
            String wholeOp2[] = op2.split("_");   	
        } else {
        	String wholeOp2[] = {op2};
        }
        if(wholeOp2.length == 2) {
            String fracOp2[] = wholeOp2[1].split("/");
        } else {
        	String fracOp2[] = {wholeOp2};
        }
        String numer1 = fracOp1[0];
        String denom1 = fracOp1[1];
        String numer2 = fracOp2[0];
        String denom2 = fracOp2[1];
        return op2;
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
