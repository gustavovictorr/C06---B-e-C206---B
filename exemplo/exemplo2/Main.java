package exemplo.exemplo2;

public class Main {

    public static void main(String[] args){

        Conta conta1 = new Conta();
        Cliente cliente1 = new Cliente();

        cliente1.nome = "Gustavo";
        cliente1.cpf = "123.123";

        conta1.titular = cliente1;

        System.out.println("Nome do cliente: " + conta1.titular.nome);
        System.out.println("CPF do cliente: " + conta1.titular.cpf);

        //[outra meneira]ou System.out.println("Nome do cliente: " +cliente1.nome);

    }

}
