import java.util.Scanner;

public class VectoresMatrices4 {

	public static void main(String[] args) {

		
		int n = 0;
		int m = 0;
		
		float notas[][] = new float[5][5];
		int i;
		int c;
		
		


		Scanner reader = new Scanner(System.in);

		for (i = 0; i < 5; i++) {
			
			
			for (c = 0; c < 5; c++){
				
				System.out.println("Introduce numero: ");
				notas [n][m] = reader.nextInt();
				
			}

		}

	}

}
