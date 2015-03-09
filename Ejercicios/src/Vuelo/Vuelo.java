package Vuelo;

import java.io.*;

/**
 * Clase Vuelo: Permite representar un vuelo.
 * 
 */
public class Vuelo {
	// Atributos de instancia
	/* COMPLETAR */
	String ident;
	String origen;
	String destino;
	String hsalida;
	String hllegada;

	// Atributos de clase
	/** Numero maximo de reservas (plazas) de cada vuelo. */
	public static final int MAX_PLAZAS = 52;

	String[] plazas = new String[MAX_PLAZAS + 1];
	int reservadas;

	/**
	 * Construye un objeto de la clase {@code Vuelo} con identificador
	 * {@code id}, ciudad de origen {@code orig}, ciudad de destino {@code dest}
	 * , hora de salida {@code hsal}, hora de llegada {@code hlleg} y con
	 * {@code 0} plazas reservadas.
	 * 
	 * @param id
	 *            String.
	 * @param orig
	 *            String.
	 * @param dest
	 *            String.
	 * @param hsal
	 *            String.
	 * @param hlleg
	 *            String.
	 */
	public Vuelo(String id, String orig, String dest, String hsal, String hlleg) {
		/* COMPLETAR */

		ident = id;
		origen = orig;
		destino = dest;
		hsalida = hsal;
		hllegada = hlleg;
		reservadas = 0;

	}

	/**
	 * Devuelve el identificador {@code ident} del {@code Vuelo}.
	 * 
	 * @return String.
	 */
	public String getIdentificador() {

		return ident;

	}

	/**
	 * Devuelve la ciudad de origen {@code origen} del {@code Vuelo}.
	 * 
	 * @return String.
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * Devuelve la ciudad de destino {@code destino} del {@code Vuelo}.
	 * 
	 * @return String.
	 */
	public String getDestino() {
		return destino;
	}

	/**
	 * Devuelve el numero de plazas reservadas {@code reservadas} (o numero
	 * actual de pasajeros) del {@code Vuelo}.
	 * 
	 * @return int.
	 */
	public int getReservadas() {
		return reservadas;
	}

	/**
	 * Comprueba si hay plazas libres en el {@code Vuelo}.
	 * 
	 * @return boolean.
	 */
	public boolean hayPlazas() {

		boolean hayPlaza = false;
		int i = 0;

		for (i = 0; i < MAX_PLAZAS; i++) {
			if (plazas[i] == null) {
				hayPlaza = true;
			}
		}

		return hayPlaza;
	}

	/**
	 * Dado un tipo de plaza {@code pref} (pasillo {@code 'P'} o ventanilla
	 * {@code 'V'}), devuelve la primer plaza libre (de numero menor) que
	 * encuentre de ese tipo. O devuelve {@code -1} si no quedan plazas libres
	 * de tipo {@code pref}.
	 * 
	 * @param pref
	 *            char.
	 * @return int.
	 */
	public int primeraLibre(char pref) {

		int i;
		int libre = -1;

		/* COMPLETAR */

		if (pref == 'V') {
			for (i = 1; i < plazas.length; i = i + 2) {

				if (plazas[i] == null) {
					libre = i;
					break;
				} else {
					libre = -1;
				}

			}

		}

		if (pref == 'P') {
			for (i = 2; i < plazas.length; i = i + 2) {

				if (plazas[i] == null) {
					libre = i;
					break;
				} else {
					libre = -1;
				}
			}

		}

		return libre;
	} // de primeraLibre

	/**
	 * Dado un pasajero {@code pas} y un numero de plaza {@code numP}, reserva
	 * dicha plaza para dicho pasajero.
	 * 
	 * @param pas
	 *            String.
	 * @param numP
	 *            int.
	 */
	public void reservar(String pas, int numP) {
		/*
		 * No hace ningun tipo de validacion de datos puesto que este metodo se
		 * invoca en la lectura de datos desde fichero (metodo cargar de la
		 * clase Aerolinea) y los datos se suponen correctos
		 */
		plazas[numP] = pas;
		reservadas++;

	} // de reservar

