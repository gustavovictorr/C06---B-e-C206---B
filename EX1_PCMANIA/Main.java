import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cliente cliente1 = new Cliente();
        System.out.println("Digite seu nome: ");
        cliente1.nome = entrada.nextLine();
        System.out.println("Digite seu CPF: ");
        cliente1.cpf = entrada.nextLong();

        System.out.println("Digite a promoção desejada: 1, 2 ou 3?");

        int variavelCompra;
        do
        {
            variavelCompra = entrada.nextInt();
            if(variavelCompra == 1)
            {
                Computador computador = new Computador("Positivo", 3300);
                MemoriaUSB memoriaUSB = new MemoriaUSB("Pen-drive", 16);
                computador.addMemoriaUSB(memoriaUSB);
                computador.sistemaOperacional.nome = "Linux Ubuntu";
                computador.sistemaOperacional.tipo = 32;
                cliente1.addComputador(computador, variavelCompra);
                System.out.println("Deseja comprar mais? Digite o número da promoção: 1,2 ou 3");
                System.out.println("Para encerrar a compra: Digite 0");
            }
            else if(variavelCompra == 2)
            {
                Computador computador = new Computador("Acer", 8800);
                MemoriaUSB memoriaUSB = new MemoriaUSB("Pen-drive", 32);
                computador.addMemoriaUSB(memoriaUSB);
                computador.sistemaOperacional.nome = "Windows 8";
                computador.sistemaOperacional.tipo = 64;
                cliente1.addComputador(computador, variavelCompra);
                System.out.println("Deseja comprar mais? Digite o número da promoção: 1,2 ou 3");
                System.out.println("Para encerrar a compra: Digite 0");
            }
            else if (variavelCompra == 3)
            {
                Computador computador = new Computador("Vaio", 4800);
                MemoriaUSB memoriaUSB = new MemoriaUSB("Pen-drive", 16);
                computador.addMemoriaUSB(memoriaUSB);
                computador.sistemaOperacional.nome = "Windows 10";
                computador.sistemaOperacional.tipo = 64;
                cliente1.addComputador(computador, variavelCompra);
                System.out.println("Deseja comprar mais? Digite o número da promoção: 1,2 ou 3");
                System.out.println("Para encerrar a compra: Digite 0");
            }
        }while(variavelCompra != 0);

        System.out.println("Dados do cliente");
        System.out.println("Nome: " + cliente1.nome + " CPF:" + cliente1.cpf);
        System.out.println("Valor total da compra: " + cliente1.calculaTotalCompra());
        System.out.println("Segue lista de compra: ");
        cliente1.mostraPC();
    }
}