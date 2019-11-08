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
  
    public static String produceAnswer(String input){ 
        String operation[] = input.split(" ");
        String operator = operation[1];
        String wholeOp1[] = {operation[0], "0"};
        String fracOp1[] = {"0", "1"};
        if(operation[0].contains("_")) {
        	wholeOp1 = operation[0].split("_");
        	if(wholeOp1[1].contains("/")) {
        		fracOp1 = wholeOp1[1].split("/");
        	}
        } else if(wholeOp1[0].contains("/")) {
        	fracOp1 = wholeOp1[0].split("/");
        	wholeOp1[0] = "0";
        	wholeOp1[1] = operation[0];
        }
        String wholeOp2[] = {operation[2], "0"};
        String fracOp2[] = {"0", "1"};
        if(operation[2].contains("_")) {
        	wholeOp2 = operation[2].split("_");
        	if(wholeOp2[1].contains("/")) {
        		fracOp2 = wholeOp2[1].split("/");
        	}
        } else if(wholeOp2[0].contains("/")) {
        	fracOp2 = wholeOp2[0].split("/");
        	wholeOp2[0] = "0";
        	wholeOp2[1] = operation[2];
        }
        return "whole:" + wholeOp2[0] + " numerator:" + fracOp2[0] + " denominator:" + fracOp2[1];
    }
    
    public static void improp() {
    	
    }
}
