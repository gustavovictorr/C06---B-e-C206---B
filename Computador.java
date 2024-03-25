package EX1_PCMANIA;

import Exemplos.Composição.Departamento;

public class Computador {

    String marca;
    Float preco;
    Cliente cliente;
    MemoriaUSB memoria;
    SitemaOperacional sistema_op;
    HardwareBasico hadw_bas;

    void MostraPC(int pc_escolhido){
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);

        if (hadw_bas != null) {
            System.out.println("Hadware Básico: " + hadw_bas.processador + " " + hadw_bas.memoria_ram + " GB " + hadw_bas.memoria_armazenamento + " GB");
        }
        if (sistema_op != null) {
            System.out.println("Sistema Operacional: " + sistema_op.nome + " " + sistema_op.tipo + " bits");
        }
        if (memoria != null) {
            if (memoria.capacidade == 1) {
                System.out.println("Memória USB: " + memoria.nome + " " + memoria.capacidade + " TB");
            } else {
                System.out.println("Memória USB: " + memoria.nome + " " + memoria.capacidade + " GB");
            }
        }
    }
}
