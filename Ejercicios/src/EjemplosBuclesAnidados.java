public class EjemplosBuclesAnidados {

	public static void main(String[] args) {

		int i;
		int j;

		for (i = 0; i < 5; i++) {
			for (j = 0; j <= 4 - i; j++)
				System.out.print((j + 1));
			System.out.println();
		}

	}

}
