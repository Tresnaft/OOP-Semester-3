import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
/**
 * Wildcard Arguments With An Unknown Type
 * @author javaguides.net
 *
 */
public class WildCardSimpleExample {
    public static <T> void printCollection(Collection<T> c) {
        for (T e : c) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Collection collection = new ArrayList<>();
        collection.add("ArrayList Collection");
        printCollection(collection);
        Collection<String> collection2 = new LinkedList<>();
        collection2.add("LinkedList Collection");
        printCollection(collection2);
        Collection<String> collection3 = new HashSet<>();
        collection3.add("HashSet Collection");
        printCollection(collection3);
    }
}