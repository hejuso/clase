package GestionDeEmpleados;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Empresa {

	// Atributos

	private String nombre = "Empresas CHACHIS S.L.";
	private int antiguedadEmpresa;
	private int maxTrabajadores;
	private int numTrabajadores;
	private Trabajador[] trabajadores;

	// constructor

	public Empresa() {

		int numTrab = 0;
		int i = 0;

		Scanner in = null;
		try {

			in = new Scanner(new FileReader("TrabajadoresEmpresa.txt"));
			while (in.hasNext()) {

				String nombreT = in.next();
				String dniT = in.next();
				int antiguedadT = in.nextInt();
				int salarioT = in.nextInt();
				String departamentoT = in.next();

				Trabajador t = new Trabajador(nombreT, dniT, antiguedadT,
						salarioT, departamentoT);
				trabajadores[i] = t;

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			in.close();

		}
	}

	// Metodos
	
	public int getNumMaximoTrabajadores(){
		
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

		if (!existe) {

			boolean insertado = false;
			for (int i = 0; i < maxTrabajadores && !insertado; i++) {

				if (trabajadores[i] == null) {
					trabajadores[numTrabajadores] = e;
					numTrabajadores++;
					System.out.println("Num trabaj tras añadir empleado: "
							+ numTrabajadores);
					// break;
					insertado = true;
				}  

			}

		}

		if (numTrabajadores < maxTrabajadores) {

			System.out.println("Se ha excedido el número máximo de empleados.");
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
}
