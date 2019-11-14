package fracCalc;
import java.util.*;

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
        String wholeOp2[] = {operation[2], "0"};
        String fracOp2[] = {"0", "1"};
        int op1[] = split(wholeOp1, fracOp1, operation);
        int op2[] = split(wholeOp2, fracOp2, operation);
        int improp1[] = toImproper(op1);
        int improp2[] = toImproper(op2);
        if(operator.equals("+")) {
        	
        } else if(operator.equals("-")) {
        	
        } else if(operator.equals("*")) {
        	System.out.println(multiply(improp1, improp2));
        } else {
        	
        }
        return "numer: " + op1[1] + " denom: " + op1[2];
    }
    
    public static int[] split(String[] whole, String[] frac, String[] operation) {
    	if(operation[0].contains("_")) {
        	whole = operation[0].split("_");
        	frac = whole[1].split("/");
        } else if(whole[0].contains("/")) {
        	frac = whole[0].split("/");
        	whole[0] = "0";
        	whole[1] = operation[0];
        }
    	int[] answer = {Integer.parseInt(whole[0]), Integer.parseInt(frac[0]), Integer.parseInt(frac[1])};
    	return answer;
    }
    
    public static int[] toImproper(int[] op) {
    	int numer = op[0] * op[2] + op[1];
    	int improper[] = {numer, op[2]};
    	return improper;
    }
    
    public static void commonDenom(int[] op1, int[] op2) {
    	op1[1] = op1[1] * op2[1];
    	op2[2] = op1[1];
    }
    
    public static void add(int[] op1, int[] op2) {
    	
    }
    
    public static String multiply(int[] op1, int[] op2) {
    	int numer = op1[0] * op2[0];
    	int denom = op1[1] * op2[1];
    	return numer + "/" + denom;
    }
    
    public static String divide
}
