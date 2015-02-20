package Biblioteca;

public class Usuario {

	// atributos

	private String nombre;
	private String dni;
	private String direccion;
	private int num_prestamos;
	private Prestamo[] prestamos;

	// constructores

	public Usuario(String nombre_, String dni_, String direccion_) {

		num_prestamos = 0;
		nombre = nombre_;
		dni = dni_;
		direccion = direccion_;

	}

	public Usuario(String nombre_, String dni_, String direccion_,
			Prestamo[] prestamos_) {

		nombre = nombre_;
		dni = dni_;
		direccion = direccion_;
		prestamos = prestamos_;

	}

	// métodos

	public String getNombre() {

		return nombre;
	}

	public String getDNI() {

		return dni;
	}

	public String getDireccion() {

		return direccion;

	}

	public int getNumPrestamos() {

		return num_prestamos;

	}

	public Prestamo[] getPrestamosActivos() {

		int i;
		int contador = 0;
		for (i = 0; i < num_prestamos; i++) {

			if (prestamos[i] != null && prestamos[i].getEstado() == "activo") {

				System.out.println(prestamos[i]);
				contador++;
			}

		}
		Prestamo[] prestamosActivos = new Prestamo[contador];
		int j = 0;
		for (i = 0; i < num_prestamos; i++) {

			if (prestamos[i].getEstado() == "activo") {
				prestamosActivos[j] = prestamos[i];
				j++;
			}
		}
		return prestamosActivos;

	}

	public Prestamo[] getPrestamosSancionados() {

		int i;
		int contador = 0;
		for (i = 0; i < num_prestamos; i++) {

			if (prestamos[i].getSancion() == "+") {
				System.out.println(prestamos[i]);
				contador++;
			}

		}
		Prestamo[] prestamosSancionados = new Prestamo[contador];
		int j = 0;
		for (i = 0; i < num_prestamos; i++) {

			if (prestamos[i].getSancion() == "+") {
				prestamosSancionados[j] = prestamos[i];
				j++;
			}
		}
		return prestamosSancionados;
	}

	public void addPrestamo(Prestamo prestamo_) {

		int i = 0;
		boolean anyadido = false;

		while (!anyadido && i < prestamos.length + 1) {

			if (prestamos[i] == null) {
				prestamos[i] = prestamo_;

				anyadido = true;
			}
			i++;

			System.out.println("Ha a�adido un prestamo");
		}

	}

	public boolean existePrestamo(int id_prestamo) {

		boolean existe = false;
		int i = 0;

		while (!existe && i < prestamos.length + 1) {

			if (prestamos[i].getId() == id_prestamo) {

				System.out.println("Se ha encontrado un prestamo con id: "
						+ id_prestamo);
				System.out.println(prestamos[i]);
				existe = true;
			}

			i++;

		}
		return existe;
	}

	public void cancelarPrestamo(int id_prestamo) {

		int i = 0;
		boolean cancelado = false;

		while (!cancelado && i < prestamos.length + 1) {

			if (prestamos[i].getId() == id_prestamo) {
				prestamos[i] = null;
				cancelado = true;
				System.out.println("Ha cancelado un prestamo");

			}
			i++;
		}

	}

	public String toString() {

		int i = 0;

		String datos = nombre + " " + dni + " " + direccion + " "
				+ num_prestamos;

		for (i = 0; i < prestamos.length && prestamos[i] != null; i++) {
			
			datos = datos +"\n "+ prestamos[i].toString();
			
		}
		return datos;

	}

}
