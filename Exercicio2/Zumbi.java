package Exercicio2;

public class Zumbi {

    double vida=50;
    String nome;

    double mostraVida(){
        return vida;
    }

    void tranfereVida(Zumbi zumbiAlvo, double quantia){
        vida -= quantia;
        zumbi.alvo.vida += quantia;
    }
}
