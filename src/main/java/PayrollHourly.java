public class PayrollHourly extends PayrollEmployee {

    public PayrollHourly(int employeeID, String firstName, String lastName) {
        super(employeeID, firstName, lastName);
    }

    int hoursWorked;

    double hourlyRate = 20;

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void setPaycheckTotal(){
        paycheckTotal = hoursWorked * hourlyRate;
    }
}
