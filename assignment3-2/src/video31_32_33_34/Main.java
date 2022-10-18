package src.video31_32_33_34;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(500);;
		product.setStockAmount(3);
		
		Product product2 = new Product(1, "TV", "Televizyon", 1500, 8);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getKod());
	}

}
