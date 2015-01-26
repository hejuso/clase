package TEMA5;

public class PruebaBancoEj7 {

	public static void main(String[] args) {
		
		Ejercicio7 e1;
		Ejercicio7 e2;
		e1= new Ejercicio7(26265481, 5000);
		e2= new Ejercicio7();
		
		e1.ingresar(200);
		e2.ingresar(600);
		
		e1.retirar(200);
		e2.retirar(100);
		
		e1.mostrar();
		e2.mostrar();
	}

}
