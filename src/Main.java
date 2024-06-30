import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Creazione di un HashSet di Stringhe
        Set<String> stringSet = createStringHashSet();

        // Creazione di un oggetto String e inserimento nell'HashSet
        String newString = "gatto";
        stringSet.add(newString);

        // Verifica se l'oggetto è presente nel Set
        boolean containsElement = stringSet.contains(newString);

        // Stampare il risultato della verifica
        System.out.println("L'elemento '" + newString + "' è presente nel Set? " + containsElement);
    }

    public static Set<String> createStringHashSet() {
        // Creazione e riempimento di un HashSet di Stringhe
        Set<String> set = new HashSet<>();
        set.add("Cane");
        set.add("Pecora");
        set.add("Cavallo");
        return set;
    }
}