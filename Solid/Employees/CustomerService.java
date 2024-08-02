package Employees;

public class CustomerService implements Employee {
    private String nombre;
    private boolean partTime;

    public int Versalario() {
        return 2000;
    }

    public String getName() {
        return nombre;
    }

    public Class<?> getDepartment() {
        return this.getClass();
    }

    public boolean tiempoParcial() {
        return partTime;
    }

    public CustomerService(String nombre, boolean partTime) {
        this.nombre = nombre;
        this.partTime = partTime;
    }

}
