package EX1_PCMANIA;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        int cadastro = 0;
        int contador_pc1 = 0;
        int contador_pc2 = 0;
        int contador_pc3 = 0;

        Computador pc1 = new Computador();
        Computador pc2 = new Computador();
        Computador pc3 = new Computador();

        SitemaOperacional sistema1 = new SitemaOperacional();
        SitemaOperacional sistema2 = new SitemaOperacional();
        SitemaOperacional sistema3 = new SitemaOperacional();

        MemoriaUSB memoria1 = new MemoriaUSB();
        MemoriaUSB memoria2 = new MemoriaUSB();
        MemoriaUSB memoria3 = new MemoriaUSB();

        HardwareBasico hadw1 = new HardwareBasico();
        HardwareBasico hadw2 = new HardwareBasico();
        HardwareBasico hadw3 = new HardwareBasico();

        sistema1.nome = "Linux Ubuntu (32 bits)";
        sistema2.nome = "Windows 8 (64 bits)";
        sistema3.nome = "Windows 10 (64 bits)";

        sistema1.tipo = 32;
        sistema2.tipo = 64;
        sistema3.tipo = 64;

        memoria1.nome = "Pen Drive";
        memoria2.nome = "Pen Drive";
        memoria3.nome = "HD Externo";

        memoria1.capacidade = 16;
        memoria2.capacidade = 32;
        memoria3.capacidade = 1;

        hadw1.processador = "Processador Pentium CORE i3 (2200 MHz), 8 GB RAM e 500 GB de HD";
        hadw1.memoria_ram = 8;
        hadw1.memoria_armazenamento = 500;

        hadw2.processador = "Processador Pentium CORE i5 (3370 MHz), 16 GB RAM e 1 TB de HD";
        hadw2.memoria_ram = 16;
        hadw2.memoria_armazenamento = 1000;

        hadw3.processador = "Processador CORE i7 (4500 MHz), 32 GB RAM e 2 TB de HD";
        hadw3.memoria_ram = 32;
        hadw3.memoria_armazenamento = 2000;

        pc1.marca = "Positivo";
        pc2.marca = "Acer";
        pc3.marca = "Vaio";

        pc1.preco = 3300.0F;
        pc2.preco = 4800.0F;
        pc3.preco = 8800.0F;

        pc1.sistema_op = sistema1;
        pc2.sistema_op = sistema2;
        pc3.sistema_op = sistema3;

        pc1.memoria = memoria1;
        pc2.memoria = memoria2;
        pc3.memoria = memoria3;

        pc1.hadw_bas = hadw1;
        pc2.hadw_bas = hadw2;
        pc3.hadw_bas = hadw3;

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n===============BEM VINDO A PC MANIA===============");

        String nome_cliente = null;
        while (true) {
            while (cadastro != 1) {
                Cliente cliente1 = new Cliente();
                System.out.print("\n*DIGITE SEU NOME: ");
                nome_cliente = entrada.nextLine();
                cliente1.nome = nome_cliente;
                System.out.print("*DIGITE SEU CPF: ");
                long cpf_cliente = entrada.nextLong();
                entrada.nextLine(); // Limpar o buffer do scanner após a leitura do long
                cliente1.cpf = cpf_cliente;
                cadastro = 1;
            }

            System.out.println("\nTEMOS 3 PROMOÇÕES DE PC\n");
            System.out.println("PROMOCÃO 1: \n");
            pc1.MostraPC(1);
            System.out.println("\nPROMOCÃO 2: \n");
            pc2.MostraPC(2);
            System.out.println("\nPROMOCÃO 3: \n");
            pc3.MostraPC(3);
            System.out.println("\n*DESEJA COMPRAR QUAL PC?* \n [1] PROMOÇÃO 1 \n [2] PROMOÇÃO 2 \n [3] PROMOÇÃO 3 \n [0] SAIR");

            int escolha_promo = entrada.nextInt();

            if (escolha_promo == 1) {
                System.out.println("COMPRA CONFIRMADA");
                contador_pc1 += 1;
            }
            if (escolha_promo == 2) {
                System.out.println("COMPRA CONFIRMADA");
                contador_pc2 += 1;
            }
            if (escolha_promo == 3) {
                System.out.println("COMPRA CONFIRMADA");
                contador_pc3 += 1;
            }
            if (escolha_promo == 0) {
                break;
            }
            if (escolha_promo < 0 || escolha_promo > 3) {
                System.out.println("Número inválido");
            }
        }
        float total = contador_pc1 * 3300 + contador_pc2 * 4800 + contador_pc3 * 8800;
        System.out.println("TOTAL DA COMPRA: R$" + total);
        System.out.println("=========== VOLTE SEMPRE " + nome_cliente + " ===========");
    }
}
