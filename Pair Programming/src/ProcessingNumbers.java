/* Bryce Wang
 * October 2, 2019
 * Period 4
 * Prints the smallest and largest of all the numbers supplied by user
 * Print the sum of all even numbers along with the even number typed
 */
import java.util.*;

public class ProcessingNumbers {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("How many numbers? ");
		int numNum = userInput.nextInt();
		System.out.print("Number 1: ");
		int first = userInput.nextInt();
		int max = first;
		int min = first;
		int sum = 0;
		int largestEven = first;
		if(first % 2 == 0) {
			sum += first;
		}
		for(int i = 2; i <= numNum; i++) {
			System.out.print("Number " + i + ": ");
			int num = userInput.nextInt();
			if(num > max) {
				max = num;
			}
			if(num < min) {
				min = num;
			}
			if(num % 2 == 0) {
				if(largestEven % 2 != 0) {
					largestEven = num;
				}
				sum += num;
				if(num > largestEven) {
					largestEven = num;
				}
			}
		}
		System.out.println("The smallest number is: " + min);
		System.out.println("The largest number is: " + max);
		System.out.println("The sum of all even numbers is: " + sum);
		System.out.println("The largest even number is: " + largestEven);
		userInput.close();
	}
}
