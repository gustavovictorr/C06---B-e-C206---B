public abstract class Veiculo {
    private String modelo;
    private double preco;

    public Veiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract void exibirDetalhes();
}
