public class Moto extends Veiculo {

    public Moto(String modelo, double preco) {
        super(modelo, preco*1.3);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Moto: " + getModelo() + ", Preço: R$" + getPreco());
    }

    @Override
    public String toString() {
        return "Moto: " + getModelo();
    }
}
