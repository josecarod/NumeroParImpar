package Metodos;

public class Metodos {
//funcion es metodos en java
    	//M�todo de una funci�n
    	
    	//atributos de la clase
    	int a, b;
    	
    	//M�todo void (vac�o)
    	
    	public void sumar() {
    		int resultado = a + b;
    		System.out.println("El resultado de sumar " + a + " mas " + b + " es " + resultado);
    	}
    	
    	
    	//M�todo con retorno de valores
    	public int sumaConRetorno() {
    		// int resultado = a + b;
    		// return resultado;
    		return a + b;
    	}
    	
    	
    	//argumentos
    	//suma(argumentos)
    	
    	public double multiplicarConArgumentos(int arg1, double arg2) {
    		int c = arg1;
    		double d = arg2;
    		return c * d;
    	}
    	
    	
    	//M�todo est�tico
    	//estatico, void(no regresa datos), usa argumentos
    	public static void imprimirNombre(String nombre) {
    		System.out.println("Mi nombres es: " + nombre);
    	}
    	
    	
    	
    
}
