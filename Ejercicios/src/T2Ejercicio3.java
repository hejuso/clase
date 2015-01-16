import java.util.Scanner;

public class T2Ejercicio3 {
	public static void main(String args[]) {

		float x;
		float y;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca coordenada x: ");
		x = reader.nextFloat();
		System.out.println("Introduzca coordenada y: ");
		y = reader.nextFloat();

		if (x == 0 && y == 0) {
			System.out.println("Estas en el origen.");
		} else if (x > 0 && y > 0) {
			System.out.println("Estas en el cuadrante Noreste");
		} else if (x > 0 && y < 0) {
			System.out.println("Estas en el cuadrante Sudeste");
		} else if (x < 0 && y < 0) {
			System.out.println("Estas en el cuadrante Sud-oeste");
		} else if (x < 0 && y > 0) {
			System.out.println("Estas en el cuadrante Nor-oeste");
		} else if ((x == 0 && y < 0) || (x == 0 && y > 0)) {
			System.out.println("Estas en el eje x");
		} else if (x > 0 && y == 0 || (x < 0 && y == 0)) {
			System.out.println("Estas en el eje y");
		}
	}
}