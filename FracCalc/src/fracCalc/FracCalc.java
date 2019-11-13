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
        split(wholeOp1, fracOp1, operation);
        String wholeOp2[] = {operation[2], "0"};
        String fracOp2[] = {"0", "1"};
        split(wholeOp2, fracOp2, operation);
        int improp1[] = {0, 0};
        int improp2[] = {0, 0};
        //toImprop(improp1, wholeOp1, fracOp1);
        //toImprop(improp2, wholeOp2, fracOp2);
        //int numer1 = improp1[0];
        //int denom1 = improp1[1];
        //int numer2 = improp2[0];
        //int denom2 = improp2[1];
        if(operator.equals("+")) {
        	
        } else if(operator.equals("-")) {
        	
        } else if(operator.equals("*")) {
        	//System.out.println(multiply(improp1, improp2));
        }
        return "numer: " + fracOp1[0] + " denom: " + fracOp1[1];
    }
    
    public static void split(String[] whole, String[] frac, String[] operation) {
    	if(operation[0].contains("_")) {
        	whole = operation[0].split("_");
        	if(whole[1].contains("/")) {
        		frac = whole[1].split("/");
        	}
        } else if(whole[0].contains("/")) {
        	frac = whole[0].split("/");
        	whole[0] = "0";
        	whole[1] = operation[0];
        }
    }
    
    /*public static void toImprop(int[] improp, String[] wholeOp, String[] fracOp) {
    	int whole = Integer.parseInt(wholeOp[0]);
    	int numer = Integer.parseInt(fracOp[0]);
    	int denom = Integer.parseInt(fracOp[1]);
    	numer = whole * denom + numer;
    	improp[0] = numer;
    	improp[1] = denom;
    }*/
    
    /*public static void commonDenom(int[] op1, int[] op2) {
    	op1[1] = op1[1] * op2[1];
    	op2[2] = op1[1];
    }
    
    public static void add(int[] op1, int[] op2) {
    	
    }
    
    public static String multiply(int[] op1, int[] op2) {
    	int numer = op1[0] * op2[0];
    	int denom = op1[1] * op2[1];
    	return numer + "/" + denom;
    }*/
}
