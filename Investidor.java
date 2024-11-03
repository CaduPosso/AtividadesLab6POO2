public class Investidor implements Observer {
    private String nome;
    private double limiteMin;
    private double limiteMax;
    private AcaoBroker broker;

    public Investidor(String nome, double limiteMin, double limiteMax, AcaoBroker broker) {
        this.nome = nome;
        this.limiteMin = limiteMin;
        this.limiteMax = limiteMax;
        this.broker = broker;
    }

    
    public void atualizar(String acao, double precoAtual) {
        System.out.println("Investidor " + nome + " foi notificado que a ação " + acao + " mudou para o preço: " + precoAtual);
        if (precoAtual >= limiteMax) {
            System.out.println("Preço máximo atingido! Vendendo a ação " + acao + "...");
            broker.vender(acao);
        } else if (precoAtual <= limiteMin) {
            System.out.println("Preço mínimo atingido! Comprando a ação " + acao + "...");
            broker.comprar(acao);
        }
    }
}
