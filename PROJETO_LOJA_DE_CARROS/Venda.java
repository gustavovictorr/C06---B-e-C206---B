import java.time.LocalDate;

public class Venda {
    private Veiculo veiculo;
    private Cliente cliente;
    private double precoVenda;
    private double precoCompra;
    private LocalDate dataVenda;

    public Venda(Veiculo veiculo, Cliente cliente, double precoVenda, double precoCompra) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.precoVenda = precoVenda;
        this.precoCompra = precoCompra;
        this.dataVenda = LocalDate.now();
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    @Override
    public String toString() {
        return "Venda realizada em " + dataVenda + " - Cliente: " + cliente.getNome() +
                " - Veículo: " + veiculo.getModelo() + " - Preço de compra: " + precoCompra +
                " - Preço de venda: " + precoVenda;
    }
}
