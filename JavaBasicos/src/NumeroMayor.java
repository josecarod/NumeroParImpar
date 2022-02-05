

import java.util.Scanner;

public class NumeroMayor {

	/*
	 * Pedir 3 números al usuario y mostrar un mensaje con el
	 * número mayor
	 * */

	public static void main (String[] args) {
		
		System.out.println("Ingresa 3 numeros de tu elección para conocer cual es mayor: ");
		Scanner scanner = new Scanner(System.in);
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();
		int numero3 = scanner.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.println("El primer numero que ingresaste es el mayor.");
		} if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("El segundo numero que ingresaste es el mayor.");
		} else {
			System.out.println("El tercer numero que ingresaste es el mayor.");
		}
		
	}
	
	
}
