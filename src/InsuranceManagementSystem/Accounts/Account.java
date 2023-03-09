package InsuranceManagementSystem.Accounts;

import InsuranceManagementSystem.Accounts.Addresses.Address;
import InsuranceManagementSystem.Insurance.Insurance;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Account implements Comparable<Account>{
    AuthenticationStatus authenticationStatus;
    private User user;
    private ArrayList<Insurance> insuranceArrayList;
    enum AuthenticationStatus{SUCCES,FAIL};
    public final void showUserInfo() {
        System.out.println("Account Info \n Name : "+ user.getName() + "\n Surname : " + user.getSurName() + "\n Email : "+ user.getEmail() + "\n Job : "+user.getCareer() + "\n Age : " + user.getAge());
    }

    public void login(String mail, String password) throws InvalidAuthenticationException {
        if (user.getEmail().equals(mail) && user.getPassword().equals(password)){
            authenticationStatus = AuthenticationStatus.SUCCES;
        }else {
            authenticationStatus = AuthenticationStatus.FAIL;
            throw new InvalidAuthenticationException();
        }
    }


    public void addAddress(Address address){
        user.getAddressList().add(address);
    }
    public void deleteAddress(Address address){
        user.getAddressList().remove(address);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getInsuranceArrayList() {
        return insuranceArrayList;
    }

    public void setInsuranceArrayList(ArrayList<Insurance> insuranceArrayList) {
        this.insuranceArrayList = insuranceArrayList;
    }

    @Override
    public int hashCode(){
        return Objects.hash(user);
    }


}
