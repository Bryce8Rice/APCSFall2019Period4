/* Bryce Wang
 * September 23, 2019
 * Period 4
 * Call quadratic methods and handles interactions with user.
 */
import java.util.*;

public class QuadraticClient {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		boolean quit = false;
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide values for coefficients a, b, c\n");
		Scanner userInput = new Scanner(System.in);
		while(quit != true) {	
			System.out.print("a: ");
			a = userInput.nextDouble();
			System.out.print("b: ");
			b = userInput.nextDouble();
			System.out.print("c: ");
			c = userInput.nextDouble();
			System.out.println(Quadratic.quadrDescriber(a, b, c));
			if(userInput.next() == String.equal("quit")) {
				quit = true;
			}
		}
		userInput.close();
	}
}
