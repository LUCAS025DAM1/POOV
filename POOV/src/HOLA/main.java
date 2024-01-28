package HOLA;

public class main {

	public static void main(String[] args) {
		 Empleado empleado1 = new Empleado("Tu Nombre", 3000.0, 2022, 1, 1);

	        System.out.println("Nombre: " + empleado1.dameNombre());
	        System.out.println("Sueldo: " + empleado1.dameSueldo());
	        System.out.println("Fecha de Contrato: " + empleado1.dameFechaContrato());
	    }
	}

