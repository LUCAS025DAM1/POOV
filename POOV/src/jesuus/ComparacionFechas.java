package jesuus;

import java.time.LocalDate;
import java.util.Scanner;

public class ComparacionFechas {

	public static void main(String[] args) {
		 Empleado empleado3 = crearEmpleadoConFechaContrato("Empleado3");
	        Empleado empleado4 = crearEmpleadoConFechaContrato("Empleado4");
	        compararFechasContrato(empleado3, empleado4);
	    }
	    public static Empleado crearEmpleadoConFechaContrato(String nombre) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el sueldo para " + nombre + ":");
	        double sueldo = scanner.nextDouble();

	        System.out.println("Ingrese el año de contrato para " + nombre + ":");
	        int anio = scanner.nextInt();

	        System.out.println("Ingrese el mes de contrato para " + nombre + ":");
	        int mes = scanner.nextInt();

	        System.out.println("Ingrese el día de contrato para " + nombre + ":");
	        int dia = scanner.nextInt();

	        return new Empleado(nombre, sueldo, anio, mes, dia);
	    }
	    public static void compararFechasContrato(Empleado empleado1, Empleado empleado2) {
	        LocalDate fechaContratoEmpleado1 = empleado1.getFechaContrato();
	        LocalDate fechaContratoEmpleado2 = empleado2.getFechaContrato();

	        if (fechaContratoEmpleado1.isBefore(fechaContratoEmpleado2)) {
	            System.out.println(empleado1.dameNombre() + " fue contratado antes que " + empleado2.dameNombre());
	        } else if (fechaContratoEmpleado1.isAfter(fechaContratoEmpleado2)) {
	            System.out.println(empleado2.dameNombre() + " fue contratado antes que " + empleado1.dameNombre());
	        } else {
	            System.out.println("Ambos fueron contratados en la misma fecha.");
	        }
	    }
	}
