public class CESARPUTA {

	private int a;
	private int b;

	private int vector[] = new int[27];

	private char[] letras = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
			'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
			'w', 'x', 'y', 'z' };
	private char[] letrasEnc;

	private char[] palabra = { 't', 'u', 'm', 'a', 'd', 'r', 'e' };

	public CESARPUTA() {

		a = 4;
		b = 3;

		int x;
		for (x = 0; x < 27; x++) {

			vector[x] = x;
			System.out.print(vector[x] + " ");

		}
		System.out.println();

		for (x = 0; x < 27; x++) {
			vector[x] = (a * x + b) % 27;
			System.out.print(vector[x] + " ");
		}

		System.out.println("");
		for (x = 0; x < 27; x++) {

			System.out.print(letras[x] + " ");

		}

		int j;

		boolean repeticion = false;

		System.out.println("");

		letrasEnc = new char[27];
		for (x = 0; x < 27 && !repeticion; x++) {

			vector[x] = (a * x + b) % 27;

			for (j = 0; j < 1; j++) {

				// System.out.print(letras[vector[x]] + " ");

				letrasEnc[x] = letras[vector[x]];

				System.out.print(letrasEnc[x] + " ");
			}

		}

	}

	// public void setVector() {}

	// public void setVectorAfin() {}

	// public void letras() {}

	// public void setLetrasAfin() {}

	public void setEncriptado() {

		System.out.println("");

		int j;
		int x;
		int i;

		for (i = 0; i < palabra.length; i++) {

			for (x = 0; x < letras.length; x++) {

				if (palabra[i] == letras[x]) {

					vector[0] = (a * x + b) % 27;

					for (j = 0; j < 1; j++) {

						System.out.print(letras[vector[x]] + " ");

					}
				}

			}
		}

	}

	public void setDesencriptado() {

		int j;
		int i = 0;

		System.out.println("");

		for (i = 0; i < palabra.length; i++) {

			for (j = 0; j < letrasEnc.length; j++) {

				if (palabra[i] == letrasEnc[j]) {

					letrasEnc[i] = letras[j];

				}

			}
		}

		for (i = 0; i < palabra.length; i++) {

			System.out.print(palabra[i] + " ");
		}
	}

}