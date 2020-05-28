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

    double bonusAmount;

    public void setBonusAmount(double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public void calculatePay(){
        for (PayrollEmployee employee:payrollEmployeeMap.values()){
            employee.setPaycheckTotal();
            if (employee instanceof Bonus){
                ((Bonus) employee).receiveBonus(bonusAmount);
            }
            if (employee instanceof Insurance){
                ((Insurance) employee).payInsurance();
            }
            }
        }

    }
