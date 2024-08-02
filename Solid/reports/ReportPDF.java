package reports;

public class ReportPDF implements Report {

    public void GenerarReporte() {
        System.out.println("Se está generando el reporte PDF");
    }

    public void saveToFile() {
        System.out.println("Se guardó el archivo PDF");
    }

}