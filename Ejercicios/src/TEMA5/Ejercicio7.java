package TEMA5;

public class Ejercicio7 {

	// Atributos

	public static int numCuentas = 100001;
	public int idCuenta;
	public int dni;
	public double saldo;
	public float interesAn = 3;

	// Constructor

	public Ejercicio7() {

		dni = 2325486;
		saldo = 3000;
		idCuenta = numCuentas;
		numCuentas++;

	}

	public Ejercicio7(int adni, int asaldo) {

		dni = adni;
		saldo = asaldo;
		idCuenta = numCuentas;
		numCuentas++;

	}

	// Métodos

	public double ingresar(int x) {

		saldo += x;

		return x;
	}

	public double retirar(int y) {

		saldo -= y;

		if (saldo<0){
			System.out.println("No puede retirar dinero, no le queda nada en la cuenta");
		}
		
		return y;
	}

	public void mostrar() {

		System.out.println("");
		System.out.println("Su numero de cuenta es: " + idCuenta);
		System.out.println("DNI del cliente :"+dni);
		System.out.println("Su saldo actualmente es: " + saldo);
		System.out.println("Interes del "+interesAn+"%");
		System.out.println("");
	}

}
