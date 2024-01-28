package HOLA;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Empleado {
	private String nombre;
    private double sueldo;
    private LocalDate fechaContrato;
    public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
        this.nombre = "Lucas Román Velásquez";
        this.sueldo = 3000;
        this.fechaContrato = LocalDate.of(anio, mes, dia);
    }
    public String dameNombre() {
        return nombre;
    }
    public double dameSueldo() {
        return sueldo;
    }
    public String dameFechaContrato() {
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return fechaContrato.format(formatoFecha);
    }
}