package Biblioteca;

import java.util.*;

public class FechaActual {

	Date fecha = new Date();

	String fecha_completa = fecha.toString();
	String delimitadores = " ";
	String[] palabrasSeparadas = fecha_completa.split(delimitadores);

	String dia = palabrasSeparadas[2];
	String mes_actual = palabrasSeparadas[1];
	String anyo = palabrasSeparadas[5];

	int mes_actual_num;
	String mes_mas_uno;

	public FechaActual() {

	}

	public int getMes() {

		switch (mes_actual) {

		case "Feb":

			mes_actual_num = 2;
			break;
		}

		return mes_actual_num;

	}

	public String getFechaFin() {

		mes_actual_num++;

		switch (mes_actual_num) {

		case 1:
			mes_mas_uno = "Enero";
			break;

		case 2:
			mes_mas_uno = "Febrero";
			break;

		case 3:
			mes_mas_uno = "Marzo";
			break;

		case 4:
			mes_mas_uno = "Abril";
			break;

		case 5:
			mes_mas_uno = "Mayo";
			break;

		case 6:

			mes_mas_uno = "Junio";

			break;
		case 7:
			mes_mas_uno = "Julio";
			break;

		case 8:
			mes_mas_uno = "Agosto";
			break;

		case 9:
			mes_mas_uno = "Septiembre";

			break;
		case 10:
			mes_mas_uno = "Octubre";
			break;

		case 11:
			mes_mas_uno = "Noviembre";
			break;

		case 12:
			mes_mas_uno = "Diciembre";
			break;

		}

		return mes_mas_uno;
	}

	public String getDia() {
		return dia;
	}

	public String getAnyo() {

		return anyo;
	}

}