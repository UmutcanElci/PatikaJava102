package InsuranceManagementSystem.Accounts;

import java.util.TreeSet;

public class AccountManager {
    TreeSet<Account> accounts;
    public void login(String mail,String password){
        try {
            for (Account account : accounts){
                account.login(mail,password);
            }
        }catch (InvalidAuthenticationException e){
            System.out.println(e);
        }
    }
}
