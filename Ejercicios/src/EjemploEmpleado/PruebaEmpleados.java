package EjemploEmpleado;

import EjemploEmpleado.*;

public class PruebaEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado e = new Empleado("Juan", 1000,2001);
		System.out.println("Empleado: "+ e.getNombre());
		Jefe j = new Jefe("Pedro", 1200, 1999, 0.5f);
		System.out.println("Jefe: "+ j.getNombre());
		
		System.out.println("Get salario: "+j.getSalario());
		System.out.println("Descripcion: "+j.getDescription());
	}

}