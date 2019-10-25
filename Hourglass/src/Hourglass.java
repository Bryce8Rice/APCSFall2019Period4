import java.util.Scanner;

public class Hourglass {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("How big is your hourglass? ");
		int size = userInput.nextInt();
		top(size);
		
		userInput.close();
	}
	
	public static void top(int size) {
		String top = "";
		top += "|";
		for(int quote = 1; quote <= size; quote++) {
			top += "\"";
		}
		top += "|\n";
		for(int line = 1; line <= size/2-1; line++) {
			for(int space = 1; space <= line; space++) {
				top += " ";
			}
			top += "\\";
			for(int colon = 1; colon <= -2*line+size; colon++) {
				top += ":";
			}
			top += "/\n";
		}
		for(int mid = 1; mid <= size/2; mid++) {
			top += " ";
		}
		top += "||\n";
		System.out.print(top);
	}
	
	public static void bottom(int size) {
		String bottom = "";
		for(int line = 1; line <= size/2-1; line++) {
			for(int space = line; space <= 1; line--) {
				System.out.print(" ");
			}
		}
	}
}