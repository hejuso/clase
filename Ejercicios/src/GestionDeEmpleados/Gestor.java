package GestionDeEmpleados;

import java.io.PrintWriter;
import java.util.Scanner;

import TEMA5.Ejercicio3;

public class Gestor {

	public static int opcion;

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		Empresa e = new Empresa();

		System.out.println("*********** MENU PRINCIPAL ***********");
		System.out.println("1.Número de trabajadores");
		System.out.println("2.Buscar datos de un trabajador");
		System.out.println("3.Añadir un trabajador");
		System.out.println("4.Borrar un trabajador");
		System.out.println("5.Listar trabajadores");
		System.out.println("6.Histograma");
		System.out.println("0.Terminar");
		System.out.println("**************************************");
		System.out.println("Elige una opcion:");
		opcion = reader.nextInt();

		switch (opcion) {

		case 1:

			System.out.println("El numero de trabajadores es: " +e.getNumMaximoTrabajadores());
			break;
			
		case 2:
			
			String numDni;
			System.out.println("Introduzca el DNI: ");
			numDni = reader.next();
			
			e.existeEmpleado(numDni);
			if (!e.existeEmpleado(numDni)){
				
				System.out.println("Este trabajador no existe.");
				
			}
			break;
			
		case 3:
			
			String anombre = null;
			String adni = null;
			int aantiguedad = 0;
			int asalario = 0;
			String adepartamento = null;
			
			System.out.println("Introduzca nombre del nuevo trabajador: ");
			anombre = reader.next();
			System.out.println("Introduzca DNI del nuevo trabajador: ");
			adni = reader.next();
			System.out.println("Introduzca antiguedad del nuevo trabajador: ");
			aantiguedad = reader.nextInt();
			System.out.println("Introduzca salario del nuevo trabajador: ");
			asalario = reader.nextInt();
			System.out.println("Introduzca departamento del nuevo trabajador: ");
			adepartamento = reader.next();
			
			Trabajador t = new Trabajador(anombre, adni, aantiguedad, asalario, adepartamento);
			
			e.anyadirEmpleado(t);
			break;

		case 4:
			
			numDni=null;
			
			e.listarEmpleados();
			System.out.println("Introduzca el DNI del empleado que desea eliminar: ");
			numDni = reader.next();
			e.cancelarEmpleado(numDni);
			break;
			
		case 5:
			e.listarEmpleados();
			break;
		case 6:
			e.toHistograma();
			break;
		case 0:
			PrintWriter out = null;
			e.guardar(out);
			System.exit(0);
			break;
		}

	}

}
