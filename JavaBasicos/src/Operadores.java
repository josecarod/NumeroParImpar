

public class Operadores {
	
    public static void main(String[] args) {
    	//Operadores Aritméticos
    	//+, -, /, *, %
    	int a = 10;
    	int b = 20;
    	double c = 10;
    	
    	
    	/* int c = a + b; */
    	System.out.println(c);
    	
    	String str1 = "El resultado de la suma es: ";
    	System.out.println(str1 + c);
    	
    	//Resta
    	System.out.println("El resultado de la resta es: " + (a - b));
    	
    	//División
    	int division = a / b;
    	System.out.println("El resultado de la división es: " + division);
    	
    	//double division2 = (double)a / b;
    	double division2 = c / b;
    	//por lo menos uno de los datos debe ser tipo doublepara que nos represente
    	//los decimales correctamente
    	//10.0 / 20 = 0.5
    	System.out.println("El resultado de la división es: " + division2);
    	
    	//multiplicacion
    	double multiplicacion = c * a;
    	System.out.println("El resultado de la multipliacion es: " + multiplicacion);
    	
    	//modulo
    	double modulo = a % c;
    	System.out.println("El modulo de la operacion es: " + modulo);
    	
    	/*
    	 *Operador de asignacion
    	 * = 
    	 */
    	int d = 5, e;//inicializar las variables vacias
    	e = 6; 
    	System.out.println(d + " - " + e + " es igual a: " + (5-6));
    	
    	/*
    	 * Operadores de declaracion compuesta
    	 * +=, -=, *=, /=, %=
    	 * una operacion simplificada
    	 */
    	
    	int f = 1, g = 5;
    	
    	f += 5;
    	// f = f + 5
    	
    	System.out.println(f);
    	
    	/*
    	 * Operadores relacionales
    	 * <, >, <=, >=
    	 * == igualdad
    	 * != diferencia
    	 * Resultado un valor de tipo boolean/booleano (true, false)
    	 */
    	
    	int h = 15, i = 25;
    	String j = "Hola";
    	
    	System.out.println(h > i); //false
    	System.out.println(i != h);
    	//System.out.println(h != j);//son valores distintos y no se pueden comparar
    	
    	/*Operador unario
    	 * ++, --
    	 * preasignacion -- ++k Se le asigna un valor antes de usarse
    	 * postasignacion -- k++ primero lee el valor y despues le suma 1
    	 */
    	
    	int k =0, l = 0;
    	k++;
    	System.out.println(k);
    	System.out.println(--l);
    	
    	//Precedencia de operadores
    	
    	int operacion = (4 + 5) * 6 / 3;//14
    	//5 * 6 = 30
    	//30 / 3 = 10
    	//4 + 10 = 14
    	
    	System.out.println(operacion);
    	
    	int x = 0 , y = 0;
    	int operacion2 = ++x + y--;
    	// x = 1, y = 0 
    	System.out.println(operacion2);//1
    	
    	//Operador ternario
    	
    	int edad = 19, valor1 = 0, valor2 = 1;
    	int resultado = (edad <= 18)? valor1: valor2;
    	
    	System.out.println(resultado);
    	
    	/* Operadores lógicos
    	 * And - &&
    	 * or - ||
    	 * Not !
    	 */
    	
    	System.out.println(true && true);//true
    	System.out.println(true && false);//false
    	System.out.println(true || false);//true
    	System.out.println(true && !false);//true   
    }
}
