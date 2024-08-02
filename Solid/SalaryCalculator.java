import Employees.Employee;

public class SalaryCalculator {

    public static int calculateSalary(Employee employee) {
        if (employee.tiempoParcial()) {
            return (employee.Versalario() / 2);
        } else {
            return employee.Versalario();
        }

    }

}
