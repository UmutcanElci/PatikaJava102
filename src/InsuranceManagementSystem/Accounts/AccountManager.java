package InsuranceManagementSystem.Accounts;

import InsuranceManagementSystem.Accounts.Addresses.Address;
import InsuranceManagementSystem.Insurance.*;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager {
    Account account;
    TreeSet<Account> accounts;
    User user;
    static Scanner in = new Scanner(System.in);
    public AccountManager() {

    }
    public void createAccount(){
        user = new User("Umut","Elci","Umutcan@","2341234","Student",18);
        addInsurance(user);
    }
    public Insurance addInsurance(User user){
        int choice = 0;
        System.out.println("What insurance you want to add : ");
        choice = in.nextInt();
        if (choice == 1){
            return new CarInsurance("Car Insurance",12.0,Date.from(Instant.now()),user);
        }if (choice == 2){
            return new HealthInsurance("Health Insurance",12.0,Date.from(Instant.now()),user);
        }if (choice == 3){
            return new TravelInsurance("Travel Insurance",12.0,Date.from(Instant.now()),user);
        }if (choice == 4){
            return new ResidenceInsurance("Residence Insurance",12.0,Date.from(Instant.now()),user);
        }else {
            System.out.println("Wrong input!");
        }

        return null;
    }



    public void login(String mail, String password){
        try {
            for (Account account : accounts){
                account.login(mail,password);
            }
        }catch (InvalidAuthenticationException e){
            System.out.println(e);
        }
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public TreeSet<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(TreeSet<Account> accounts) {
        this.accounts = accounts;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
