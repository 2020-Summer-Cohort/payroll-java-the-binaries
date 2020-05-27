import java.util.Scanner;

public class PayrollApp {

    public static void main(String[] args) {

        // create objects

        PayrollEmployee employee1 = new PayrollEmployee(001, "Claudia", "Barrales",10);
        PayrollEmployee employee2 = new PayrollEmployee(002, "Kendyl", "Hull", 10);

        // create payrollEmployees (payrollEmployeeMap) to interact with all employees
        CompanyRoster payrollEmployees = new CompanyRoster();
        payrollEmployees.addEmployee(employee1);
        payrollEmployees.addEmployee(employee2);

        // create a method to list all employees
        for (PayrollEmployee employee:payrollEmployees.retrieveAllEmployees()){
            System.out.println((employee.getFirstName() + " " + employee.getLastName() + " - " + "EmployeeID: " + employee.getEmployeeID()));
        }

        //prompt user to enter information about the pay period
        Scanner scanner = new Scanner(System.in);
        int numberOfPayrollHours = scanner.nextInt();
        scanner.nextLine();

        System.out.println("");


    }
}
