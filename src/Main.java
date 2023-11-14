import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /* paradigma imperativo = un paradigma di programmazione nel quale
        vado ad esplicitare ogni parte del flusso di esecuzione */
        List<Integer> numeri = new ArrayList<>();
        numeri.add(3);
        numeri.add(6);
        numeri.add(8);
        numeri.add(11);
        numeri.add(7);
        numeri.add(2);
        System.out.println("La somma degli elementi dell'array è: " + sommaArray(numeri));

        /* paradigma dichiarativo = un paradigma nel quale vado a dichiarare
        ciò che il programma voglio che faccia lasciando l'esecuzione al software
        sottostante.
         */
        int somma = numeri.stream().reduce(0, Integer::sum);
        System.out.println("La somma degli elementi dell'array è: " + somma);

        List<String> input_to_validate = new ArrayList<>();

        input_to_validate.add("ABCmessaggioXYZ");
        input_to_validate.add("ABC377gahbvhrXYZ");
        input_to_validate.add("ACC45687813jhgXYZ");
        input_to_validate.add("ABC45687813jhgXYW");
        input_to_validate.add("ABC45687fhryugwifeuhniwneionfweio813jhgXYZ");

        /*
        List<String> input_validated = new ArrayList<>();
        for (String s : input_to_validate) {
            if (isMatching(s, "ABC", "XYZ", 20)) {
                input_validated.add(s);
            }
        }
        System.out.println(input_validated); */
        List<String> input_validated = input_to_validate
                .stream()
                .filter(s -> isMatching(s, "ABC", "XYZ", 20))
                .toList();
    }

    public static int sommaArray(List<Integer> numeri) {
        int somma = 0;
        for (Integer x : numeri) {
            somma += x;
        }
        return somma;
    }

    /**
     * Questo metodo ritorna true se la stringa s in input inizia
     * con prefix, termina con suffix e non supera la lunghezza lenght
     * @param s una stringa
     * @param prefix una stringa
     * @param suffix una stringa
     * @param lenght un intero
     * @return true se s rispetta tutte le proprietà
     */
    public static boolean isMatching(String s, String prefix, String suffix, int lenght) {
        return s.startsWith(prefix) && s.endsWith(suffix) && s.length() <= lenght;
    }

}
