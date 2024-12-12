import java.util.HashMap;
import java.util.Map;

public class Niece {
    private String name;
    private int day;
    private int month;

    public String getName() {
        return name;
    }

    private Map<Uncle, String> presentList;

    Niece(String name, int day, int month){
        this.name = name;
        this.day = day;
        this.month = month;
        this.presentList = new HashMap<>();
    }

    private int clearPresents(){
        int i = 0;
        for (Uncle unc : presentList.keySet()){
            presentList.remove(unc);
            i++;
        }
        return i;
    }

    public void listPresents() {
        System.out.println("Presents for " + name + ":");
        for (Uncle uncle : presentList.keySet()) {
            System.out.println("From " + uncle.getName() + ": " + presentList.get(uncle));
        }
    }

    public Map<Uncle, String> getPresentList(){
        return this.presentList;
    }
}
