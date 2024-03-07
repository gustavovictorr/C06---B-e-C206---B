import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a NPA: ");
        float nota_npa = entrada.nextInt();

        if(nota_npa >= 60){
            System.out.println("Boa brabo!! Missed passed! ");
        }else{
            System.out.println("Deu ruim, digite a NFA: ");
            float nota_nfa = entrada.nextInt();

            if(nota_nfa >= 60){
                System.out.println("Missed passed! ");
            }else{
                System.out.println("Já era, puxa proximo semestre... ");
            }
        }
    }
}
