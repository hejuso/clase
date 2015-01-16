import java.util.Scanner;


public class T2Ejercicio9 {
	public static void main(String Arg[]){
		
		int unidades;
		float precioProd;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca número de unidades");
		unidades = reader.nextInt();
		System.out.println("Introduzca precio del producto");
		precioProd = reader.nextInt();
		
		//Precio total producto
		float prodPre = unidades * precioProd;
		
		//Descuento 3x2
		long unidAgrup = unidades/3;
		long unidNoAgrup = unidades%3;
		float precAgrup = (unidAgrup*2)*precioProd;
		float precNoAgrup = unidNoAgrup * precioProd;
		float preTresPorDos = precAgrup + precNoAgrup;
		
		//Descuento 30%
		float desTre = (prodPre*30)/100;
		float resDesTre = prodPre-desTre;
		
		//Resultado
		
		if (preTresPorDos<resDesTre){
			System.out.println("Total de la oferta 3x2: "+preTresPorDos);
			System.out.println("Total de la oferta 30%: "+resDesTre);
			System.out.println(" ");
			System.out.println("Oferta mas recomendada: Oferta 3x2");
		}
		else if (preTresPorDos>resDesTre){
			System.out.println("Total de la oferta 3x2: "+preTresPorDos);
			System.out.println("Total de la oferta 30%: "+resDesTre);
			System.out.println(" ");
			System.out.println("Oferta mas recomendada: Oferta 30%");
		}
		
		
		
	}

}
