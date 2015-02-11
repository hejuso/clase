package Biblioteca;

public class Usuario {

	// atributos

	private String nombre;
	private String dni;
	private String direccion;
	private int num_prestamos;
	private Prestamo[] prestamos;

	// constructores

	Usuario(String nombre_, String dni_, String direccion_) {

		num_prestamos = 0;
		nombre = nombre_;
		dni = dni_;
		direccion = direccion_;

	}

	Usuario(String nombre_, String dni_, String direccion_,
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

			if (prestamos[i].getEstado() == true) {

				System.out.println(prestamos[i]);
				contador++;
			}

		}
		Prestamo[] prestamosActivos = new Prestamo[contador];
		int j = 0;
		for (i = 0; i < num_prestamos; i++) {

			if (prestamos[i].getEstado() == true) {
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

			if (prestamos[i].getSancion() == true) {
				System.out.println(prestamos[i]);
				contador++;
			}

		}
		Prestamo[] prestamosSancionados = new Prestamo[contador];
		int j = 0;
		for (i = 0; i < num_prestamos; i++) {

			if (prestamos[i].getSancion() == true) {
				prestamosSancionados[j] = prestamos[i];
				j++;
			}
		}
		return prestamosSancionados;
	}

	public void addPrestamo(Prestamo prestamo_) {

	}

	public boolean existePrestamo(int id_prestamo) {

		return prestamos != null;

	}

	public void cancelarPrestamo(int id_prestamo) {

	}

	public String toString() {

		String datos = "";
		return datos;

	}

}
