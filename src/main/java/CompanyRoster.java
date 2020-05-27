import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CompanyRoster {

    Map<String, PayrollEmployee> payrollEmployeeMap = new HashMap<>();

    public void addEmployee(PayrollEmployee employee) {
        payrollEmployeeMap.put((employee.getFirstName() + " " + employee.getLastName()), employee);
    }

    public Collection<PayrollEmployee> retrieveAllEmployees() {
        return payrollEmployeeMap.values();
    }
}
