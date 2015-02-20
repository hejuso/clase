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
	private String sanction;
	private String estado;
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
		estado = "activo";
		sanction = "+";
		fecha_inicio = diaInicio + " " + mesInicio + " " + anyoInicio;
		fecha_fin = diaInicio + " " + (mesMasUno = mesInicio + 1) + " "
				+ anyoInicio;

	}
	
	public Prestamo(int id_,Libro l_, String inicio_, String fin_, String sancion_, String estado_) {

		id = id_;
		libro = l_;
		fecha_inicio = inicio_;
		fecha_fin = fin_;
		sanction = sancion_;
		estado = estado_;
		
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

	public String getSancion() {

		return sanction;

	}

	public String getEstado() {

		return estado;

	}

	public String toString() {

		String datos = id + " " + libro.toString() + " "
				+ fecha_inicio + " " + fecha_fin + " " + sanction + " "
				+ estado;

		return datos;

	}

	public void ampliarPrestamo(int dias) {

		System.out.println("Su pedido terminará el dia: " + fecha_fin);
		System.out.println("-¿Cuantos dias quiere ampliar el prestamo?");

		String fecha_fin_ampliada = (diaInicio+dias)+ " " + mesMasUno+ " " + anyoInicio;
		
		System.out.println("Fecha ampliada: "+fecha_fin_ampliada);

	}

	public void setEstado() {

		estado = "cerrado";

	}

	public void setSancion() {

		sanction = "-";

	}

}
