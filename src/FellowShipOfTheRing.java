import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FellowShipOfTheRing {
    public static void main(String[] args) {

        Set<String> dwarves = new HashSet<>(List.of("Gimli"));

        Set<String> elves = new HashSet<>(List.of("Legolas"));

        Set<String> humans = new HashSet<>(List.of("Aragorn", "Boromir"));

        Set<String> hobbits = new HashSet<>(List.of("Frodo", "Sam", "Merry", "Pippin"));

        Set<String> fellowship = new HashSet<>();
        //Set<Set<String>> fellowship = new HashSet<>();
        fellowship.addAll(dwarves);
        fellowship.addAll(elves);
        fellowship.addAll(humans);
        fellowship.addAll(hobbits);

        System.out.println(fellowship);
        fellowship.add("Gandalf");
        fellowship.remove("Gandalf");
        fellowship.add("Gandalf The White");
        fellowship.removeAll(hobbits);
        System.out.println(fellowship.containsAll(hobbits));
        fellowship.remove("Boromir");
        System.out.println(fellowship);

    }

}


