

import java.util.Scanner;

public class EstructuraDeControlSwitch {

	
	  //Estucturas de control  nos sirve para controlar  el flujo  de comportamiento  de un programa.
	  // Para la toma de decisiones	
	
	  /*
	   * switch
	   * 
	   * 
	   * 
	   * 
	   * 
	   * 
	   */
	
	
public static void main(String [] args) {
	// Solicitar al usuario un dia de la semana y mostrar un mensaje
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un día de la semana y recibe un mensaje");
	String dia = sc.nextLine();
	
	switch(dia.toLowerCase()) {
	case "lunes":
		System.out.println("Ya mero es Viernes, toma un cafe");
		break;
	case "martes":
		System.out.println("Ya es Martes");
		break;
	case "miercoles":
		System.out.println("Ya es Miercoles");
		break;
	case "jueves":
		System.out.println("Ya es Jueves");
		break;
	case "viernes":
		System.out.println("Ya es Viernes");
		break;
	case "sabado":
		System.out.println("Ya es Sábado");
		break;
	case "domingo":
		System.out.println("Ya es Domingo");
		break;
	default:
		System.out.println("Error. Ingresa de nuevo el día");
		
	} 
	
	/*
	 * Pedir al usuario dos numeros por consola y preguntarle que desea
	 * 1) Suma
	 * 2) Resta
	 * 3) División
	 * 4) Multiplicación
	 * 
	 *  y después  imprimir el resultado
	 */
	
	
	
}	
	
}
