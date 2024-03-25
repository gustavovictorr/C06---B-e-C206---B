package Exercicio1;

public class Exercicio1 {

    //Membros da classe
    String nome;
    int idade;
    double vida=50;
    boolean alimentado;

    //Metodo para alimentar
    void alimentar(double vida){
        if(alimentado){
            System.out.println("Já estou alimentado");
        }else{
            System.out.println("To famintoo!");
            this.vida += vida;
            System.out.println("Acabei de me alimentar " + vida + " pontos de vida");
            System.out.println("Estou com " + this.vida + " pontos de vida");
            if(this.vida >= 100){
                alimentado = true;
            }
        }
    }

    //Metodo para perder vida
    void perderVida(double vida){
        this.vida -= vida;
        System.out.println("Acabei de perder " + vida + " pontos de vida");
        System.out.println("Estou com " + this.vida + " pontos de vida");
        if(this.vida < 100){
            alimentado = false;
        }
    }
}
