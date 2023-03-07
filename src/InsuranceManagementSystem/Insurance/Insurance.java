package InsuranceManagementSystem.Insurance;

import java.util.Date;

public abstract class Insurance {
    private String insuranceName;
    private double insurancePrice;
    private Date insuranceDate;
    public abstract double calculate(double insurancePrice);
}
