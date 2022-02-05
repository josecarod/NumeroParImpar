

import java.util.Scanner;

public class Compras {
    public static void main (String [] args) {
    	// si la cuenta es de menos de 1000
    			// sila cuenta es de 1000 - 4999 10%
    			// si la cuenta es de 5000 a 9999 20%
    			// si la copra es de 10000 o más 30%


    System.out.println("¿Cual fue tu cuenta?");
    Scanner sc = new Scanner(System.in);
    float cuenta = sc.nextFloat();
    
    if(cuenta < 1000) {
    	System.out.println(cuenta);  
    } else if (cuenta < 5000) {
    	float precioFinal = (float) (cuenta * .90);
    	System.out.println("El porcentaje de descuento que tienes es del 10% y tu cuenta final es de: "
    			+ precioFinal);
   } else if (cuenta < 10000) {
	   float precioFinal = (float) (cuenta * .80);
	System.out.println("El porcentaje de descuento que tienes es del 20% y tu cuenta final es de: "
			+ precioFinal);
    } else if (cuenta >= 10000) {
    	float precioFinal = (float) (cuenta * .70);
	System.out.println("El porcentaje de descuento que tienes es del 30% y tu cuenta final es de: "
			+ precioFinal);	
    }
 }
    
}