

import java.util.Scanner;

public class Calculadora {

	
	
	private static float resultado;

	/*
	 * Pedir al usuario dos numeros por consola y preguntarle que desea
	 * 1) Suma
	 * 2) Resta
	 * 3) División
	 * 4) Multiplicación
	 * 
	 *  y después  imprimir el resultado
	 */
	
public static void main(String [] args) {
	
	System.out.println("Introduce dos numeros y selecciona la operación que deseas que se realice");
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el primer numero: ");
    float numero1 = sc.nextFloat(); 
    System.out.println("Introduce el segundo numero: ");
	float numero2 = sc.nextFloat();
	System.out.println("Selecciona ahora la operación: suma, resta, division , multiplicacion.");
	String operacion = sc.next();
	
  switch(operacion.toLowerCase()) {
  case "suma":
	  System.out.println("El resultado es: " + (numero1 + numero2));
  break;
  case "resta":
	  System.out.println("El resultado es: " + (numero1 - numero2));
  break;
  case "division":
	  System.out.println("El resultado es: " + (numero1 / numero2));
  break;
  case "multiplicacion":
	  System.out.println("El resultado es: " + (numero1 * numero2));
  break;
  default:
	  System.out.println("Error en la operación introducida");
  }
	
	
}


}
