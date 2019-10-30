/* Bryce Wang
 * October 30, 2019
 * Period 4
 * Prints the inside of a sandwich
 */

import java.util.*;

public class Split {
	public static void main(String[] args) {
		System.out.println(part1("hammayomayobreadbreadmayoham"));
		System.out.println(part2("ham ham bread cheese mayo bread mayo bread cheese"));
	}

	public static String part1(String sandwich) {
		String ingredients[] = sandwich.split("bread");
		if (ingredients.length > 0) {
			ingredients[0] = "";
			ingredients[ingredients.length - 1] = "";
		}
		String filling = "";
		for (String ingredient : ingredients) {
			filling += ingredient;
		}
		if(filling.equals("")) {
			filling = "Not a sandwich";
		}
		return filling;
	}

	public static String part2(String sandwich) {
		String food[] = sandwich.split(" ");
		String ingredients = "";
		for(int i = 0; i < food.length; i++) {
			ingredients += food[i];
		}
		String filling = part1(ingredients);
		return filling;
	}
}