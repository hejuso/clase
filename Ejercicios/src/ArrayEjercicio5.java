import java.util.Scanner;

public class ArrayEjercicio5 {

	public static void main(String[] args) {

		int n = 0;
		int i = 0;
		int e = 1;
		int facultad[] = new int[5];
		int sexo[] = new int[5];
		int trabaja[] = new int[5];
		int sueldo[] = new int[5];

		int hombresTrab = 0;
		int mujeresTrab = 0;
		int hombres = 0;
		int mujeres = 0;

		float porHombresTrab = 0;
		float porMujeresTrab = 0;
		float porHombres = 0;
		float porMujeres = 0;
		float mediaSueldoHombres;
		float mediaSueldoMujeres;
		float sumaHombres = 0;
		float sumaMujeres = 0;
		int trab = 0;

		Scanner reader = new Scanner(System.in);

		for (i = 0; i < 5; i++) {

			System.out.println("Encuesta numero " + (e++));
			System.out.println("");
			System.out.println("Introduzca numero facultad: ");
			facultad[i] = reader.nextInt();
			System.out.println("");

			System.out.println("Introduzca 1 para Masculino o 2 para Femenino");
			sexo[i] = reader.nextInt();

			if (sexo[i] == 1) {
				hombres++;

			}

			if (sexo[i] == 2) {
				mujeres++;
			}

			System.out.println("");

			System.out.println("Introduzca 1 si trabaja o 2 si no trabaja");
			trabaja[i] = reader.nextInt();
			System.out.println("");
			if (trabaja[i] == 1) {

				trab++;

				System.out.println("Introduzca sueldo");
				sueldo[i] = reader.nextInt();

				if (sexo[i] == 1) {
					hombresTrab++;
					sumaHombres = sumaHombres + sueldo[i];
				}
				if (sexo[i] == 2) {
					mujeresTrab++;
					sumaMujeres = sumaMujeres + sueldo[i];

				}

			}

		}

		porHombres = ((hombres / (float) facultad.length) * 100);// * 10
		porMujeres = ((mujeres / (float) facultad.length) * 100); // * 10;

		porHombresTrab = ((hombresTrab / (float) trab) * 100);// * 10;
		porMujeresTrab = ((mujeresTrab / (float) trab) * 100);// * 10;

		mediaSueldoHombres = (sumaHombres / (float) trab);// * 10;
		mediaSueldoMujeres = (sumaMujeres / (float) trab);// * 10;

		System.out.println("");

		System.out.println("El procentaje de hombres es: " + porHombres);
		System.out.println("El procentaje de mujeres es: " + porMujeres);
		System.out.println("El procentaje de hombres que trabajan es: "
				+ porHombresTrab);
		System.out.println("El procentaje de mujeres que trabajan es: "
				+ porMujeresTrab);
		System.out.println("La media de el sueldo de los hombres es: "
				+ mediaSueldoHombres);
		System.out.println("La media de el sueldo de las mujeres es: "
				+ mediaSueldoMujeres);
	}

}