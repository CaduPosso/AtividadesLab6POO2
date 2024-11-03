import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void adicionarObserver(Observer observer);
    void removerObserver(Observer observer);
    void notificarObservers();
}
