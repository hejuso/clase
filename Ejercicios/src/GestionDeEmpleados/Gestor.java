package GestionDeEmpleados;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Gestor {

	public static int opcion;

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		Empresa e = new Empresa();

		while (opcion != 32) {

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
				System.out.println("");
				System.out.println("El numero de trabajadores es: "
						+ e.getNumTrabajadores());
				System.out.println("");
				break;

			case 2:
				System.out.println("");
				String numDni;
				System.out.println("Introduzca el DNI: ");
				numDni = reader.next();

				System.out.println(e.existeEmpleado(numDni));
				if (!e.existeEmpleado(numDni)) {

					System.out.println("Este trabajador no existe.");

				}
				System.out.println("");
				break;

			case 3:

				String anombre = null;
				String adni = null;
				int aantiguedad = 0;
				int asalario = 0;
				String adepartamento = null;

				System.out.println("");

				System.out.println("Introduzca nombre del nuevo trabajador: ");
				anombre = reader.next();
				System.out.println("Introduzca DNI del nuevo trabajador: ");
				adni = reader.next();
				System.out
						.println("Introduzca antiguedad del nuevo trabajador: ");
				aantiguedad = reader.nextInt();
				System.out.println("Introduzca salario del nuevo trabajador: ");
				asalario = reader.nextInt();
				System.out
						.println("Introduzca departamento del nuevo trabajador: ");
				adepartamento = reader.next();

				Trabajador t = new Trabajador(anombre, adni, aantiguedad,
						asalario, adepartamento);

				e.anyadirEmpleado(t);
				System.out.println("");
				break;

			case 4:
				System.out.println("");
				numDni = null;

				e.listarEmpleados();
				System.out
						.println("Introduzca el DNI del empleado que desea eliminar: ");
				numDni = reader.next();
				e.cancelarEmpleado(numDni);
				System.out.println("");
				break;

			case 5:
				System.out.println("");
				System.out.println("Empleados: ");
				System.out.println(e.listarEmpleados());
				System.out.println("");
				break;
			case 6:
				System.out.println("");
				e.toHistograma();
				System.out.println("");
				break;
			case 0:
				System.out.println("");
				PrintWriter out = null;
				try {
					out = new PrintWriter("TrabajadoresEmpresa");
					e.guardar(out);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					out.close();
				}

				System.out.println("");
				System.exit(0);

				break;
			}
		}

	}

}
