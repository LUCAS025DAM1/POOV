package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class UsoBucle {

	public static void main(String[] args) {
		List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Juan", 3000.0));
        listaEmpleados.add(new Empleado("María", 3500.0));
        listaEmpleados.add(new Empleado("Carlos", 4000.0));
        for (Empleado empleado : listaEmpleados) {
            System.out.println("Nombre: " + empleado.dameNombre() + ", Sueldo: " + empleado.dameSueldo());
        }
    }
}



