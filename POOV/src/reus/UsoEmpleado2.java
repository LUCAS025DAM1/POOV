package reus;

public class UsoEmpleado2 {

	public static void main(String[] args) {
        Empleado empleado2 = new Empleado("Nombre", 4000.0, 2021, 6, 15);

        System.out.println("Sueldo actual de Lucas2: " + empleado2.dameSueldo());

        empleado2.subeSueldo(10);

        System.out.println("Nuevo sueldo de Lucas2: " + empleado2.dameSueldo());
    }
}

