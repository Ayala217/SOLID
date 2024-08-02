package Employees;

public class Marketing implements Employee {

    private String nombre;
    private boolean partTime;

    public int Versalario() {
        return 10000;
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

    public Marketing(String nombre, boolean partTime) {
        this.nombre = nombre;
        this.partTime = partTime;
    }

}
