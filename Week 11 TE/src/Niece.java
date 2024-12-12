import java.util.HashMap;
import java.util.Map;

class Niece {
    private String name;
    private int day, month;
    private Map<Uncle, String> receivedPresents;

    Niece(String name, int day, int month) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.receivedPresents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return day + "/" + month;
    }

    public boolean hasReceivedPresent(String description) {
        return receivedPresents.containsValue(description);
    }

    public void addPresent(Uncle giver, String description) {
        receivedPresents.put(giver, description);
    }

    public int clearPresents() {
        int count = receivedPresents.size();
        receivedPresents.clear();
        return count;
    }

    public void listPresents() {
        System.out.println("Presents for " + name + ":");
        for (Uncle uncle : receivedPresents.keySet()) {
            System.out.println("From " + uncle.getName() + ": " + receivedPresents.get(uncle));
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Niece niece = (Niece) obj;
        return name.equals(niece.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}