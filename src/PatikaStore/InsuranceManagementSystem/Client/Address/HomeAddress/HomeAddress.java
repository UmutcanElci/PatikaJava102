package PatikaStore.InsuranceManagementSystem.Client.Address.HomeAddress;

import PatikaStore.InsuranceManagementSystem.Client.Address.Address;

public class HomeAddress implements Address {
    private String country;
    private String city;
    private String street;
    private String alley;
    private int homeNo;

    public HomeAddress(String country, String city, String street, String alley, int homeNo) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.alley = alley;
        this.homeNo = homeNo;
    }
    @Override
    public void printAddress() {

    }
}
