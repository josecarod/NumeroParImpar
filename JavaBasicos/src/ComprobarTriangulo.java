

import java.util.Scanner;

public class ComprobarTriangulo {
	
	
    public static void main (String[] args) {
    	
    	
    	/*
    	 * Pedirle 3 ángulos a un usuario y decirle si es un triangulo válido
    	 */
    	
    	System.out.println("Ingresa 3 angulos para saber si es un triangulo: ");
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Ingresa el primer angulo: ");
    	int angulo1 = scanner.nextInt();
    	System.out.println("Ingresa el segundo angulo: ");
    	int angulo2 = scanner.nextInt();
    	System.out.println("Ingresa el tercer angulo: ");
    	int angulo3 = scanner.nextInt();
    	
    	if(angulo1 + angulo2 + angulo3 == 180) {
    		System.out.println("Es un triangulo válido");
    	} else {
    		System.out.println("No es un triangulo válido");
    	}
    	
    	
    }
}
