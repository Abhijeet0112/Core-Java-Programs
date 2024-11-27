package day11;

public class MainClass {

	public static void main(String[] args) {
		Product p = new Product();
		p.setBrand("MI");
		p.setPrice(1250.55);
		System.out.println("Brand = "+p.getBrand());
		System.out.println("Price = "+p.getPrice());
	}

}
