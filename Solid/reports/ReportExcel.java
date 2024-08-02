package reports;

public class ReportExcel implements Report {

    public void GenerarReporte() {
        System.out.println("Se está generando el reporte Excel");
    }

    public void saveToFile() {
        System.out.println("Se guardó el archivo Xlsx");
    }

}