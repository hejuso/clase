package GestionDeEmpleados;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

public class Empresa {

	// Atributos

	private String nombre = "Empresas CHACHIS S.L.";
	private int antiguedadEmpresa = 5;
	private int maxTrabajadores;
	private int numTrabajadores;
	private Trabajador[] trabajadores;

	// constructor

	public Empresa() {

		int i = 0;

		Scanner in = null;
		try {

			in = new Scanner(new FileReader("TrabajadoresEmpresa.txt"));
			maxTrabajadores = in.nextInt();
			trabajadores = new Trabajador[maxTrabajadores];

			while (in.hasNext()) {

				String nombreT = in.next();
				String dniT = in.next();
				int antiguedadT = in.nextInt();
				int salarioT = in.nextInt();
				String departamentoT = in.next();

				Trabajador t = new Trabajador(nombreT, dniT, antiguedadT,
						salarioT, departamentoT);
				trabajadores[i] = t;
				i++;
			}
			numTrabajadores = i;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			in.close();

		}
	}

	// Metodos

	public int getNumMaximoTrabajadores() {

		return maxTrabajadores;
	}

	public int getNumTrabajadores() {

		return numTrabajadores;
	}

	public String getNombreEmpresa() {

		return nombre;
	}

	public boolean existeEmpleado(String numDni) {

		int i = 0;

		boolean encontrado = false;
		while (i < numTrabajadores && !encontrado) {

			if (numDni.equals(trabajadores[i].getDNI())) {
				encontrado = true;
			}
			i++;
		}

		return encontrado;
	}

	public void anyadirEmpleado(Trabajador e) {

		boolean existe = existeEmpleado(e.getDNI());

		System.out.println("Comprobacion de existencia: " + existe);

		if (numTrabajadores < maxTrabajadores) {

			if (!existe) {

				boolean insertado = false;
				for (int i = 0; i < maxTrabajadores && !insertado; i++) {

					if (trabajadores[i] == null) {
						trabajadores[i] = e;
						numTrabajadores++;
						System.out.println("Num trabaj tras añadir empleado: "
								+ numTrabajadores);
						// break;
						insertado = true;
					}

				}

			} else {

				System.out
						.println("Se ha excedido el número máximo de empleados.");
			}
		}

	}

	public String cancelarEmpleado(String numDni) {

		boolean existe = existeEmpleado(numDni);
		int i = 0;
		String cancelado = "Imposible realizar la cancelacion: el DNI "
				+ numDni + " no existe";

		if (existe) {

			while (i != maxTrabajadores) {

				if (trabajadores[i] != null
						&& trabajadores[i].getDNI().equals(numDni)) {

					trabajadores[i] = null;

					cancelado = "Empleado borrado del sistema";

				}

				i++;
			}

		}

		return (cancelado);
	}

	public int getIdEmpleado(String numDni) {
		int i;
		int idTrabajador = 0;
		boolean existe = false;

		for (i = 0; i < maxTrabajadores && !existe; i++) {

			if (numDni.equals(trabajadores[i].getDNI())) {

				idTrabajador = 1;
				existe = true;

			}

		}

		return idTrabajador;
	}

	public String getInfoEmpleado(String numDni) {

		int i = 0;
		int posicion = getIdEmpleado(numDni);
		boolean existe = false;
		String datos = null;

		while (existe) {

			if (i == posicion) {

				datos = trabajadores[i].getNombre() + " "
						+ trabajadores[i].getDNI() + " "
						+ trabajadores[i].getAntiguedad() + " "
						+ trabajadores[i].getSalario() + " "
						+ trabajadores[i].getDepartamento();
				existe = true;
			}

			i++;
		}
		return datos;

	}

	public String listarEmpleados() {
		int i;
		String datos = "";

		for (i = 0; i < maxTrabajadores; i++) {
			if (trabajadores[i] != null) {
				
				if(trabajadores[i].getAntiguedad()>2){
					
					datos = datos + trabajadores[i].toString() + "\n";
					
				}
				

			}

			/*
			 * datos = trabajadores[i].getNombre() + " " +
			 * trabajadores[i].getDNI() + " " + trabajadores[i].getAntiguedad()
			 * + " " + trabajadores[i].getSalario() + " " +
			 * trabajadores[i].getDepartamento();
			 */

		}

		return datos;
	}

	public void guardar(PrintWriter out) {
		out = null;
		int i = 0;
		try {

			out = new PrintWriter("TrabajadoresEmpresa.txt");
			/*
			 * for (i = 0; i < maxTrabajadores; i++) {
			 * 
			 * 
			 * out.println(trabajadores[i].getNombre() + " " +
			 * trabajadores[i].getDNI() + " " + trabajadores[i].getAntiguedad()
			 * + " " + trabajadores[i].getSalario() + " " +
			 * trabajadores[i].getDepartamento());
			 * 
			 * 
			 * }
			 */
			out.println(maxTrabajadores);
			out.println(listarEmpleados());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			out.close();

		}

	}

	public void toHistograma() {

		int histograma[] = new int[antiguedadEmpresa + 1];
		int i;

		int j;

		for (i = 0; i < maxTrabajadores && trabajadores[i] != null; i++) {

			histograma[trabajadores[i].getAntiguedad()]++;

		}

		for (i = 0; i < antiguedadEmpresa + 1; i++) {

			System.out.print("Con " + i + " año de antiguedad: ");

			for (j = 0; j < histograma[i]; j++) {

				System.out.print(" * ");
			}
			System.out.println("");

		}

	}

}
