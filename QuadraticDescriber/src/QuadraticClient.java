/* Bryce Wang
 * September 23, 2019
 * Period 4
 * Call quadrDescriber method and handles interactions with user.
 */
import java.util.Scanner;

public class QuadraticClient {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		String quit = "";
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide values for coefficients a, b, c");
		Scanner userInput = new Scanner(System.in);
		while(!quit.equals("quit")) {	
			System.out.print("\na: ");
			a = userInput.nextDouble();
			System.out.print("b: ");
			b = userInput.nextDouble();
			System.out.print("c: ");
			c = userInput.nextDouble();
			System.out.println(Quadratic.quadrDescriber(a, b, c));
			quit = userInput.next();
		}
		userInput.close();
	}
}
