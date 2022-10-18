package src.video42_43_interfaces;

public class MySqlCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("My sql eklendi");
    }
}
