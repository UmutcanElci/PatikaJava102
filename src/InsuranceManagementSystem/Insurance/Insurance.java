package InsuranceManagementSystem.Insurance;

import InsuranceManagementSystem.Accounts.User;

import java.util.Date;

public abstract class Insurance {
    private String insuranceName;
    private double insurancePrice;
    private Date insuranceDate;
    private User user;
    public abstract double calculate(double insurancePrice);

    public Insurance(String insuranceName, double insurancePrice, Date insuranceDate, User user) {
        this.insuranceName = insuranceName;
        this.insurancePrice = insurancePrice;
        this.insuranceDate = insuranceDate;
        this.user = user;
        System.out.println(getInsuranceName() + " " + getInsuranceDate() + " " + getInsurancePrice() );
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public double getInsurancePrice() {
        return insurancePrice;
    }

    public Date getInsuranceDate() {
        return insuranceDate;
    }
}
