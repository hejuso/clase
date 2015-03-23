package Vuelo;

public class PruebaVuelo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vuelo v = new Vuelo("1", "madrid", "valencia", "19:00", "20:00");
		
		v.reservar("Paco Gomez", 'V');

		v.listarReservas();
		
	}

}
