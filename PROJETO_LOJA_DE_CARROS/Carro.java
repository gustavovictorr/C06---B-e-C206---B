public class Carro extends Veiculo {

    public Carro(String modelo, double preco) {
        super(modelo, preco*1.3);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Carro: " + getModelo() + ", Preço: R$" + getPreco());
    }

    @Override
    public String toString() {
        return "Carro: " + getModelo();
    }
}
