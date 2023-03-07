package InsuranceManagementSystem.Insurance;

public class ResidenceInsurance extends Insurance{
    @Override
    public double calculate(double insurancePrice) {
     return insurancePrice*30;
    }
}
