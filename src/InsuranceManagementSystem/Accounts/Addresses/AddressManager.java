package InsuranceManagementSystem.Accounts.Addresses;

import InsuranceManagementSystem.Accounts.User;

import java.util.Scanner;

public class AddressManager {
    static Scanner in = new Scanner(System.in);
    private static User user;
    public static void addAddressToUser(Address address){
        user.getAddressList().add(address);
    }

    public static void deleteAddressToUser(Address address){
        user.getAddressList().remove(address);
    }

    public static Address addAddress(String city,String street,int no){
        int choice = 0;
        System.out.println("To add Home Address press - 1 - \n To add Business Address press - 2 -");
        choice = in.nextInt();
        if (choice == 1){
            System.out.println("Enter the city : ");
            city = in.next();
            System.out.println("Enter the street : ");
            street = in.next();
            System.out.println("Enter the no :");
            no = in.nextInt();
            return new HomeAddress(city,street,no);
        }else {
            System.out.println("Enter the city : ");
            city = in.next();
            System.out.println("Enter the street : ");
            street = in.next();
            System.out.println("Enter the no :");
            no = in.nextInt();
            return new BusinessAddress(city,street,no);
        }
    }
}
