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
        String op1 = operation[0];
        String op2 = operation[2];
        String operator = operation[1];
        String wholeOp1[] = {"0", op1};
        if(op1.contains("_")) {
        	wholeOp1 = op1.split("_");
        }
        String fracOp1[] = {"0", "1"};
        if(wholeOp1[1].contains("/")) {
        	fracOp1 = wholeOp1[1].split("/");
        }
        String wholeOp2[] = {"0", op2};
        if(op2.contains("_")) {
            wholeOp2 = op2.split("_");   	
        }
        String fracOp2[] = {"0", "1"};
        if(wholeOp2[1].contains("/")) {
            fracOp2 = wholeOp2[1].split("/");
        }
        String whole1 = wholeOp1[0];
        String numer1 = fracOp1[0];
        String denom1 = fracOp1[1];
        String whole2 = wholeOp2[0];
        String numer2 = fracOp2[0];
        String denom2 = fracOp2[1];
        return "whole:" + whole2 + " numerator:" + numer2 + " denominator:" + denom2;
    }
}
