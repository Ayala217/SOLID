import Employees.CustomerService;
import Employees.Employee;
import Employees.Marketing;
import reports.Report;
import reports.ReportExcel;
import reports.ReportPDF;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Employee juan = new Marketing("juan", false);
        Employee Lolito = new CustomerService("Lolito", true);
        Report reportePDF = new ReportPDF();
        Report reporteExcel = new ReportExcel();
        List<Employee> Employees = new ArrayList<>();
        Employees.add(Lolito);
        Employees.add(juan);

        // RealizarReporte(juan, reportePDF);
        // RealizarReporte(Lolito, reporteExcel);
        RealizarReporteMultiple(Employees, reporteExcel);

    }

    // private Reporte Reporte;

    public static void RealizarReporte(Employee employee, Report reporte) {

        System.out.println(
                "el empleado " + employee.getName() + " del departamento de " + employee.getClass().getSimpleName()
                        + " tiene un salario de: " + SalaryCalculator.calculateSalary(employee));
        reporte.GenerarReporte();
        reporte.saveToFile();

    }

    public static void RealizarReporteMultiple(List<Employee> employees, Report reporte) {
        for (Employee employee : employees) {
            System.out.println(
                    "el empleado " + employee.getName() + " del departamento de " + employee.getClass().getSimpleName()
                            + " tiene un salario de: " + SalaryCalculator.calculateSalary(employee));

        }
        reporte.GenerarReporte();
        reporte.saveToFile();
    }

}
