package TEMA4;

import java.io.*;
import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner in = null;
		int c;
		
		 try {
			in = new Scanner(new FileReader("palabras.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 for (c=0; c<2; c++){
			 
			 System.out.println(in.next().toUpperCase());
			 
		 }
		 
		 in.close();
		
	}

}
