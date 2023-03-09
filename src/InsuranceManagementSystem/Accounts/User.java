package InsuranceManagementSystem.Accounts;

import InsuranceManagementSystem.Accounts.Addresses.Address;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class User {
    private String name;
    private String surName;
    private String email;
    private String password;
    private String career;
    private int age;
    private ArrayList<Address> addressList;
    private Date date;

    public User() {
    }

    public User(String name, String surName, String email, String password, String career, int age) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.password = password;
        this.career = career;
        this.age = age;
        this.date=Date.from(Instant.now());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(ArrayList<Address> addressList) {
        this.addressList = addressList;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
