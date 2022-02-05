
public class Arreglos {
	
	public static void main(String[] args) {
		// Solo un tipo de dato
		// Especificar el tamaño  o la cantidad de elementos  que va a contener
		
		//1 manera 
		int numeros[];// creamos la variable
		numeros = new int[4]; //creando el arreglo
		
		//2 manera
		String[] nombres= new String[4]; //basado en 0. [0 ,1 ,2 ,3]
		
		//3 manera
		//array literal
		String []nombreFrutas = new String[] {"Manzana", "Platano", "Naranja", "Limón"};
		
		nombres[0] = "Pedro";
		nombres[1] = "Jose";
		nombres[2] = "Emilio";
		nombres[3] = "Ponchito";
		
		
		numeros[0] = 10;
		numeros[1] = 8;
		numeros[2] = 447;
		numeros[3] = 38;
		
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros);
		
		for(int i = 0;i < numeros.length; i++) {// en arrays, length es una propiedad
			System.out.println("Elemento de numeros: " + numeros[i]);//[0], [1]
			System.out.println("Elemento de nombres: " + nombres[i]);
			System.out.println("Elemento de frutas: " + nombreFrutas[i]);
			System.out.println("--------------------------------");
		}
		
	
	}

}
