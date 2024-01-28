package ejercicio4;

public class Empleado {
	private String nombre;
    private double sueldo;
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    public String dameNombre() {
        return nombre;
    }

    public double dameSueldo() {
        return sueldo;
    }
}
