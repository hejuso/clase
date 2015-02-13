package Biblioteca;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Prestamo {

	// atributos

	private static int num_prestamos;
	private int id;
	private Libro libro;
	private String fecha_inicio;
	private String fecha_fin;
	private boolean sanction;
	private boolean estado;
	private int diaInicio;
	private int mesInicio;
	private int anyoInicio;
	private int mesMasUno;

	FechaActual data = new FechaActual();

	// constructor

	public Prestamo(Libro libro_) {

		Calendar calendar = new GregorianCalendar(2013, 1, 28, 13, 24, 56);

		int diaInicio = calendar.get(Calendar.YEAR);
		int mesInicio = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
		int anyoInicio = calendar.get(Calendar.DAY_OF_MONTH);

		id = num_prestamos + 1;
		libro = libro_;
		estado = true;
		sanction = false;
		fecha_inicio = diaInicio + " " + mesInicio + " " + anyoInicio;
		fecha_fin = diaInicio + " " + (mesMasUno = mesInicio + 1) + " "
				+ anyoInicio;

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

		return estado = true;

	}

	public String toString() {

		String datos = num_prestamos + " " + id + " " + libro.toString() + " "
				+ fecha_inicio + " " + fecha_fin + " " + sanction + " "
				+ estado;

		return datos;

	}

	public void ampliarPrestamo(int dias) {

		System.out.println("Su pedido terminará el dia: " + fecha_fin);
		System.out.println("¿Cuantos dias quiere ampliar el prestamo?");

		String fecha_fin_ampliada = (diaInicio+dias)+ " " + mesMasUno+ " " + anyoInicio;
		
		System.out.println("Fecha ampliada: "+fecha_fin_ampliada);

	}

	public void setEstado() {

		estado = false;

	}

	public void setSancion() {

		sanction = true;

	}

}
