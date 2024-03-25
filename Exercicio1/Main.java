package Exercicio1;

public class Main {

    public static void main(String[] args){

        Exercicio1 z1 = new Exercicio1();
        z1.idade = 19;
        z1.nome = "Jorgin";

        System.out.println("Nome do zumbo 1: " + z1.nome);
        System.out.println("Vida total: "+ z1.vida);
        System.out.println("Idade: " + z1.idade);

        //Perdendo vida
        z1.perderVida(10);

        //Ganhando vida
        z1.alimentar(80);
    }
}
