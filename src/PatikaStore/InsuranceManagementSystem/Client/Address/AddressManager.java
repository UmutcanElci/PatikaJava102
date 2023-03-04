package PatikaStore.InsuranceManagementSystem.Client.Address;

import PatikaStore.InsuranceManagementSystem.Client.Address.HomeAddress.HomeAddress;
import PatikaStore.InsuranceManagementSystem.Client.User;

public class AddressManager {
    static User user;
    public static void addAddress(Address address){
        user.getAddressArrayList().add(address);
    }
    public static void removeAddress(int index){
        user.getAddressArrayList().remove(index);
    }
    public  static  void listAddress(){
    }
    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        AddressManager.user = user;
    }
}
