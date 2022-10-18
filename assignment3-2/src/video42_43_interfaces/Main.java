package src.video42_43_interfaces;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}
