import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class Menu {
    private Loja loja;
    private Scanner scanner;

    public Menu(Loja loja) {
        this.loja = loja;
        this.scanner = new Scanner(System.in);
    }

    private void carregarVeiculosDoArquivo(String nomedoarquivo) {
        File file = new File(nomedoarquivo);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] dados = linha.split(",");
                String tipo = dados[0].trim();
                String modelo = dados[1].trim();
                double preco = Double.parseDouble(dados[2].trim());

                if (tipo.equalsIgnoreCase("carro")) {
                    loja.adicionarVeiculo(new Carro(modelo, preco));
                } else if (tipo.equalsIgnoreCase("moto")) {
                    loja.adicionarVeiculo(new Moto(modelo, preco));
                } else {
                    System.out.println("Tipo de veículo inválido: " + tipo);
                }
            }
            System.out.println("Veículos carregados do arquivo com sucesso.");
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
        }
    }

    public void exibirMenu() {
        carregarVeiculosDoArquivo("/Users/gusta/Documents/P5 TELECOM/POO/Projeto_2/veiculos_arquivo.txt");

        int opcao = 0;
        do {
            System.out.println("\n==========CHRIS MOTORS==========");
            System.out.println("1. Nova Compra");
            System.out.println("2. Adicionar Veículo");
            System.out.println("3. Listar Veículos Disponíveis");
            System.out.println("4. Listar Vendas Realizadas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    novaCompra();
                    break;
                case 2:
                    adicionarVeiculo();
                    break;
                case 3:
                    listarVeiculos();
                    break;
                case 4:
                    listarVendas();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

    private void novaCompra() {
        System.out.print("Nome do Cliente: ");
        String nome = scanner.nextLine();
        System.out.print("CPF do Cliente: ");
        String cpf = scanner.nextLine();
        System.out.print("Email do Cliente: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(nome, cpf, email);
        loja.adicionarCliente(cliente);

        System.out.println("\nVeículos Disponíveis:");
        List<Veiculo> veiculosDisponiveis = loja.listarVeiculos();
        for (int i = 0; i < veiculosDisponiveis.size(); i++) {
            Veiculo veiculo = veiculosDisponiveis.get(i);
            System.out.println((i + 1) + ". " + veiculo.getModelo());
        }

        System.out.print("Escolha o número do veículo que deseja comprar: ");
        int escolhaVeiculo = scanner.nextInt();
        scanner.nextLine();

        if (escolhaVeiculo > 0 && escolhaVeiculo <= veiculosDisponiveis.size()) {
            Veiculo veiculoEscolhido = veiculosDisponiveis.get(escolhaVeiculo - 1);
            System.out.print("Preço de Compra: ");
            double precoCompra = scanner.nextDouble();
            System.out.print("Preço de Venda: ");
            double precoVenda = scanner.nextDouble();
            scanner.nextLine();

            loja.registrarVenda(veiculoEscolhido, cliente, precoCompra, precoVenda);
            System.out.println("Compra realizada com sucesso!");

            veiculosDisponiveis.remove(veiculoEscolhido);
        } else {
            System.out.println("Escolha inválida.");
        }
    }

    private void adicionarVeiculo() {
        System.out.print("Tipo de Veículo (carro/moto): ");
        String tipoVeiculo = scanner.nextLine();

        System.out.print("Modelo do(a) " + tipoVeiculo + " : ");
        String modelo = scanner.nextLine();

        System.out.print("Preço de Compra: ");
        double precoCompra = scanner.nextDouble();
        scanner.nextLine();

        if ("carro".equalsIgnoreCase(tipoVeiculo)) {
            loja.adicionarVeiculo(new Carro(modelo, precoCompra));
            System.out.println("Carro adicionado com sucesso!");
        } else if ("moto".equalsIgnoreCase(tipoVeiculo)) {
            loja.adicionarVeiculo(new Moto(modelo, precoCompra));
            System.out.println("Moto adicionada com sucesso!");
        } else {
            System.out.println("Tipo de veículo inválido. Tente novamente.");
        }
    }

    private void listarVeiculos() {
        System.out.println("Veículos Disponíveis:");
        List<Veiculo> veiculos = loja.listarVeiculos();
        for (Veiculo veiculo : veiculos) {
            String tipoVeiculo = veiculo instanceof Carro ? "CARRO" : "MOTO";
            System.out.println(tipoVeiculo + ": " + veiculo.getModelo() + ", Preço: R$" + veiculo.getPreco());
        }
    }

    private void listarVendas() {
        System.out.println("Vendas Realizadas:");
        for (Venda venda : loja.getVendas()) {
            System.out.println(venda);
        }
    }
}
