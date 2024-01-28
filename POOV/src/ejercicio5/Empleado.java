package ejercicio5;

import java.time.LocalDate;

public class Empleado {
	private String nombre;
    private double sueldo;
    private LocalDate fechaContrato;
    public Empleado(String nombre, double sueldo, LocalDate fechaContrato) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fechaContrato = fechaContrato;
    }
    public String dameNombre() {
        return nombre;
    }
    public double dameSueldo() {
        return sueldo;
    }
    public LocalDate dameFechaContrato() {
        return fechaContrato;
    }

    public void subeSueldo(double porcentajeAumento) {
        this.sueldo *= (1 + porcentajeAumento / 100);
    }
}

