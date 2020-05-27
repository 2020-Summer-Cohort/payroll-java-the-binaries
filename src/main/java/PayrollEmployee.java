public class PayrollEmployee {

    // create fields
    private int employeeID;
    private String firstName;
    private String lastName;
    protected double paycheckTotal;

    // create constructor
    public PayrollEmployee(int employeeID, String firstName, String lastName, double paycheckTotal) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.paycheckTotal = paycheckTotal;
    }

    // create getter methods
    public int getEmployeeID() {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getPaycheckTotal() {
        return paycheckTotal;
    }

    // Methods
//    void access;
//    void setPaycheckTotal;
}