	/**
	 * Dado un pasajero {@code pas} y un tipo de plaza {@code pref}, si el vuelo
	 * no esta completo, se reserva al pasajero {@code pas} la primera plaza
	 * libre en {@code pref}. El caracter {@cope pref} es `P' o `V' en funcion
	 * de que el pasajero desee una plaza de pasillo o de ventanilla. En caso de
	 * que no quede ninguna plaza libre en la preferencia indicada {@code pref},
	 * se reserva la primera plaza libre de la otra preferencia. Devuelve un
	 * {@code String} indicando que plaza se ha reservado. Por ejemplo, si se ha
	 * solicitado una plaza de una preferencia con plazas libres, devuelve:
	 * "Su reserva:"
	 * "Pepe Garcia   22P  DL101     Valencia        Paris    10:30    16:45"
	 * 
	 * Si no quedan plazas libres en la preferencia solicitada, devuelve:
	 * "No quedan plazas libres en ventanilla"
	 * 
	 * "Su reserva:"
	 * "Pepe Garcia   22P  DL101     Valencia        Paris    10:30    16:45"
	 * 
	 * Si el vuelo ya esta completo, no se puede realizar la reserva y devuelve
	 * el {@code String}: "Imposible realizar la reserva: vuelo completo"
	 * 
	 * @param pas
	 *            String.
	 * @param pref
	 *            char.
	 * @return String.
	 */
	public String reservar(String pas, char pref) {

		String str = "";
		int i = 0;

		for (i = 0; i < MAX_PLAZAS; i++) {
			if (!hayPlazas()) {
				str = "Imposible realizar la reserva: vuelo completo";
			}
		}

		if (pref == 'V') {

			if (primeraLibre('V') == -1) {

				primeraLibre('P');
				plazas[primeraLibre('P')] = pas;
				str = "No quedan plazas libres en ventanilla \n"
						+ "Se le ha asignado el pasillo: " + "" + pas + ""
						+ ident + "" + origen + "" + destino + "" + hsalida
						+ "" + hllegada;

			}

		}

		if (pref == 'P') {

			if (primeraLibre('P') == -1) {

				primeraLibre('V');
				plazas[primeraLibre('V')] = pas;
				str = "No quedan plazas libres en el pasillo \n"
						+ "Se le ha asignado ventana: " + pas + " " + ident
						+ " " + origen + " " + destino + " " + hsalida + " "
						+ hllegada;

			}

		}

		if (hayPlazas() == true) {

			plazas[primeraLibre(pref)] = pas;

			str = pas + " " + ident + " " + origen + " " + destino + " "
					+ hsalida + " " + hllegada;

		}

		/* COMPLETAR */

		return str;
	} // de reservar

	/**
	 * Dado un numero de plaza valida {@code numP} ({@code 1<=numP<=MAX_PLAZAS}
	 * ), si esta ocupada, se cancela la reserva de dicha plaza y devuelve el
	 * {@code String}: "Reserva cancelada" En caso contrario, la cancelacion no
	 * es posible y devuelve el {@code String}:
	 * "Imposible realizar la cancelacion: la plaza " numP " no esta ocupada"
	 * 
	 * @param numP
	 *            int.
	 * @return String.
	 */
	public String cancelar(int numP) {
		String str = "";

		
		
		/* COMPLETAR */

		return str;
	} // de cancelar

	/**
	 * Devuelve un {@code String} con los datos del vuelo (el identificador, la
	 * ciudad de origen, la ciudad de destino, la hora de salida y la hora de
	 * llegada).
	 * 
	 * @return String.
	 */
	public String toString() {
		String str = "";
		str = str
				+ str.format("%8s %12s %12s %8s %8s", ident, origen, destino,
						hsalida, hllegada);
		return str;
	} // de toString

	/**
	 * Devuelve un {@code String} con los datos del vuelo y el listado de
	 * reservas del mismo. Se utiliza el siguiente formato (ejemplo): IB101
	 * Valencia Paris 10:30 16:45 Luisa Millar (1V) Paco Gomez (2P) Marta Lopez
	 * (3V)
	 * 
	 * @return String.
	 */
	public String listarReservas() {
		String str = "\n" + toString() + "\n";

		/* COMPLETAR */

		return str;
	} // de listarReservas

	/**
	 * Escribe en {@code fich} toda la informacion del {@code Vuelo}.
	 * 
	 * @param fich
	 *            PrintWriter.
	 */
	public void guardar(PrintWriter fich) throws Exception {
		/* Se invoca desde el metodo guardar de la clase Aerolinea */
		fich.println(ident + " " + origen + " " + destino + " " + hsalida + " "
				+ hllegada);
		fich.println(reservadas);
		for (int i = 1; i <= MAX_PLAZAS; i++)
			if (plazas[i] != null)
				fich.println(i + " " + plazas[i]);
	} // de guardar

} // de Vuelo
