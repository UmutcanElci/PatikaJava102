package InsuranceManagementSystem.Insurance;

public class TravelInsurance extends Insurance{
    @Override
    public double calculate(double insurancePrice) {
        return insurancePrice*7;
    }
}
