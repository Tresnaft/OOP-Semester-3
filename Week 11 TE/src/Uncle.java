import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Uncle Class
class Uncle {
    private String name;
    private Map<Niece, String> presents;

    Uncle(String name) {
        this.name = name;
        this.presents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public boolean addPresent(Niece recipient, String description) {
        if (presents.containsValue(description)) return false; // Avoid duplicate gifts for other nieces
        if (recipient.hasReceivedPresent(description)) return false; // Avoid duplicate gifts for this niece
        presents.put(recipient, description);
        recipient.addPresent(this, description);
        return true;
    }

    public void listPresents() {
        System.out.println("Presents from Uncle " + name + ":");
        for (Niece niece : presents.keySet()) {
            System.out.println(niece.getName() + " will receive: " + presents.get(niece));
        }
        for (Niece niece : recipientNiecesWithoutPresent()) {
            System.out.println(niece.getName() + " has no present from " + name);
        }
    }

    private Set<Niece> recipientNiecesWithoutPresent() {
        Set<Niece> withoutPresents = new HashSet<>();
        for (Niece niece : presents.keySet()) {
            if (!presents.containsKey(niece)) withoutPresents.add(niece);
        }
        return withoutPresents;
    }
}