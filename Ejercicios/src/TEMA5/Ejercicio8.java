package TEMA5;

public class Ejercicio8 {
	
	//Atributos
	
	public int capacidadMaxima;	
	public int cantidadActual;
	
	//Constructor
	
	public Ejercicio8(){
		
		capacidadMaxima = 1000;
		cantidadActual = 0;		
	}
	
	public Ejercicio8(int x, int y){
		
		capacidadMaxima = x;
		cantidadActual = y;	
		if (cantidadActual<capacidadMaxima){
			
			cantidadActual=capacidadMaxima;
			
		}
	}
	
	
	//Métodos

	public void llenarCafetera(){
		
		cantidadActual=capacidadMaxima;
		
	}
	
	public int servirTaza(int x){
		
		
		cantidadActual -= x;
		
		return x;
	}
	
	public void vaciarCafetera(){
		
		cantidadActual = 0;
		
	}
	
	public int agregarCafe(int x){
		
		cantidadActual += x;
		
		return x;
	}
	
	public  int mostrarcafe(){
		return cantidadActual;
	}
	
}
