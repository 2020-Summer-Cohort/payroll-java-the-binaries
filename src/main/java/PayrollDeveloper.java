public abstract class PayrollDeveloper extends PayrollEmployee implements Bonus{

    public PayrollDeveloper(int employeeID, String firstName, String lastName, double paycheckTotal) {
        super(employeeID, firstName, lastName, paycheckTotal);
    }

    public void payInsurance() {
        double insurance = 80;
    }

    double payPeriodEarnings = 9000;
}
