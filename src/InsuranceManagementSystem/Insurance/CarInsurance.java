package InsuranceManagementSystem.Insurance;

public class CarInsurance extends Insurance{
    @Override
    public double calculate(double insurancePrice) {
        return insurancePrice*35;
    }


}
