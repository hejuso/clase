import java.util.Scanner;

public class T3Ejercicio13 {

	public static void main(String[] args) {

		int cod_art;
		int cant_vend;
		int eurLitro;
		int factTotal = 0;
		int factMasSeisc = 0;
		int i = 0;
		int cant_vend_uno = 0;

		do {
			i++;
			Scanner reader = new Scanner(System.in);
			System.out.println("Introduzca Codigo del artículo: ");
			cod_art = reader.nextInt();

			System.out.println("Introduzca la cantidad vendida en litros: ");
			cant_vend = reader.nextInt();

			System.out.println("Introduzca euros por litro: ");
			eurLitro = reader.nextInt();

			factTotal = factTotal + (cant_vend * eurLitro);

			if (i == 1) {
				cant_vend_uno = cant_vend;
			}

			if (factTotal > 600) {
				factMasSeisc++;
			}

		} while (i != 5);

		System.out.println("Se han emitido " + factMasSeisc
				+ " facturas de 600€");
		System.out.println("La cantidad de litros vendida ha sido: "
				+ cant_vend_uno);

	}

}
