public class PayrollDeveloper extends PayrollEmployee implements Bonus,Insurance{

    public PayrollDeveloper(int employeeID, String firstName, String lastName) {
        super(employeeID, firstName, lastName);
    }

    @Override
    public void setPaycheckTotal() {
        paycheckTotal = payPeriodEarnings;
    }

    @Override
    public void payInsurance() {
        paycheckTotal -= 80;
    }

    double payPeriodEarnings = 9000;

    @Override
    public void receiveBonus(double bonus) {
        paycheckTotal += bonus;
    }
}
