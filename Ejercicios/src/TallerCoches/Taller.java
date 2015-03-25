package TallerCoches;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import Biblioteca.Usuario;
import GestionDeEmpleados.Trabajador;

public class Taller {

	// Atributos de instancia
	/* COMPLETAR */

	private String nombre = "TallerDeCoches";
	private String direccion;
	private String hora_apertura;
	private String hora_cierre;
	private int numCoches;
	private Coche[] coches;

	// Atributos de clase
	/** Numero maximo de coches en el taller. */
	private static int NUM_MAX_COCHES = 50;

	/**
	 * Construye un objeto de la clase {@code Taller} con direccion
	 * {@code direccion}, hora_apertura {@code hora_apertura}, hora_cierre
	 * {@code hora_cierre}, nombre {@code nombre} que será TallerdeCoches.
	 * 
	 * @param direccion_
	 *            String.
	 * @param hora_apertura_
	 *            String.
	 * @param hora_cierre_
	 *            String.
	 */
	Taller(String direccion_, String hora_apertura_, String hora_cierre_) {

		/* COMPLETAR */
		coches = new Coche[NUM_MAX_COCHES];

		nombre = "TallerDeCoches";
		direccion_ = direccion;
		hora_apertura_ = hora_apertura;
		hora_cierre_ = hora_cierre;
		cargar();

	}

	/**
	 * Devuelve los coches que tiene o ha tenido {@code coches} el Taller
	 * {@code Taller}.
	 * 
	 * @return String.
	 */
	public Coche[] getCoches() {
		return coches;
	}

	/**
	 * Devuelve la direccion {@code direccion} del {@code Taller}.
	 * 
	 * @return String.
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Devuelve la hora de apertura {@code hora_apertura} del {@code Taller}.
	 * 
	 * @return String.
	 */
	public String getHora_apertura() {
		return hora_apertura;
	}

	/**
	 * Devuelve la hora de cierre {@code hora_cierre} del {@code Taller}.
	 * 
	 * @return String.
	 */
	public String getHora_cierre() {
		return hora_cierre;
	}

	/**
	 * Dada una matricula {@code matricula}, devuelve un valor true si existe un
	 * coche con esa matrícula que ha estado en el Taller. En caso contrario,
	 * devuelve un valor false.
	 * 
	 * @param matricula
	 *            String.
	 */
	public boolean existeCoche(String matricula) {

		int i = 0;
		boolean encontrado = false;

		/* COMPLETAR */

		while (!encontrado) {

			if (coches[i] != null && matricula.equals(coches[i].getMatricula())) {

				encontrado = true;
				break;
			}
			i++;
		}

		return encontrado;

	}

	/**
	 * Dada un coche {@code coche}, añade el coche al array de coches del
	 * taller e incrementa el número de coches que están en el taller.
	 * 
	 * @param Coche
	 *            coche
	 * @return String.
	 */
	public String anyadirCoche(Coche coche) {

		String msg = "";
		boolean anyadido = false;
		if (!existeCoche(coche.getMatricula())) {
			for (int i = 0; i < coches.length && !anyadido; i++) {
				if (coches[i] == null) {
					coches[i] = coche;
					anyadido = true;
					numCoches++;
					msg = "El coche ha sido anyadido con éxito\n";
				}
			}
		} else {
			msg = "El coche ya está en el taller\n";
		}
		return msg;
	}

	/**
	 * Dado una matricula {@code matricula}, si existe un coche con esa
	 * matricula, el coche se borra del array de coches {@code coches} del
	 * Taller {@code Taller} y devuelve el {@code String}:
	 * "El coche ha sido eliminado con éxito" En caso contrario, la cancelacion
	 * no es posible y devuelve el {@code String}:
	 * "El coche no está en el taller"
	 * 
	 * @param String
	 *            matricula.
	 * @return String.
	 */
	public String borrarCoche(String matricula) {

		String msg = "";
		boolean comprobacion = false;
		int i = 0;
		/* COMPLETAR */

		while (!comprobacion) {

			if (coches[i] != null && matricula.equals(coches[i].getMatricula())) {

				coches[i] = null;
				msg = "El coche ha sido eliminado con �xito";
				comprobacion = true;
				break;
			} else {
				msg = "El coche no esta en el taller";
				comprobacion = true;
			}

			i++;
		}

		return msg;

	}

