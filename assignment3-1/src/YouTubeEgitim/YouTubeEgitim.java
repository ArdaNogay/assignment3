package YouTubeEgitim;

public class YouTubeEgitim {

    public static void main(String[] args) {
//        CreditManager creditManager = new CreditManager();
//        creditManager.Calculate();
//        creditManager.Save();
//
//        Customer customer = new Customer();
//        customer.id = 1;
//        customer.City = "İstanbul";
//
//        CustomerManager customerManager = new CustomerManager(customer);
//        customerManager.Save();
//        customerManager.Delete();
//
//        Company company = new Company();
//        company.TaxNumber = "10000000";
//        company.CompanyName = "Arçelik";
//        company.id = 100;
//
//        CustomerManager customerManager1 = new CustomerManager(new Person());
//
//        Customer c1 = new Customer();
//        Customer c2 = new Person();
//        Customer c3 = new Company();

        CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
        customerManager.GiveCredit();
    }

    static class CreditManager {
        public void Calculate() {
            System.out.println("Hesaplandi");
        }

        public void Save() {
            System.out.println("Kredi verildi");
        }
    }

    static abstract class BaseCreditManger implements CreditService {

        public abstract void Calculate();

        public void Save() {
            System.out.println("Kredi verildi");
        }
    }

    interface CreditService {
        void Calculate();

        void Save();
    }

    static class TeacherCreditManager extends BaseCreditManger implements CreditService {

        @Override
        public void Calculate() {
            System.out.println("Öğretmen kredisi hesaplandı");
        }

    }

    static class MilitaryCreditManager extends BaseCreditManger implements CreditService {
        @Override
        public void Calculate() {
            System.out.println("Asker kredisi hesaplandı");
        }

    }

    static class Customer {
        public Customer() {
            System.out.println("Musteri nesnesi calısti");
        }

        int id;
        String City;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCity() {
            return City;
        }

        public void setCity(String city) {
            City = city;
        }
    }

    static class Person extends Customer {
        String FirstName;
        String LastName;
        String NationalIdentity;

        public String getFirstName() {
            return FirstName;
        }

        public void setFirstName(String firstName) {
            FirstName = firstName;
        }

        public String getLastName() {
            return LastName;
        }

        public void setLastName(String lastName) {
            LastName = lastName;
        }


        public String getNationalIdentity() {
            return NationalIdentity;
        }

        public void setNationalIdentity(String nationalIdentity) {
            NationalIdentity = nationalIdentity;
        }
    }

    static class Company extends Customer {
        String CompanyName;
        String TaxNumber;

        public String getCompanyName() {
            return CompanyName;
        }

        public void setCompanyName(String companyName) {
            CompanyName = companyName;
        }

        public String getTaxNumber() {
            return TaxNumber;
        }

        public void setTaxNumber(String taxNumber) {
            TaxNumber = taxNumber;
        }
    }

    static class CustomerManager {
        private Customer customer;
        private CreditService creditService;

        public CustomerManager(Customer customer, CreditService creditService) {
            this.customer = customer;
            this.creditService = creditService;
        }

        public void Save() {
            System.out.println("Müşteri eklendi : ");
        }

        public void Delete() {
            System.out.println("Müşteri silindi : ");
        }

        public void GiveCredit() {
            creditService.Calculate();
            System.out.println("Kredi verildi : ");
        }
    }
}
