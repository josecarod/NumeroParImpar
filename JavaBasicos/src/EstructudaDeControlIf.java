

import java.util.Scanner;

public class EstructudaDeControlIf {
      
	//
	
	
	public static void main(String[] args) {
		
		
	/*	
		if(condicion) {
			codigo
		} else {
			codigo
		}
	} 
	*/
	
	System.out.println("Introduce tu edad: ");
	Scanner scanner = new Scanner(System.in);
	int edad = scanner.nextInt();
	
	if(edad >= 18) {
		System.out.println("Eres mayor de edad");
	} else {
		System.out.println("Eres menor de edad");
	}
	
}
}
