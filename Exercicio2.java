import java.util.Scanner;

public class Exercicio2{

    public static void main(String[] args){

        int contador = -1, soma_lanches = 0;
        int num_lanches = 1;

        Scanner entrada = new Scanner(System.in);

        while(num_lanches != 0){
            num_lanches = entrada.nextInt();

            soma_lanches = soma_lanches + num_lanches;
            contador = contador + 1;
        }

        entrada.close();

        float media = soma_lanches/(float)contador;

        System.out.println("Qtd dos lanches: " + soma_lanches);
        System.out.println("Média de lanches: " + media);
    }
}