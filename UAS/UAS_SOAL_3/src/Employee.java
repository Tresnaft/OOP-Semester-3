import java.util.ArrayList;
import java.util.List;

public class Employee<T> {
    private final List<Observer<T>> observers = new ArrayList<>();
    private T state;

    // Menambahkan Observer
    public void addObserver(Observer<T> observer){
        this.observers.add(observer);
    }

    // Menghapus Observer
    public void removeObserver(Observer<T> observer){
        this.observers.remove(observer);
    }

    // Mengubah state dan memberi notifikasi
    public void setState(T state){
        this.state = state;
        notifyObservers();
    }

    // Memberi notifikasi ke semua observer
    private void notifyObservers(){
        for (Observer<T> observer : observers){
            observer.update(this.state);
        }
    }
}
