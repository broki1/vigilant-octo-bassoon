
public class Bath extends Product {
	private String word;
	
	public Bath(String name, double price, int quantity) {
		super(name, price, quantity);
	}
	
	public void getDetails() {
		System.out.println("We sell organic bath products!");
	}
	
}
