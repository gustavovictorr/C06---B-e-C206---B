package Exercicio2;

public class Main {

    public static void main(String[] args){

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.nome = "Renzo";
        z1.vida = 100;
        z2.nome = "Ryan";
        z2.vida = 999;

        z1 = z2;

        System.out.println("Vida zumbi 1: "+ z1.vida);
        System.out.println("Vida zumbi 2: "+ z2.vida);

    }
}
