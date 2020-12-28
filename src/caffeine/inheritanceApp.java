package caffeine;



class Product {
	
	// Attributes
	int id;
	String name;
	int price;
	
	// Constructors
	Product(){
		System.out.println("Product Object Constructed");
	}
	
	// Methods
	void setProductDetails(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	void showProductDetails() {
		System.out.println("Product ID: " + id);
		System.out.println("Product name: " + name);
		System.out.println("Product price: " + price);
	}
}

public class inheritanceApp {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product = new Product();
		System.out.println("Procuct is: " + product);
		

	}

}
