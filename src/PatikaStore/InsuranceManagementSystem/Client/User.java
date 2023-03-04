package PatikaStore.InsuranceManagementSystem.Client;

import PatikaStore.InsuranceManagementSystem.Client.Address.Address;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private String name;
    private String surName;
    private String email;
    private String password;
    private String job;
    private int age;
    private ArrayList<Address> addressArrayList = new ArrayList<>();
    private Date date;



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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Address> getAddressArrayList() {
        return addressArrayList;
    }

    public void setAddressArrayList(Address address) {
        this.addressArrayList.add(address);
    }
}
