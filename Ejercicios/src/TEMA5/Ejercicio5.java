package TEMA5;

public class Ejercicio5 {

	//atributos
	
		public int a1;
		public int a2;
		
		public int b1;
		public int b2;
		
		public int c1;
		public int c2;
		
		public int d1;
		public int d2;

		//constructores
		
		public Ejercicio5() {
			
			a1 = 0;
			a2 = 0;
			
			b1 = 5;
			b2 = 0;
			
			c1 = 5;
			c2 = 2;
			
			d1 = 0;
			d2 = 2;
			
		} 
		
		public Ejercicio5(int i, int j){
			
			a1 = 0;
			a2 = 0;
			
			b1 = i;
			b2 = 0;
			
			c1 = i;
			c2 = j;
			
			d1 = 0;
			d2 = j;
			
		}
		
		//meto2
		
		public void superficie() {
			
			int base = b1 - a1;
			int altura = c2 - b2;
			
			System.out.println("Superficie: "+base*altura);
		}
		
		public void desplazar(int x) {
			
			a1 = a1 + x;
			a2 = a2 + x;
			
			b1 = b1 + x;
			b2 = b2 + x;
			
			c1 = c1 + x;
			c2 = c2 + x;
			
			d1 = d1 + x;
			d2 = d2 + x;
			
		}
}
