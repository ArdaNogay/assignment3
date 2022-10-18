package src.video45_staticDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name = "Mouse";
        product.price = 10;

        productManager.add(product);

        DataBaseHelper.Crud.delete();
        DataBaseHelper.Connection.createConnection();
    }
}
