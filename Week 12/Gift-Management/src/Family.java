import java.util.*;

public class Family {
    private Set<Uncle> uncleSet;
    private Set<Niece> nieceSet;

    public Set<Niece> getNieceSet() {
        return nieceSet;
    }

    public Set<Uncle> getUncleSet() {
        return uncleSet;
    }

    public Family(){
        uncleSet = new HashSet<>();
        nieceSet = new HashSet<>();
    }

    public boolean addNiece(String name, int day, int month){
        return nieceSet.add(new Niece(name, day, month));
    }

    public boolean addUncle(String name){
        return uncleSet.add(new Uncle(name));
    }

    public Niece findNiece(String name){
        if (!(nieceSet.contains(name))) return null;
        Iterator<Niece> iterator = nieceSet.iterator();

        // Get the first element if it exists
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(name)) return iterator.next();
        }
        return null;
    }

    public Uncle findUncle(String name){
        if (!(uncleSet.contains(name))) return null;
        Iterator<Uncle> iterator = uncleSet.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(name)) return iterator.next();
        }
        return null;
    }

    public void listNieces(){
        System.out.println("List Nieces");
        Iterator<Niece> iterator = nieceSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void listUncle(){
        System.out.println("List Nieces");
        Iterator<Uncle> iterator = uncleSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
