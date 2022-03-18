
public abstract class Product {
	
	protected String name;
	protected double price;
	protected int quantity;
	
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public boolean buy() {
		
		if(this.quantity > 0) {
			
			this.quantity -= 1;
			return true;
			
		} else {
			
			return false;
			
		}
	}
	
	abstract void getDetails();
	

}
