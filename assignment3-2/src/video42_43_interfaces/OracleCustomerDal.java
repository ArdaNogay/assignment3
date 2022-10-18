package src.video42_43_interfaces;

public class OracleCustomerDal implements ICustomerDal {
    @Override
    public void add() {
        System.out.println("Oracle sql eklendi");
    }
}
