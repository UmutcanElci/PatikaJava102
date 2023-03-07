package InsuranceManagementSystem.Accounts.Addresses;

public class HomeAddress implements Address{
    private String City;
    private String street;
    private int no;

    public HomeAddress(String city, String street, int no) {
        City = city;
        this.street = street;
        this.no = no;
    }


    @Override
    public void add(String City, String street, int no) {

    }

    @Override
    public void delete() {

    }
}
