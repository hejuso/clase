package Biblioteca;

public class Libro {
	
	//inicializar
	
	private String titulo;
	private String autor;
	private int anyo;
	private String editorial;
	private String isbn;
	
	//constructores
	public Libro (String ISBN){
		
		isbn = ISBN;
		
	}
	
	
	public Libro (String atitulo, String aautor, int aanyo, String
	aeditorial, String aisbn){
		
		titulo = atitulo;
		autor=aautor;
		anyo= aanyo;
		editorial=aeditorial;
		isbn=aisbn;
		
	}
	
	//metodos
	
	public String getTitulo(){
		
		return titulo;
		
	}
	public void setTitulo(String titulo_){
		
		titulo = titulo_;
		
	}
	public String getAutor(){
		
		return autor;
		
	}
	public void setAutor(String autor_){
		
		autor = autor_;
		
	}
	public int getAnyo(){
		
		return anyo;
		
	}
	public void setAnyo(int anyo_){
		
		anyo = anyo_;
		
	}
	public String getEditorial(){
		
		return editorial;
		
	}
	public void getEditorial(String editorial_){
		
		editorial = editorial_;
		
	}
	public String getIsbn(){
		
		return isbn;
		
	}
	public String toString(){
		
		String datos = titulo+" "+autor+" "+anyo+" "+editorial+" "+isbn;
		return datos;
	}

}
