package caffeine;



class Product {
	
	// Attributes
	private int id;
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
	
	void setId(int id) {
		this.id = id;
	}
	
	int getId() {
		return id;
	}
}

class Mobile extends Product{
	Mobile(){
		System.out.println("Mobile Object Constructed");
	}
}

public class inheritanceApp {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Product product = new Product();
		System.out.println("Product is: " + product);
		
		product.setProductDetails(101, "Sun Glass", 300);
		
		product.showProductDetails();
		
		Product product2 = new Product();
		
		product2.setId(102);
		product2.name = "Face Cream";
		product2.price = 500;
		
		
		product2.showProductDetails();
		*/
		
		Mobile mobile = new Mobile();

	}

}
