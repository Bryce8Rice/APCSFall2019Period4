import java.util.Scanner;

public class Hourglass {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("How big is your hourglass? ");
		int size = userInput.nextInt();
		System.out.print("|");
		for(int quote = 1; quote <= size; quote++) {
			System.out.print("\"");
		}
		System.out.println("|");
		for(int line = 1; line <= size/2-1; line++) {
			for(int space = 1; space <= line; space++) {
				System.out.print(" ");
			}
			System.out.print("\\");
			for(int colon = 1; colon <= -2*line+size; colon++) {
				System.out.print(":");
			}
			System.out.println("/");
		}
		for(int mid = 1; mid <= size/2; mid++) {
			System.out.print(" ");
		}
		System.out.println("||");
		for(int 1; i <= size/2-1; line++) {
			for(int space = line; space <= 1; line--) {
				System.out.print(" ");
			}
		}
	}
}