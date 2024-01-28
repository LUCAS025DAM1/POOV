package reus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empleado {
	private String nombre;
    private double sueldo;
    private LocalDate fechaContrato;

    public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
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
    public void subeSueldo(double porcentajeAumento) {
        this.sueldo *= (1 + porcentajeAumento / 100);
    }
}

