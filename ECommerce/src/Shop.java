import java.util.Scanner;


public class Shop {

	static double totalAmount = 0;
	
	static Product[] inventory = {new Apparel("Business Ritual Women's Long Sleeve Top", 65.39, 4, 'L', "Blue"),
	new Book("The Art of Computer Programming", 190.54, 9, "Donald E. Knuth"),
	new Apparel("Men's Business Casual Shirt", 57.10, 2, 'M', "Teal"),
	new Bath("Organic Tumeric Soap", 11.25, 1),
	new Book("Head First Design Pattern", 37.35, 3, "Eric Freeman")};
	
	public static void displayMenu() {
		System.out.println("\nEnter the product index (0 to 4) you want to buy.\n"
				+ "To exit the shopping cart, enter any number other than 0 to 4.\n");
		
		for(int i = 0; i < inventory.length; i++) {
			System.out.println(i + ": " + inventory[i].getName());
		}
	}
	
	public static boolean validInput(int input) {
		return (input >= 0 && input <= 4);
	}
	
	public static void main(String[] args) {
		int userInput;
		Scanner reader = new Scanner(System.in);
		
		do {
			
			displayMenu();
			userInput = Integer.valueOf(reader.nextLine());
			
			if(validInput(userInput)) {
				if(inventory[userInput].buy()) {
					System.out.println("Your purchase was successful!");
					totalAmount += inventory[userInput].getPrice();
				} else {
					System.out.println("Sorry! This product is out of stock!");
				}
			} else {
				break;
			}
			
		} while(validInput(userInput));
		
		System.out.println("\nThank you for shopping with us! The total amount is " + totalAmount);
		
		reader.close();
		
		System.out.println("\nTesting... testing... 1, 2, 3...");
	}
	
}
