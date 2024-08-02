import Employees.Employee;

public class SalaryCalculator {
int ModificadorSalarioPartTime = 2;
    public static int calculateSalary(Employee employee) {
        if (employee.tiempoParcial()) {
            return (employee.Versalario() / ModificadorSalarioPartTime);
        } else {
            return employee.Versalario();
        }

    }

}
