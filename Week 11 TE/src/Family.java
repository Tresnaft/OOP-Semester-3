import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// Main Family Class
class Family {
    private Set<Niece> nieces;
    private Set<Uncle> uncles;

    public Family() {
        this.nieces = new HashSet<>();
        this.uncles = new HashSet<>();
    }

    public boolean addNiece(String name, int day, int month) {
        return nieces.add(new Niece(name, day, month));
    }

    public boolean addUncle(String name) {
        return uncles.add(new Uncle(name));
    }

    public Niece findNiece(String name) {
        return nieces.stream().filter(n -> n.getName().equals(name)).findFirst().orElse(null);
    }

    public Uncle findUncle(String name) {
        return uncles.stream().filter(u -> u.getName().equals(name)).findFirst().orElse(null);
    }

    public void listNieces() {
        // Using TreeSet to sort by birthday
        Set<Niece> sortedNieces = new TreeSet<>(Comparator.comparing(Niece::getBirthday));
        sortedNieces.addAll(nieces);
        sortedNieces.forEach(n -> System.out.println(n.getName() + " - Birthday: " + n.getBirthday()));
    }

    public void listUncles() {
        // Using TreeSet to sort by name
        Set<Uncle> sortedUncles = new TreeSet<>(Comparator.comparing(Uncle::getName));
        sortedUncles.addAll(uncles);
        sortedUncles.forEach(u -> System.out.println(u.getName()));
    }
}