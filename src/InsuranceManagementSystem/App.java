package InsuranceManagementSystem;

import InsuranceManagementSystem.Accounts.Account;
import InsuranceManagementSystem.Accounts.AccountManager;

public class App {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        accountManager.createAccount();
    }
}
