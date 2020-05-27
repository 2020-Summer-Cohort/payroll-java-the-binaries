public abstract class PayrollHourly extends PayrollEmployee {

    public PayrollHourly(int employeeID, String firstName, String lastName, double paycheckTotal) {
        super(employeeID, firstName, lastName, paycheckTotal);
    }

    int hoursWorked;

    double hourlyRate = 20;

}
