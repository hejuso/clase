import java.util.Scanner;

public class T3Ejercicio6 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int cod_pelicula;
		int veces_alq;
		int cont_alquiladas20 = 0;
		int cont_alquiladas5 = 0;
		int cont_alquiladasentre7y15 = 0;
		int suma = 0;
		int media;

		float por_alq20;
		float por_alq5;
		float por_alq7y15;

		int max1_veces_alq = 0;
		int max2_veces_alq = 0;

		int cod_mas_alq1 = 0;
		int cod_mas_alq2 = 0;

		int cod_menos_alq = 0;

		System.out.println("Introduzca el codigo de la pelicula: ");
		cod_pelicula = teclado.nextInt();

		int i = 1;
		int c = 0;
		if((cod_pelicula<=999) && ((cod_pelicula>0))){
		do {
			if((cod_pelicula<=999) && ((cod_pelicula>0))){

			c++;
			System.out.println("Introduzca las veces que ha sido alquilada: ");
			veces_alq = teclado.nextInt();
			suma = suma + veces_alq;

			if (i == 1) {
				max1_veces_alq = veces_alq;
				max2_veces_alq = 0;

				cod_mas_alq1 = cod_pelicula;
				cod_mas_alq2 = cod_pelicula;

			} else {
				System.out.println("No estamos en la 1º iteracion");
				if (veces_alq > max1_veces_alq) {
					System.out.println("Nuevo maximo1");
					max2_veces_alq = max1_veces_alq;
					max1_veces_alq = veces_alq;

					cod_mas_alq2 = cod_mas_alq1;
					cod_mas_alq1 = cod_pelicula;

				} else {
					System.out.println("No es mayor que maximo1");
					if (veces_alq > max2_veces_alq) {
						System.out.println("Nuevo maximo2");
						max2_veces_alq = veces_alq;

						cod_mas_alq2 = cod_pelicula;
					} else {

						cod_menos_alq = cod_pelicula;

					}

				}
			}

			if (veces_alq >= 20) {
				cont_alquiladas20++;

			}

			if (veces_alq <= 5) {
				cont_alquiladas5++;
			}

			if (veces_alq > 7 && veces_alq < 15) {
				cont_alquiladasentre7y15++;
			}

			System.out.println("Introduzca el codigo de la pelicula: ");
			cod_pelicula = teclado.nextInt();
			i++;
			}
		} while (cod_pelicula > 0);
		}

		media = suma / c;

		System.out.println("Peliculas alquiladas en total: " + (i - 1));
		por_alq20 = (cont_alquiladas20 / (float) (i - 1)) * 100;
		por_alq5 = (cont_alquiladas5 / (float) (i - 1)) * 100;
		por_alq7y15 = (cont_alquiladasentre7y15 / (float) (i - 1)) * 100;

		System.out.println();
		System.out.println("Codigo pelicula mas alquilada 1: " + cod_mas_alq1);
		System.out.println("Pelicula mas alquilada 1: " + max1_veces_alq);

		System.out.println();
		System.out.println("Codigo pelicula mas alquilada 2: " + cod_mas_alq2);
		System.out.println("Pelicula mas alquilada 2: " + max2_veces_alq);

		System.out.println();
		System.out
				.println("Porcentaje alquiladas 20 veces: " + por_alq20 + "%");
		System.out.println("Porcentaje alquiladas 5 veces: " + por_alq5 + "%");
		System.out.println("Porcentaje alquiladas entre 7 y 15 veces: "
				+ por_alq7y15 + "%");

		System.out.println();
		System.out.println("Cod peli menos alq: " + cod_menos_alq);

		System.out.println();
		System.out.println("Media de las veces alquiladas: " + media);

	}

}
