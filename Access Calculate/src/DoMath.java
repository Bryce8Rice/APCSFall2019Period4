/* Bryce Wang
 * August 29, 2019
 * Period 4
 * Call math methods from the calculate library
 * Client code or runner code
 */
public class DoMath {
	public static void main(String[] args) {
		System.out.println(Calculate.square(12));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(5.2, 6.3));
		System.out.println(Calculate.average(3.2, 4.8, 7.9));
		System.out.println(Calculate.toDegrees(1));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(2, 3, 4));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(5, 2));
		System.out.println(Calculate.absValue(-3.5));
		System.out.println(Calculate.max(5.4, 3.4));
		System.out.println(Calculate.max(3.7, 9.6, 1.4));
		System.out.println(Calculate.min(6, 3));
		System.out.println(Calculate.round2(-5.321));
		System.out.println(Calculate.exponent(2, -2));
		System.out.println(Calculate.factorial(3));
		System.out.println(Calculate.isPrime(4));
		System.out.println(Calculate.gcf(1, 1));
		System.out.println(Calculate.sqrt(0));
		System.out.println(Calculate.quadForm(1, 0, 1));
	}
}
