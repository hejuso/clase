import java.util.Scanner;


public class Pruebas {

	public static void main(String[] args) {

		int datosLluvias[] = new int [6];
		int i=0;
		int suma=0;
		int media=0;
		
		Scanner reader = new Scanner(System.in);
		
		for (i=0;i<6;i++){
			
		System.out.println("Introduzca datos de las lluvias en el dia "+i);
		datosLluvias[i] = reader.nextInt();
		
		suma = suma + datosLluvias[i];
		}
		
		media = suma / i;
		System.out.println("Media: "+media);
		
		for (i=0;i<6;i++){
			if (datosLluvias[i]>(media*2)){
				System.out.println("El dia "+i+ " es el doble de la media");
			}
			
		}
	}

}
