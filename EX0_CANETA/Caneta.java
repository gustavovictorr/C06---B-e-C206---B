package Aula1;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tamapada: " + this.tampada);
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro: Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
}
