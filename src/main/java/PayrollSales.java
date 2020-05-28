public class PayrollSales extends PayrollEmployee implements Bonus {

    public PayrollSales(int employeeID, String firstName, String lastName) {
        super(employeeID, firstName, lastName);
    }

    double salesCommission;

    double payPeriodEarnings = 3000;

    public void setSalesCommission(double salesCommission) {
        this.salesCommission = salesCommission;
    }

    @Override
    public void receiveBonus(double bonus) {
        paycheckTotal += bonus;
    }

    @Override
    public void setPaycheckTotal() {
        paycheckTotal = salesCommission + payPeriodEarnings;
    }
}
