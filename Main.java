public class Main {
    public static void main(String[] args) {
        Acao acaoXYZ = new Acao("XYZ", 100.0);
        AcaoBroker broker = new AcaoBroker();
        
        Investidor investidor1 = new Investidor("Carlos", 90.0, 110.0, broker);
        Investidor investidor2 = new Investidor("Ana", 85.0, 115.0, broker);

        acaoXYZ.adicionarObserver(investidor1);
        acaoXYZ.adicionarObserver(investidor2);

        // Simulando mudanças no preço da ação
        acaoXYZ.setPreco(105.0);
        acaoXYZ.setPreco(115.0); // Deve acionar uma venda para ambos investidores
    }
}
