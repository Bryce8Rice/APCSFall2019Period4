/* Bryce Wang
 * September 23, 2019
 * Period 4
 * Group of methods that constructs the string to be returned to the client.
 */

public class Quadratic {
	public static String quadrDescriber(double a, double b, double c) {
		String graphDescrip = "Description of the graph of: \ny = " + a + " x^2 + " + b + " x + " + c + "\n\n";
		String direction = "Opens: ";
		if(a > 0) {
			direction += "Up\n";
		} else if (a < 0){
			direction += "Down\n";
		} else {
			direction = "Not a quadratic function";
		}
		double x = (-b)/(2*a);
		double y = a*x + b*x + c;
		String axisOfSym = "Axis of Symmetry: " + x + "\n";
		String vertex = "Vertex: (" + x + ", " + y + ")\n";
		String xIntercept = "x-intercept(s): " + quadForm(a,b,c) + "\n";
		String yIntercept = "y-intercept(s): " + c + "\n\n";
		String keepGoing = "Do you want to keep going? (Type \"quit\" to end)";
		return graphDescrip + direction + axisOfSym + vertex + xIntercept + yIntercept + keepGoing;
	}

	public static double discriminant(double a, double b, double c) {
		double answer = 0;
		answer = (b * b) - (4 * a * c);
		return answer;
	}
	
	public static double round2(double number) {
		int rounded;
		if(number > 0) {
			rounded = (int) (number * 100 + 0.5);
				return ((double) rounded) / 100;			
		} else {
			rounded = (int) (number * 100 - 0.5);
			return ((double) rounded) / 100;
		}
	}
	
	public static double sqrt(double numToRoot) {
		if(numToRoot < 0) {
			throw new IllegalArgumentException("Cannot square root a negative number");
		}
		double sqrt = 0;
		for(double i = 0; i * i <= numToRoot; i+=0.001) {
			sqrt = i;
		}
		return round2(sqrt);
	}
	
	public static String quadForm(double a, double b, double c) {
		double discrim = discriminant(a,b,c);
		if(discrim < 0) {
			return "no real roots";
		}
		if(discrim == 0) {
			return -b/(2*a) + "";
		}
		double firstRoot = (-b + sqrt(discrim))/(2*a);
		double secondRoot = (-b - sqrt(discrim))/(2*a);
		return round2(firstRoot) + " and " + round2(secondRoot);
	}
}
