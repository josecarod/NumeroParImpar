import java.util.Scanner;

public class DeletreaNombre {
	
	
	
private static int i;

/*
 * 
 * Como pista pueden investigar cómo se usan los siguientes métodos de String:
length()
charAt(i)
 * 
 * 
 * 
 * EJERCICIO
 * Escribe un programa que pida al usuario ingresar su nombre
 *  y que entonces imprima cada una de las letras de su nombre.
Ejemplo: "Juan"
"J"
"u"
"a"
"n"
 */
	public static void main (String [] args) {
		
		System.out.println("Escribe tu nombre: ");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		
		while(i < nombre.length() ) {
		
		System.out.println(nombre.charAt(i));
		i++;

		
		}
		
		
	}	
}
