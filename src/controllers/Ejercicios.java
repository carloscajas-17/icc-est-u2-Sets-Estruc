package controllers;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicios{

    public Ejercicios(){
        System.out.println( "Ejercicio 1");
        System.out.println( "Opcion A");
        System.out.println(tieneDuplicados(new int[]{1,2,3,4,5,}));
        System.out.println( "Opcion B");
        System.out.println(tieneDuplicados(new int[]{1,2,2,4,5,4,3,2,45}));


        System.out.println( "Ejercicio 2");
        System.out.println( "Opcion A");
        System.out.println("murcielago es isograma = "+esIsograma("murcièlago"));
        System.out.println( "Opcion B");
        System.out.println("camaleon es isograma = "+esIsograma("camaleòn"));


        System.out.println("Ejercicio 3");
String texto = """
    La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. 
    Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, 
    la IA está presente en casi todos los aspectos de nuestra vida diaria. 
    Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. 
    ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?

    Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. 
    Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. 
    No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.

    En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, 
    sino también en el impacto que genera en la humanidad y en el planeta. 
    El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.
""";

int cantidad = contarPalabrasUnicas(texto);
System.out.println("Palabras únicas en el texto = " + cantidad);

       

        
        
    }
    public boolean tieneDuplicados(int[] numeros){
        
        //HASHSET --> El emtod mejor para que sea rapido y no tenga duplicados
        Set<Integer> set = new HashSet<>();
        
        for( int  i :numeros ){
            if( !set.add(i)){
                return true;
            }
           
        }
        return false;      

    }

    public boolean esIsograma (String palabra){
        //Convertir a mayuscula
        palabra = palabra.toUpperCase();
        //HASHSET --> 
        Set<Character> set = new HashSet<>();
        for (char c : palabra.toCharArray()) {
            if (!set.add(c)) {
                return false;
            }
        }
        System.out.println("\n--------------EJERCICICO 2  CON LA MEJOR FORMAR--> HASHSET------------");

        return true;

    }
    public int contarPalabrasUnicas(String texto) {
    // 1. Reemplazar espacios vacíos, múltiples y saltos de línea por comas
    texto = texto.replaceAll("\\s+", ",");

    // 2. Convertir todo a mayúsculas para uniformidad
    texto = texto.toUpperCase();

    // 3. Separar por comas
    String[] palabras = texto.split(",");

    // 4. Guardar solo palabras distintas en un HashSet
    Set<String> palabrasUnicas = new HashSet<>();
    for (String palabra : palabras) {
        if (!palabra.isBlank()) {
            palabrasUnicas.add(palabra);
        }
    }

    // 5. Mostrar las palabras únicas encontradas
    System.out.println("\n--------------EJERCICIO 3 (espacios ➜ comas) CON HASHSET------------");
    System.out.println("Palabras únicas encontradas: " + palabrasUnicas.size());
    

    return palabrasUnicas.size();
}

}



    
