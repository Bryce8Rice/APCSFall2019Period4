/* Bryce Wang
 * October 25, 2019
 * Period 4
 * Prints an hourglass
 */
import java.util.Scanner;

public class Hourglass {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		boolean quit = false;
		while(!quit) {
			System.out.print("How big is your hourglass? ");
			int size = userInput.nextInt();
			top(size);
			bottom(size);
			System.out.print("Do you want to quit? ");
			if(userInput.next().equals("yes")) {
				quit = true;
			}
		}
		userInput.close();
	}
	
	public static void top(int size) {
		String top = "";
		top += "|";
		for(int quote = 1; quote <= size; quote++) {
			top += "\"";
		}
		top += "|\n";
		for(int line = 1; line <= size/2 - 1; line++) {
			for(int space = 1; space <= line; space++) {
				top += " ";
			}
			top += "\\";
			for(int colon = 1; colon <= -2*line+size; colon++) {
				top += ":";
			}
			top += "/\n";
		}
		for(int space = 1; space <= size/2; space++) {
			top += " ";
		}
		if(size % 2 == 0) {
			top += "||\n";
		} else {
			top += "|||\n";
		}
		System.out.print(top);
	}
	
	public static void bottom(int size) {
		String bottom = "";
		for(int line = size/2 - 1; line >= 1; line--) {
			for(int space = line; space >= 1; space--) {
				bottom += " ";
			}
			bottom += "/";
			for(int colon = 1; colon <= -2*line+size; colon++) {
				bottom += ":";
			}
			bottom += "\\\n";
		}
		bottom += "|";
		for(int quote = 1; quote <= size; quote++) {
			bottom += "\"";
		}
		bottom += "|\n";
		System.out.print(bottom);
	}
}