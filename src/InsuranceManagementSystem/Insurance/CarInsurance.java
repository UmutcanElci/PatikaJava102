package InsuranceManagementSystem.Insurance;

import InsuranceManagementSystem.Accounts.User;

import java.util.Date;

public class CarInsurance extends Insurance{


    public CarInsurance(String insuranceName, double insurancePrice, Date insuranceDate, User user) {
        super(insuranceName, insurancePrice, insuranceDate, user);
    }

    @Override
    public double calculate(double insurancePrice) {
        return insurancePrice*35;
    }


}
