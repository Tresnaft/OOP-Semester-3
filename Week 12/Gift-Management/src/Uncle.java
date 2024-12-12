import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Uncle {
    private String name;
    private Map<Niece, String> presentList;

    Uncle(String name){
        this.name = name;
        this.presentList = new HashMap<>();
    }

    public String getName(){
        return this.name;
    }

    public boolean addPresent(Niece recipient, String description){
        if (presentList.containsValue(description)) return false; // Avoid duplicate gifts for other nieces
        if (recipient.getPresentList().containsValue(description)) return false; // Avoid duplicate gifts for this niece
        presentList.put(recipient, description);
        recipient.getPresentList().put(this, description);
        return true;
    }

    public void listPresents() {
        System.out.println("Presents from Uncle " + name + ":");
        for (Niece niece : presentList.keySet()) {
            System.out.println(niece.getName() + " will receive: " + presentList.get(niece));
        }
        for (Niece niece : recipientNiecesWithoutPresent()) {
            System.out.println(niece.getName() + " has no present from " + name);
        }
    }

    private Set<Niece> recipientNiecesWithoutPresent() {
        Set<Niece> withoutPresents = new HashSet<>();
        for (Niece niece : presentList.keySet()) {
            if (!presentList.containsKey(niece)) withoutPresents.add(niece);
        }
        return withoutPresents;
    }
}
