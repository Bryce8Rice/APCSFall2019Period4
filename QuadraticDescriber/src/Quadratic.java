/* Bryce Wang
 * September 23, 2019
 * Period 4
 * Group of methods that constructs the string to be returned to the client.
 */

public class Quadratic {
	public static String quadrDescriber(double a, double b, double c) {
		String graphDescip = "Description of the graph of: \n" + a + " x^2 + " + b + " x + " + c;
		String direction;
		if(a > 0) {
			direction = "Opens: Up";
		} else if(a < 0) {
			direction = "Opens: Down";
		} else {
			direction = "Not a quadratic";
		}
		String axisOfSym = "Axis of Symmetry: " + -b/(2*a);	
	}
}
