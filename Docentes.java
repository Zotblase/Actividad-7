import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Docentes {
    private int numeroDeLegajo;
    private String nombreYApellido;
    private String fechaDeNacimiento;
    private int salario;

    private final int PLUS_RURALIDAD = 30000;

    public void calcular_plus(){}

    public int getEdad(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fechaDeNacimiento, fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
        return periodo.getYears();
    }

    public int getNumeroDeLegajo() {
        return numeroDeLegajo;
    }

    public void setNumeroDeLegajo(int numeroDeLegajo) {
        this.numeroDeLegajo = numeroDeLegajo;
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getPLUS_RURALIDAD() {
        return PLUS_RURALIDAD;
    };

    
}
