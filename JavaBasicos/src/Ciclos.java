
public class Ciclos {
	public static void main (String [] args) {
		
		/*
       //while
		
		int control = 0;
		
		while(control < 10) {
			System.out.println("Control: " + control);
			control++;
		}
		*/
		
		
		// do while
		/*
		int control = 0;
		
		do {
			//codigo a ejecutar
			System.out.println("Control =" + control);
			/	/modificador de la variable control
			control++;
		} while (control < 3); 
		*/	
		
		// for
		
		/*
		for(int i=0; i < 3; i++) {
			System.out.println("Control =" + i);
		}
		*/
		
		//break & continue
		/*
		for(int i=0; i < 10; i++) {
			if(i % 2 == 0) { // solo se muestra la variable cuando los valores sean un numero par
			
				continue;// permite saltarnos una ejecución del ciclo
				//deja que continue el ciclo
				}
		    System.out.println("Control =" + i);
		  } 
		*/
		/*
		 * EJERCICIO
		 * Crea una clase llamada contador

Escribe un ciclo que haga que un contador vaya de 15 a 90, contando de 3 en 3.

		 */
		
		/*
		int contador = 15;
		
		do { 
			System.out.println("Cuenta: " + contador);
			contador = contador + 3;
		} while(contador <= 90);
		*/
		
		
		
	
		
	}
	

		
}


