public class PayrollExecutive extends PayrollEmployee implements Bonus,Insurance{

    public PayrollExecutive(int employeeID, String firstName, String lastName) {
        super(employeeID, firstName, lastName);
    }

    @Override
    public void setPaycheckTotal() {
        paycheckTotal = payPeriodEarnings;
    }

    @Override
    public void receiveBonus(double bonus) {
        paycheckTotal += bonus *3;
    }

    @Override
    public void payInsurance() {
        paycheckTotal -= 10;
    }

    double payPeriodEarnings = 20000;
}
