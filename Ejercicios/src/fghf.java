import java.util.Scanner;

public class fghf {
	public static void main(String arg[]) {

		int i;
		float media = 0;
		int n;
		int suma = 0;

		Scanner reader = new Scanner(System.in);

		for (i = 0; i < 10; i = i++) {
			System.out.println("Introduce num: ");
			n = reader.nextInt();
			suma = suma + n;
			System.out.println("suma: " + suma);
		}

		media = (float) suma / 10;
		System.out.println("Media igual a: " + media);

	}
}