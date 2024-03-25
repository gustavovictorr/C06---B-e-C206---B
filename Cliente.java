package EX1_PCMANIA;

public class Cliente {

    String nome;
    long cpf;

    public void calculaTotalCompra(int qtd_pc1, int qtd_pc2, int qtd_pc3) {
        float total = qtd_pc1 * 3300 + qtd_pc2 * 8800 + qtd_pc3 * 4800;
        System.out.println("TOTAL DA COMPRA: " + total);
    }
}
