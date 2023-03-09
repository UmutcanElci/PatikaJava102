package InsuranceManagementSystem.Insurance;

import InsuranceManagementSystem.Accounts.User;

import java.util.Date;

public class ResidenceInsurance extends Insurance{


    public ResidenceInsurance(String insuranceName, double insurancePrice, Date insuranceDate, User user) {
        super(insuranceName, insurancePrice, insuranceDate, user);
    }

    @Override
    public double calculate(double insurancePrice) {
     return insurancePrice*30;
    }
}
