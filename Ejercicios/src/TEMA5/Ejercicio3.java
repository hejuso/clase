package TEMA5;

public class Ejercicio3 {
	
	//atributos
	
		private int price;
		private int balance;
		private int total;
	
	//metodos

		public Ejercicio3(int ticketCost){
			
			price= ticketCost;
			
		}

		public int getPrice(){
			System.out.println("El ticket vale "+price +"€");
			return price;
			
			
		}

		public int getBalance(){
			System.out.println("Ha introducido "+balance+ "€");
			return balance;
		}

		public void insertMoney(int amount){
			if(amount>=0){
				balance += amount;
			}else{
				System.out.println("Este numero es negativo.");
			}
			
		}

		
		public void printTicket(){
			if (balance>=price) {
				balance -= price;
				total = total+price;
				System.out.println("Aqui tiene su ticket");
				
			}else{
				System.out.println("No ha introducido suficiente dinero");
				int falta = price - balance;
				System.out.println("Le faltan: "+falta+" €");
			}
			
		}

		public int refundBalance(){
			
			System.out.println("Su cambio: "+balance);
			return balance;
			
		}

		
}
