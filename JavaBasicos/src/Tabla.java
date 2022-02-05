import java.util.Scanner;

public class Tabla {
    public static void main(String [] args) {
    	
    	
    	/* EJERCICIO
		 * * Utilizando un bucle while
		 

			// 1.- Crea una nueva clase llamada Tabla
			// 2.- Copia el siguiente codigo y verifica que funcione
		 */
		 
      		
				 
				        Scanner console = new Scanner(System.in);
				        int num;
				        
				        System.out.println("Ingresa cualquier número positivo: ");
				        num = console.nextInt();
				        
				        
				        System.out.println("Tabla de multiplicar de  " + num);
				        
				        int multiplicador = 1;
						while(multiplicador < 11) {
							System.out.println(num + "x" + multiplicador + "=" + (num * multiplicador));
							multiplicador++;
						}	
				   
					    //Implementa un bucle while que imprima el resultado 
						// 3.- Debe imprimir la tabla de multiplicar del número en cuestión (solo los primeros 10 números)
				}	
  
    	
 }

