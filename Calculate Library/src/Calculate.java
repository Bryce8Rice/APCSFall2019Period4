/* Bryce Wang
 * August 19, 2019
 * Period 4
 * Group of methods that perform math calculations (a library)
 */

public class Calculate {
	//A call to square returns the square of the value passed.
	//It accepts and returns an integer.
	public static int square(int number) {
		int answer = number * number;
		return answer;
	}
	
	//A call to cube returns the cube of the value passed.
	//It accepts and returns an integer.
	public static int cube(int number) {
		int answer = number * number * number;
		return answer;
	}
	
	//A call to average returns the average of the values passed.
	//It accepts 2 doubles and returns a double.
	public static double average(double number1, double number2) {
		double answer = (number1 + number2)/2;
		return answer;
	}
	
	//A call to average returns the average of the values passed.
	//It accepts 3 doubles and returns a double.
	public static double average(double number1, double number2, double number3) {
		double answer = (number1 + number2 + number3)/3;
		return answer;
	}
	
	//A call to toDegrees converts an angle measure given in radians into degrees.
	//It accepts a double and returns a double.
	public static double toDegrees(double radians) {
		double answer = radians * (180/3.14159);
		return answer;
	}
	
	//A call to Radians converts an angle measure given in degrees into radians.
	//It accepts a double and returns a double.
	public static double toRadians(double degrees) {
		double answer = degrees * (3.14159/180);
		return answer;
	}
	
	//A call to discriminant provides the coefficients of a quadratic equation in standard form (a, b, c) and returns the value of the discriminant.
	//It accepts three doubles and returns a double.
	public static double discriminant(double a, double b, double c) {
		double answer = 0;
		answer = (b * b) - (4 * a * c);
		return answer;
	}
	
	//A call to toImproperFrac converts mixed number(with its pieces provided separately in the order whole number, numerator, then denominator) into an improper fraction.
	//It accepts three integers and returns a string.
	public static String toImproperFrac(int whole, int numer, int denom) {
		int answer = whole * denom + numer;
		return answer + "/" + denom;
		
	}
	
	//A call to toMixedNum converts an improper fraction(with its pieces provided separately in the order numerator then denominator) into a mixed number.
	//It accepts two integers and returns a String.
	public static String toMixedNum(int numer, int denom) {
		int whole = numer/denom;
		int remainder = numer%denom;
		return whole + "_" + remainder + "/" + denom;
	}
	
	//A call to foil converts a binomial multiplication of the form(ax + b)(cx+ d) into a quadratic equation of the form ax^2 + bx +c.
	//It accepts four integers and a String and then returns a String.
	public static String foil(int number1, int number2, int number3, int number4, String x) {
		int a = number1 * number3;
		int b = (number1 * number4) + (number2 * number3);
		int c = number2 * number4;
		return a + x + "^2" + " + " + b + x + " + " + c;
	}
	
	//A call to isDivisibleBy determines whether or not one integer is evenly divisible by another.
	//It accepts two integers and returns a boolean.
	public static boolean isDivisibleBy(int numToDivide, int numDivideBy) {
		if(numDivideBy == 0) {
			throw new IllegalArgumentException("Cannot divide by zero");
		}
		if(numToDivide % numDivideBy == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	//A call to absValue returns the absolute value of the number passed.
	//It accepts a double and returns a double.
	public static double absValue(double number) {
		if(number < 0) {
			return -number;
		} else {
			return number;
		}
	}
	
	//A call to max returns the larger of the values passed.
	//It accepts two doubles and returns a double.
	public static double max(double number1, double number2) {
		if(number1 > number2) {
			return number1;
		} else {
			return number2;
		}
	}
	
	//A call to max returns the larger of the values passed.
	//It accepts three doubles and returns a double.
	public static double max(double number1, double number2, double number3) {
		if(number1 > number2 && number1 > number3) {
			return number1;
		} else if(number2 > number3) {
			return number2;
		} else {
			return number3;
		}
	}
	
	//A call to min returns the smaller of the values passed.
	//It accepts two integers and returns an int.
	public static int min(int number1, int number2) {
		if(number1 < number2) {
			return number1;
		} else {
			return number2;
		}
	}
	
	//A call to round2 rounds a double correctly to 2 decimal.
	//It accepts a double and returns a double.
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
	
	//A call to exponent raises a value to a positive integer power.
	//It accepts a double and an integer and returns a double.
	public static double exponent(double base, int power) {
		double exponent = 1;
		if(base == 0 && power == 0) {
			throw new IllegalArgumentException("Cannot raise zero to the zeroth power");
		} else if(base == 0 && power < 0) {
			throw new IllegalArgumentException("Cannot raise zero to a negative power");
		}
		if(power > 0) {
			for(int i = 1; i <= power; i++) {
				exponent *= base;
			}
			return exponent;
		} else if(power < 0) {
			for(int i = -1; i >= power; i--) {
				exponent *= base;
			}
			return 1/exponent;
		}
		return exponent;
	}
	
	//A call to factorial returns the factorial of the value passed.
	//It accepts an integer and returns an integer.
	public static int factorial(int number) {
		if(number < 0) {
			throw new IllegalArgumentException("Cannot get the factorial of a negative number");
		}
		int answer = 1;
		if(number > 0) {
			for(int i = 2; i <= number; i++) {
				answer *= i;
			}
		}
		return answer;
	}
	
	//A call to isPrime determines whether or not an integer is prime.
	//It accepts an integer and returns a boolean.
	public static boolean isPrime(int number) {
		if(number != 0) {
			for(int i = 2; i < number; i++) {
				if(isDivisibleBy(number, i)) {
					return false;
				}
			}
		} else {
			return true;
		}
		return true;
	}
	
	//A call to gcf finds the greatest common factor of two integers.
	//It accepts two positive integers and returns an integer.
	public static int gcf(int number1, int number2) {
		if(number1 == 0) {
			return number2;
		} else if(number2 == 0) {
			return number1;
		}
		int gcf = 1;
		for(int i = 2; i <= number1; i++) {
			if(isDivisibleBy(number1, i) && isDivisibleBy(number2, i)) {
				gcf = i;
			}
		}
		return gcf;
	}
	
	//A call to sqrt returns an approximation of the square root of the value passed, rounded to two decimals.
	//It accepts a double and returns a double.
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
	
	//A call to quadForm uses the coefficients of a quadratic equation in standard form and uses the quadratic formula to approximate the real roots, if any.
	//It accepts three integers and returns a string.
	public static String quadForm(int a, int b, int c) {
		double discrim = discriminant(a,b,c);
		if(discrim < 0) {
			return "no real roots";
		}
		if(discrim == 0) {
			return -b/(2*a) + "";
		}
		double firstRoot = (-b + sqrt(discrim))/(2*a);
		double secondRoot = (-b - sqrt(discrim))/(2*a);
		if(firstRoot < secondRoot) {
			return round2(firstRoot) + " and " + round2(secondRoot);
		} else {
			return round2(secondRoot) + " and " + round2(firstRoot);
		}
	}
}
