import java.util.Scanner;

public class T3Ejercicio14 {

	public static void main(String[] args) {
		int edades = 0;
		int altura = 0;
		int mayorAltura = 0;
		int mayorEdad = 0;
		int i = 0;
		int sumaEdad = 0;
		int sumaAltura = 0;
		int mediaEdad = 0;
		int mediaAltura = 0;

		do {
			i++;
			Scanner reader = new Scanner(System.in);
			System.out.println("Introduzca edades: ");
			edades = reader.nextInt();

			System.out.println("Introduzca alturas en centimetros (Ej. 175): ");
			altura = reader.nextInt();

			sumaEdad = sumaEdad + edades;
			sumaAltura = sumaAltura + altura;

			if (edades >= 18) {
				mayorEdad++;
			}
			if (altura >= 175) {
				mayorAltura++;
			}

		} while (i != 5);
		mediaAltura = sumaAltura / i;
		mediaEdad = sumaEdad / i;
		System.out.println("Hay " + mayorEdad + " mayores de edad en la clase");
		System.out.println("Hay " + mayorAltura
				+ " que miden mas de 1.75 en la clase");
		System.out.println("Media edades: " + mediaEdad);
		System.out.println("Media alturas: " + mediaAltura);
	}

}
