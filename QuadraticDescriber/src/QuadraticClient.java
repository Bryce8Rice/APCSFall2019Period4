/* Bryce Wang
 * September 23, 2019
 * Period 4
 * Call quadratic methods and handles interactions with user.
 */
import java.util.Scanner;

public class QuadraticClient {
	public static void main(String[] args) {
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide values for coefficients a, b, c");
		Scanner userInput = new Scanner(System.in);
		System.out.println("a: ");
		double a = userInput.nextDouble();
		System.out.println("b: ");
		double b = userInput.nextDouble();
		System.out.println("c: ");
		double c = userInput.nextDouble();
		System.out.println();
		System.out.println(Quadratic.quadrDescriber(a, b, c));
		System.out.println();
	}
}
