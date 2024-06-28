import java.util.ArrayList;
import java.util.List;

public class Loja {
    // Declara três listas privadas para armazenar veículos, clientes e vendas
    private List<Veiculo> veiculos;
    private List<Cliente> clientes;
    private List<Venda> vendas;

    // Construtor da classe Loja
    public Loja() {
        // Inicializa as listas como novas ArrayLists
        this.veiculos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }

    // Método para adicionar um veículo à lista de veículos
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo); // Adiciona o veículo à lista
    }

    // Método para listar todos os veículos disponíveis
    public List<Veiculo> listarVeiculos() {
        return veiculos; // Retorna a lista de veículos
    }

    // Método para adicionar um cliente à lista de clientes
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente); // Adiciona o cliente à lista
    }

    // Método para registrar uma venda
    public void registrarVenda(Veiculo veiculo, Cliente cliente, double precoCompra, double precoVenda) {
        // Cria um novo objeto Venda
        Venda venda = new Venda(veiculo, cliente, precoVenda, precoCompra);
        vendas.add(venda); // Adiciona a venda à lista de vendas
    }

    // Método para listar todas as vendas realizadas
    public List<Venda> getVendas() {
        return vendas; // Retorna a lista de vendas
    }
}
