public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        // Adiciona alguns carros à loja
        loja.adicionarVeiculo(new Carro("Ford Mustang", 30000));
        loja.adicionarVeiculo(new Carro("Chevrolet Camaro", 35000));

        // Adiciona algumas motos à loja
        loja.adicionarVeiculo(new Moto("Honda CB500", 20000));
        loja.adicionarVeiculo(new Moto("Yamaha MT-07", 25000));

        Menu menu = new Menu(loja);
        menu.exibirMenu();
    }
}