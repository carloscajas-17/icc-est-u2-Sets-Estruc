import controllers.Sets;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();
        System.out.println("NOMBRE : ANDRES CAJAS");
        System.out.println("TEMA: SETS ");

        System.out.println("----------------HASHSET------------");
        System.out.println("Elementos de HashSet (no se garantiza orden):");
        runHashSet(sets);

        System.out.println("\n----------------LINKEDHASHSET------------");
        System.out.println("Elementos de LinkedHashSet (mantiene orden de inserción):");
        runLinkedHashSet(sets);

        System.out.println("\n----------------TREESEET------------");
        System.out.println("Elementos de TreeSet (mantiene orden de inserción):");
        runTreeHashSet(sets);
        System.out.println("\n----------------TREESEETCONCOMPARADOR------------");
        System.out.println("Elementos de TreeSet (mantiene orden de inserción):");
        runTreeSetConComparador(sets);
        System.out.println("\n----------------TREESEETCONCOMPARADORINVERSO------------");
        System.out.println("Elementos de TreeSet (mantiene orden de inserción):");
        runTreeSetConComparadorInverso(sets);
    }
    

    public static void runHashSet(Sets sets) {
        Set<String> resultado = sets.contruirHashSet();
        for (String palabra : resultado) {
            System.out.println(palabra);
        }
    }

    public static void runLinkedHashSet(Sets sets) {
        Set<String> resultado = sets.construirLinkedHashSet();
        for (String palabra : resultado) {
            System.out.println(palabra);
        }
    }
    public static void runTreeHashSet(Sets sets) {
        Set<String> resultado = sets.construirTreeHashSet();
        for (String palabra : resultado) {
            System.out.println(palabra);
        }
    }
    public static void runTreeSetConComparador(Sets sets) {
        Set<String> resultado = sets.construrirTreeSetConComparador();
        for (String palabra : resultado) {
            System.out.println(palabra);
        }
    }
    public static void runTreeSetConComparadorInverso(Sets sets) {
        Set<String> resultado = sets.construrirTreeSetConComparadorInverso();
        for (String palabra : resultado) {
            System.out.println(palabra);
        }
    }
}