	/**
	 * Devuelve un {@code String} con los coches que están actualmente en el
	 * taller y que sean de un determinado modelo y tengan una determinada
	 * antiguedad.
	 * 
	 * @param String
	 *            modelo.
	 * @param int antiguedad.
	 * @return String.
	 */
	public String filtroCoches(String modelo, int antiguedad) {
		String listaCoches = "";
		int i;
		/* COMPLETAR */
		for (i = 0; i < NUM_MAX_COCHES; i++) {

			if (coches[i] != null && modelo.equals(coches[i].getModelo())
					&& antiguedad == coches[i].getAntiguedad()) {

				listaCoches = coches[i].toString();
				
			}

		}

		return listaCoches;
	}

	/**
	 * Devuelve un {@code Coche} que tenga una matrícula igual a
	 * {@code matricula}. Si no encuentra el coche, devuelve un null.
	 * 
	 * @param String
	 *            matricula.
	 * @return Coche.
	 */

	public Coche buscaCoche(String matricula) {
		Coche cocheEncontrado = null;
		int i = 0;
		boolean encontrado = false;

		/* COMPLETAR */

		while (!encontrado) {

			if (coches[i] != null && matricula.equals(coches[i].getMatricula())) {

				cocheEncontrado = coches[i];
				encontrado = true;
				break;
			}

			i++;
		}

		return cocheEncontrado;
	}

	/**
	 * Devuelve un {@code String} con un informe sobre las diferencias y las
	 * similitudes entre dos coches. El informe será un String que mostrará
	 * información sobre las antiguedades de los coches, los colores, los
	 * modelos y los talleres.
	 * 
	 * @param Coche
	 *            c1.
	 * @param Coche
	 *            c2.
	 * @return String.
	 */
	public String comparaCoches(Coche c1, Coche c2) {

		String informe = "";

		String informeAntiguedad;
		String informeModelo;
		String informeColor;
		String informeTaller;

		/* COMPLETAR */

		if (c1.getAntiguedad() == c2.getAntiguedad()) {

			informeAntiguedad = "tienen la misma antiguedad: "
					+ c1.getAntiguedad();

		} else {

			informeAntiguedad = "no tienen la misma antiguedad"
					+ c1.getAntiguedad() + " y " + c2.getAntiguedad();
		}

		if (c1.getColor().equals(c2.getColor())) {

			informeColor = "tienen el mismo color " + c1.getColor();

		} else {
			informeColor = "tienen diferente color: " + c1.getColor() + " y "
					+ c2.getColor();
		}

		if (c1.getModelo().equals(c2.getModelo())) {

			informeModelo = "son del mismo modelo: " + c1.getModelo();

		} else {

			informeModelo = "no son del mismo modelo: " + c1.getModelo()
					+ " y " + c2.getModelo();

		}

		if (c1.getEnTaller() == c2.getEnTaller()) {

			informeTaller = "los dos estan en el mismo taller";

		} else {

			informeTaller = "no estan en el mismo taller ";

		}

		informe = "Antiguedad: " + informeAntiguedad + "\n" + "Color: "
				+ informeColor + "\n" + "Modelo: " + informeModelo + "\n"
				+ "Taller: " + informeTaller;

		return informe;
	}

	/**
	 * Escribe en un fichero llamado {@code nombre}, nombre del {@code Taller},
	 * toda la informacion del mismo.
	 */
	public void guardar() {
		PrintWriter fich = null;
		int i = 0;
		/* COMPLETAR */
		try {

			fich = new PrintWriter("pruebaTaller.txt");
			
			fich.println("numCoches "+numCoches);
			
			for (i = 0; i < NUM_MAX_COCHES && coches[i]!= null; i++) {

				coches[i].guardar(fich);
				
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fich.close();

		}

	} // de guardar

	/**
	 * Lee desde fichero toda la informacion de los coches que están o que han
	 * estado en el Taller y los va almacenando en el array de coches
	 * {@code coches}.
	 */
	public void cargar() {

		/* COMPLETAR */
		int i = 0;
		Scanner in = null;
		try {

			in = new Scanner(new FileReader("TallerDeCoches.txt"));
			in.next();
			numCoches = in.nextInt();

			while (in.hasNext()) {

				String matricula = in.next();
				String color = in.next();
				String modelo = in.next();
				int antiguedad = in.nextInt();
				boolean enTaller = in.nextBoolean();

				Coche t = new Coche(matricula, color, modelo, enTaller,
						antiguedad);
				coches[i] = t;
				i++;
			}
			numCoches = i;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			in.close();
		}

	} // de cargar

}
