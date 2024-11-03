import java.util.ArrayList;
import java.util.List;

public class Acao implements Subject {
    private String nome;
    private double preco;
    private List<Observer> observers;

    public Acao(String nome, double precoInicial) {
        this.nome = nome;
        this.preco = precoInicial;
        this.observers = new ArrayList<>();
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
        notificarObservers();
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    
    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    
    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.atualizar(nome, preco);
        }
    }
}
