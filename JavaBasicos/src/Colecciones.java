import java.util.*;

public class Colecciones {
     public static void main(String[] args) {
    	 
    	 
    	 // Las colecciones nos sirven para almacenar un conjunto
    	 // de objetos
    	 // Las diferencias de las colecciones y  los objetos
    	 // es que las colecciones son dinamicas, pueden cambiar el numero de objetos agregados
    	 
    	 // Set tiene 3 implementaciones
    	 // no puede contener elementos repetidos
    	 
    	 // HashSet
    	 // los elementos no mantienen un orden
    	 // es la implementación más rapida
    	 
    	 /*Set<String> frutas = new HashSet<String>();
    	 frutas.add("mango");
    	 frutas.add("granada");
    	 frutas.add("piña");
    	 frutas.add("sandia");
    	 frutas.add("mamey");
    	 frutas.add("fresa");
    	 
    	 /* for each puede recorrer  una coleccion  y en cada 
    	  * recorrido recupera el valor y los podemos almacenar en una variable
    	  * Sintaxis
    	  * for(tipoDeDatoElemento variable: elementoARecorrer)
    	  * 
    	
    	 for(String fruta: frutas) {
    		 System.out.println(fruta);
    	 } */
    	 
    	
    	 // TreeSet
    	 // Esta implementacion ordena los elementos en funcion de sus valores
    	 // es la implementacion mas lenta
    	 
    	/* Set<String> frutas = new TreeSet<String>();
    	 frutas.add("mango");
    	 frutas.add("granada");
    	 frutas.add("piña");
    	 frutas.add("sandia");
    	 frutas.add("mamey");
    	 frutas.add("fresa");
    	 
    	 for(String fruta: frutas) {
    		 System.out.println(fruta);
    	 } */
    	
    	 

    	 // LinkedHashSet
    	 // va a respetar el orden de inserción o como fueron puestos
    	 // es mas costoso que hashset
    	 
    	 /*
    	 Set<String> frutas = new LinkedHashSet<String>();
    	 frutas.add("mango");
    	 frutas.add("granada");
    	 frutas.add("piña");
    	 frutas.add("sandia");
    	 frutas.add("mamey");
    	 frutas.add("fresa");
    	 
    	 for(String fruta: frutas) {
    		 System.out.println(fruta);
    	 }
    	 
    	 */
    	 
    	 // List
    	 // se permiten elementos duplicados
    	 // acceder a elementos especificos
    	 // buscar elementos
    	 
    	 //ArrayList
    	 /*
    	 List<String> pokemones = new  ArrayList<String>();
    	 pokemones.add("Chicorita");
    	 pokemones.add("Eevee");
    	 pokemones.add("Psyduck");
    	 pokemones.add("Dragonite");
    	 pokemones.add("Charizard");
    	 pokemones.add("Gengar");
    	 pokemones.add("Flygon");
    	 
    	 // add agrega un elemento y desplaza hacia abajo
    	 pokemones.add(2, "Pikachu");
    	 
    	 //remove remueve el elemento de la posición especificada
    	 pokemones.remove(5);
    	 
    	 //set reemplaza el elemento de la posición especificada
    	 pokemones.set(0, "Flareon");
    	 
    	 for(String pokemon : pokemones) {
    		 System.out.println(pokemon);
    	 }
    	 
    	 System.out.println("*************");
    	 System.out.println(pokemones.get(4)); // acceder a elementos especificos
    	 
    	 // indexOf, nos va a devolver la posicion del elemento
         // y si  el elemento no se encuentra nos devuelve -1
    	 
    	 System.out.println(pokemones.indexOf("Togepi")); // el primer elemento que coincida es el que va a devolver
    	 
    	 System.out.println("*********************");
    	 */
    	 // LinkedList
    	 // Es una lista doblemente enlazada / internamente sabe que elemento esta antes y después de el
    	 // Es más rapido para insertar y remover elementos
    	 
    	 List<String> digimones = new LinkedList<String>();
    	 digimones.add("Agumon");
    	 digimones.add("Patamon");
    	 digimones.add("Angemon");
    	 digimones.add("Andromon");
    	 digimones.add("Greymon");
    	 
    	 // Map
    	 // Asocia claves a valores.
    	 // No puede contener claves duplicadas
    	 // Solo puede tener un valor asociado
    	 
    	 //Hashmap
    	 //Tiene mejor rendimietno pero no garantizaba un orden
    	 //A la hora de hacer iteraciones
    	 
    	 Map<Integer, String> usuarios = new HashMap<Integer, String>();
    	 usuarios.put(1, "Carlos Eduardo");
    	 usuarios.put(2, "Raul");
    	 usuarios.put(3, "Ro");
    	 
    	 System.out.println(usuarios.get(1));
    	 
    	 //Keyset nos permite recuperar el nombre de la clave
    	 //value nos permite recuperar el valor directamente
    	 
    	 System.out.println(usuarios.keySet());
    	 System.out.println(usuarios.values()); 
    	 
    	 //TreeMap
    	 Map<String, String> tamales = new TreeMap<String, String>();
    	 tamales.put("Oaxaqueño", "Mole Rojo" );
    	 tamales.put("Torta", "Mole Verde");
    	 tamales.put("Salado", "Pollo");
    	 tamales.put("Dulce", "Elote");
    	 
    	 System.out.println(tamales.keySet());
    	 System.out.println(tamales.values()); 
    	 System.out.println(tamales);
    	 
    	 tamales.entrySet().forEach(elemento -> {// función lambda
    		 //ystem.out.println(elemento.getKey().toString() + elemento.getValue().toString()); 
    		 System.out.println(elemento.getKey()); 
    		 System.out.println(elemento.getValue()); 
    	 });
    	 
    	 
    	 // LinkedHashMap
    	 Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
    	 //guarda los elementos , según el orden en que se inserten
    	 carros.put(1, "Volvo");
    	 carros.put(567, "Pointer");
    	 carros.put(8, "Mustang");
    	 
    	 System.out.println(carros.keySet());
    	 System.out.println(carros.values());

    	 
     
     }
}
