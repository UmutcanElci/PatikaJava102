package PatikaStore.InsuranceManagementSystem;

import PatikaStore.InsuranceManagementSystem.Client.Address.Address;
import PatikaStore.InsuranceManagementSystem.Client.Address.AddressManager;
import PatikaStore.InsuranceManagementSystem.Client.Address.HomeAddress.HomeAddress;

import static PatikaStore.InsuranceManagementSystem.Client.Address.AddressManager.addAddress;

public class InsuranceApp {
    public static void main(String[] args) {
        Address homeAddress = new HomeAddress("AF","234","ASDF","523",2);
        AddressManager.addAddress(homeAddress);
        AddressManager.listAddress();
    }
}
