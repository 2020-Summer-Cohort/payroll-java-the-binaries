import java.util.Scanner;

public class PayrollApp {

    public static void main(String[] args) {

        // create objects

        PayrollHourly employeeHourly1 = new PayrollHourly(001, "Joey", "Tribbiani");
        PayrollHourly employeeHourly2 = new PayrollHourly(002, "Ross", "Geller");
        PayrollSales employeeSales1 = new PayrollSales(003, "Rachel","Green");
        PayrollDeveloper employeeDeveloper1 = new PayrollDeveloper(004, "Chandler","Bing");
        PayrollDeveloper employeeDeveloper2 = new PayrollDeveloper(005, "Phoebe", "Buffay");
        PayrollDeveloper employeeDeveloper3 = new PayrollDeveloper(006, "Jill", "Green");
        PayrollExecutive employeeExecutive1 = new PayrollExecutive(007, "Monica", "Geller");



        // create payrollEmployees (payrollEmployeeMap) to interact with all employees
        CompanyRoster payrollEmployees = new CompanyRoster();
        payrollEmployees.addEmployee(employeeHourly1);
        payrollEmployees.addEmployee(employeeHourly2);
        payrollEmployees.addEmployee(employeeSales1);
        payrollEmployees.addEmployee(employeeDeveloper1);
        payrollEmployees.addEmployee(employeeDeveloper2);
        payrollEmployees.addEmployee(employeeDeveloper3);
        payrollEmployees.addEmployee(employeeExecutive1);

        // create a method to list all employees
        for (PayrollEmployee employee : payrollEmployees.retrieveAllEmployees()) {
            System.out.println((employee.getFirstName() + " " + employee.getLastName() + " - " + "EmployeeID: " + employee.getEmployeeID()));
        }

        //prompt user to enter information about the pay period
        Scanner scanner = new Scanner(System.in);

        for (PayrollEmployee employee : payrollEmployees.retrieveAllEmployees()) {

            if (employee instanceof PayrollHourly) {
                System.out.println("To proceed enter the information about the pay period as prompted.");
                System.out.println("Please enter hours worked for " + employee.getFirstName() + " " + employee.getLastName() + ".");
                int enteredHoursWorked = scanner.nextInt();
                ((PayrollHourly) employee).setHoursWorked(enteredHoursWorked);
                employee.setPaycheckTotal();
            }
        }

        System.out.println("Enter total bonus amount.");
        double enteredBonusAmount = scanner.nextDouble();
        payrollEmployees.setBonusAmount(enteredBonusAmount);

        for (PayrollEmployee employee : payrollEmployees.retrieveAllEmployees()) {

            if (employee instanceof PayrollSales){
                System.out.println("Enter sales commission amount for " + employee.getFirstName() + " " + employee.getLastName() + ".");
                double enteredCommissionAmount = scanner.nextDouble();
                ((PayrollSales) employee).setSalesCommission(enteredCommissionAmount);
                employee.setPaycheckTotal();
            }

            if (employee instanceof PayrollDeveloper){
                employee.setPaycheckTotal();
            }

            if (employee instanceof PayrollExecutive){
                employee.setPaycheckTotal();
            }

        }
        payrollEmployees.calculatePay();
        System.out.println(" - Employee Check Totals - ");
        for (PayrollEmployee employee : payrollEmployees.retrieveAllEmployees()) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " : $" + (employee.getPaycheckTotal()));
        }


    }
}
