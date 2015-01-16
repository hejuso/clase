import java.util.Scanner;

public class T3Ejercicio7 {

	public static void main(String[] args) {

		int numero;
		int digitos = 0;
		int i = 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca digitos del numero: ");
		digitos = reader.nextInt();
		System.out.println("Introduzca el numero: ");
		numero = reader.nextInt();

		while (numero != 0) {
			numero = numero / 10;
			i++;
		}

		if (digitos == i) {
			System.out.println("Correcto");
		}

		else {
			System.out.println("Incorrecto");
		}
	}

}
