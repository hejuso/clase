package Vuelo;
import java.util.*;

/**
 * Clase GestorVuelos: Permite cargar, desde fichero, las reservas de los vuelos de las aerolineas, 
 * hacer nuevas reservas y cancelaciones, generar el histograma de ocupacion de vuelos y guardar en 
 * fichero el estado de las reservas al finalizar su ejecucion.  
 */
public class GestorVuelos {
    
    /** 
     *  Presenta un menu de opciones por pantalla y devuelve la opcion 
     *  valida elegida por el usuario de entre las opciones posibles.
     *  @param tec Scanner.
     *  @return int.
     */  
    public static int menu(Scanner tec) {        
        int op;
        do{
            System.out.println("\n*********** MENU PRINCIPAL ***********");
            System.out.println("           1. Mostrar vuelos");
            System.out.println("           2. Reservar");
            System.out.println("           3. Listar reservas");
            System.out.println("           4. Cancelar");
            System.out.println("           5. Histograma");
            System.out.println("           0. Terminar");
            System.out.println("**************************************");
            System.out.print("Elige una opcion: ");
            op = tec.nextInt();
        }while(op<0 || op>5);
        tec.nextLine();
        return op;
    } // de menu
    
    /** 
     *  Programa principal.
     *  @param args String[]. 
     */
    public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);    
        // Declarar e inicializar ali, objeto de tipo Alianza
       
        
        // Repetir hasta que se decida terminar   
        int opc;
        do{
           // Presentar el menu de seleccion de las distintas opciones 
           opc = menu(tec);
           // Gestionar adecuadamente la opcion seleccionada
           switch(opc){       
               case 1: // Mostrar vuelos
                       // Mostrar todos los vuelos de todas las aerolineas
                   
				   
                       break;
                        
               case 2: // Reservar 
                       // Solicitar origen orig y destino dest del vuelo 
                     
						
                       // Mostrar todos los vuelos con origen orig y destino dest con plazas libres
                      
						
                       // Pedir identificador de vuelo elegido     
                      
					   
                       // Encontrar vuelo con dicho identificador
                    
					   
                       // Si existe                       
                       
                           // Solicitar nombre de pasajero 
                           						   
                           // Solicitar preferencia de asiento, validando que sea 'V' o 'P'
						   
						   // Realizar la reserva, mostrando un mensaje indicando si ha sido o no posible 
                           
                       // Si no existe mostrar un mensaje
                      
					  
                       break;
                       
               case 3: // Listar reservas
                       // Pedir identificador de vuelo
                       
					   
                       // Encontrar vuelo con dicho identificador
                      
                       // Si existe, mostrar todas las reservas de dicho vuelo
                       
                       // Si no existe, mostrar un mensaje 
                       
					   
                       break;
                       
               case 4: // Cancelar
                       // Pedir identificador de vuelo
                       
					   
                       // Encontrar vuelo con dicho identificador
                      
                       // Si existe                       
                       
                          // Pedir numero de plaza, validando que es un numero entre 1 y Vuelo.MAX_PLAZAS
                           
                          // Cancelar la reserva, mostrando un mensaje indicando si ha sido o no posible
                        
                       // Si no existe, mostrar un mensaje
                       
					   
                       break;
                       
               case 5: // Histograma 
                       // Mostrar por pantalla el histograma de ocupacion de vuelos de la alianza
                       					  
                       break;
                       
               case 0: // Terminar
                       // Guardar la informacion de la alianza en sus correspondientes ficheros
                       
					   
           }           
        }while(opc!=0);        
    } // de main
    
} // de GestorVuelos
