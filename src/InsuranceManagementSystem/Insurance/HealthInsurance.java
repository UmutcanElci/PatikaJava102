package InsuranceManagementSystem.Insurance;

public class HealthInsurance extends Insurance{
    @Override
    public double calculate(double insurancePrice) {
        return insurancePrice*5;
    }
}
