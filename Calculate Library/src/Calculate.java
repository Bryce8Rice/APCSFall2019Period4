/*Bryce Wang
 * August 19, 2019
 * Period 4
 * Group of methods that perform math calculations (a library)
 */
public class Calculate {
	//A call to square returns the square of the value passed.
	//It accepts and returns an integer.
	public static int square(int number) {
		int answer = 0;
		answer = number * number;
		return answer;
	}
	
	//A call to cube returns the cube of the value passed.
	//It accepts and returns an integer.
	public static int cube(int number) {
		int answer = 0;
		answer = number * number * number;
		return answer;
	}
	
	//A call to average returns the average of the values passed.
	//It accepts 2 doubles and returns a double.
	public static int average(double number1, double number2) {
		double answer = 0;
		answer = (number1 + number2)/2;
		return answer;
	}
	
}
