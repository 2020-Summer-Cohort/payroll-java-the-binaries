public abstract class PayrollExecutive extends PayrollEmployee implements Bonus{

    public PayrollExecutive(int employeeID, String firstName, String lastName, double paycheckTotal) {
        super(employeeID, firstName, lastName, paycheckTotal);
    }

    @Override
    public void receiveBonus(double bonus) {
        paycheckTotal += bonus *3;
    }
    public void payInsurance() {
        double insurance = 10;
    }

    double payPeriodEarnings = 20000;
}
