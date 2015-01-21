package TEMA5;

public class Ejercicio2 {

	//atributos
	
	double radio;
	double longitud;
	double area;
	
	double radio2;
	double longitud2;
	double area2;
	
	boolean mayor;
	
	
	//metodos
	
	public void asignaRadio(double x){
		radio = x;
	}

	public double daRadio(){
		
		return radio;
	}
	
	public double longitud(){
		
		longitud = 2*3.14*radio;
		System.out.println("Longitud de la circumferencia 1: "+longitud);
		return longitud;
		
	}
	
	public double area(){
		
		area = 3.14 * Math.pow(radio,2);
		System.out.println("Area de la circumferencia 1: "+area);
		return area;
	}

	public void asignaRadio2(double x){
		radio2 = x;
	}

	public double daRadio2(){
		
		return radio2;
	}
	
	public double longitud2(){
		
		longitud2 = 2*3.14*radio2;
		System.out.println("Longitud de la circumferencia 2: "+longitud2);
		return longitud2;
		
	}
	
	public double area2(){
		
		area2 = 3.14 * Math.pow(radio2,2);
		System.out.println("Area de la circumferencia 2: "+area2);
		return area2;
	}
	
	public boolean mayorQue(){
		
		if (area>area2 && longitud>longitud2){
			
			System.out.println("El circulo 1 es mas grande");
			
		}
		
		if (area<area2 && longitud<longitud2){
			
			System.out.println("El circulo 2 es mas grande");
			
		}
		
		return mayor;
		
	}

	
}
