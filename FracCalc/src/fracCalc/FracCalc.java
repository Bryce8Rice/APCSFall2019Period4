package fracCalc;
import java.util.*;

public class FracCalc {

  public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String quit = "";
        while(!quit.equals("quit")) {
        	System.out.print("Calculation: ");
        	System.out.println(produceAnswer(userInput.nextLine()));
        	System.out.print("Do you want to quit? Type \"quit\" to quit. ");
        	quit = userInput.nextLine();
        }
        userInput.close();
    }
  
    public static String produceAnswer(String input){ 
        String operation[] = input.split(" ");
        String operator = operation[1];
        String wholeOp1[] = {operation[0], "0"};
        String fracOp1[] = {"0", "1"};
        String wholeOp2[] = {operation[2], "0"};
        String fracOp2[] = {"0", "1"};
        int op1[] = split(wholeOp1, fracOp1);
        int op2[] = split(wholeOp2, fracOp2);
        //int answer[] = {0, 0};
        String answer = "";
        if(operator.equals("+")) {
        	answer = add(op1, op2);
        } else if(operator.equals("-")) {
        	answer = subtract(op1, op2);
        } else if(operator.equals("*")) {
        	answer = multiply(op1, op2);
        } else {
        	answer = divide(op1, op2);
        }
        return answer;
    }
    
    public static int[] split(String[] whole, String[] frac) {
    	if(whole[0].contains("_")) {
        	whole = whole[0].split("_");
        	frac = whole[1].split("/");
        } else if(whole[0].contains("/")) {
        	frac = whole[0].split("/");
        	whole[0] = "0";
        	whole[1] = frac[0] + "/" + frac[1];
        }
    	int[] answer = {Integer.parseInt(whole[0]), Integer.parseInt(frac[0]), Integer.parseInt(frac[1])};
    	toImproper(answer);
    	return answer;
    }
    
    public static void toImproper(int[] op) {
    	if(op[0] < 0) {
    		op[1] = op[0]*op[2]-op[1];
    	} else {
    		op[1] = op[0] * op[2] + op[1];
    	}
    }
    
    public static String add(int[] op1, int[] op2) {
    	int numer = op1[1]*op2[2] + op2[1]*op1[2];
    	int denom = op1[2]*op2[2];
    	return reduce(numer, denom);
    }
    
    public static String subtract(int[] op1, int[] op2) {
    	int numer = op1[1]*op2[2] - op2[1]*op1[2];
    	int denom = op1[2]*op2[2];
    	return reduce(numer, denom);
    }
    
    public static String multiply(int[] op1, int[] op2) {
    	int numer = op1[1] * op2[1];
    	int denom = op1[2] * op2[2];
    	return reduce(numer, denom);
    }
    
    public static String divide(int[] op1, int[] op2) {
    	int numer = op1[1] * op2[2];
    	int denom = op1[2] * op2[1];
    	return reduce(numer, denom);
    }
    
    public static boolean isDivisibleBy(int numToDivide, int numDivideBy) {
		if(numToDivide % numDivideBy == 0) {
			return true;
		} else {
			return false;
		}
	}
    
    public static int gcf(int number1, int number2) {
		int gcf = 1;
		if(number1 < 0) {number1 = -number1;}
		for(int i = 2; i <= number1; i++) {
			if(isDivisibleBy(number1, i) && isDivisibleBy(number2, i)) {gcf = i;}
		}
		return gcf;
	}
    
    public static String reduce(int numer, int denom) {
    	int gcf = gcf(numer, denom);
    	numer = numer/gcf;
    	denom = denom/gcf;
		int whole = numer/denom;
		int remainder = numer%denom;
		String answer = "";
		if(whole == 0 && numer == 0) {
			answer += 0;
		} else if(remainder == 0) {
			answer += whole;
		} else if(whole == 0) {
			if(denom < 0) {
				answer += -remainder + "/" + -denom;
			} else {
				answer += remainder + "/" + denom;
			}
		} else {
			if(denom < 0) {denom = -denom;}
			if(remainder < 0) {
				answer += whole + "_" + -remainder + "/" + denom;
			} else {
				answer += whole + "_" + remainder + "/" + denom;
			}
		}
		return answer;
    }
}