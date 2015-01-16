import java.util.Scanner;

public class MasMaspruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombPer[] = new String[5];
		int edades[] = new int[5];
		int i;

		Scanner reader = new Scanner(System.in);

		for (i = 0; i < 5; i++) {

			System.out.println("Introduzca nombre ");
			nombPer[i] = reader.next();

			System.out.println("Introduzca edad ");
			edades[i] = reader.nextInt();

		}

		for (i = 0; i < 5; i++)

			if (edades[i] >= 18) {

				System.out.println(nombPer[i]
						+ " es mayor de edad");

			}

	}

}
