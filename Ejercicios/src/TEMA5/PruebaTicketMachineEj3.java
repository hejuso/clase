package TEMA5;

public class PruebaTicketMachineEj3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ejercicio3 e = new Ejercicio3 (10);
		
		//Precio del ticket
		e.getPrice();
		
		//Introducir monedas
		
		e.insertMoney(2);
		e.insertMoney(2);
		e.insertMoney(2);
		e.insertMoney(2);
		e.insertMoney(2);
		
		//Mostrar monedas introducidas
		
		e.getBalance();
		
		//SU TICKET
		
		e.printTicket();
		
		//SU CAMBIO
		
		e.refundBalance();
		
	}

}
