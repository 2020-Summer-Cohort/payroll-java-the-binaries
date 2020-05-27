public abstract class PayrollSales extends PayrollEmployee implements Bonus {

    public PayrollSales(int employeeID, String firstName, String lastName, double paycheckTotal) {
        super(employeeID, firstName, lastName, paycheckTotal);
    }

    double salesCommission;
    double payPeriodEarnings = 3000;
}
