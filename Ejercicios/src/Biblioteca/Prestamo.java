package Biblioteca;

public class Prestamo {

	// atributos

	private static int num_prestamos;
	private int id;
	private Libro libro;
	private String fecha_inicio;
	private String fecha_fin;
	private boolean sanction;
	private String estado;

	// constructor

	public Prestamo(Libro libro_) {

		FechaActual data = new FechaActual();

		id = num_prestamos + 1;
		libro = libro_;
		fecha_inicio = data.getDia() + " " + data.getMes() + " "
				+ data.getAnyo();
		fecha_fin = data.getDia() + " " + data.getFechaFin() + " "
				+ data.getAnyo();

	}

	// metodos

	public int getId() {

		return id;

	}

	public Libro getLibro() {

		return libro;

	}

	public String getFechaInicio() {

		return fecha_inicio;

	}

	public String getFechaFin() {

		return fecha_fin;

	}

	public boolean getSancion() {

		return sanction;

	}

	public boolean getEstado() {

		return estado != null;

	}

	public String toString() {

		String datos = num_prestamos + " " + id + " " + libro + " "
				+ fecha_inicio + " " + fecha_fin + " " + sanction + " "
				+ estado;

		return datos;

	}

}
