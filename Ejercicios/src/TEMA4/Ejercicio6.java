package TEMA4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner in=null;
		PrintWriter out=null;
		double precioIVA;
		double caja;
		String caja2;
		
		try {
			in = new Scanner (new FileReader("preciosinIVA.txt"));
			out = new PrintWriter ("preciosconIVA.txt");
			
			do{
				
				caja2 = in.next();
				caja=in.nextDouble();
				precioIVA = caja * 1.21;
				
				
				out.println(caja2+ " " +caja+ " "+precioIVA);
			}while (in.hasNextLine());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			in.close();;
			out.close();
		}

		
	}

}
