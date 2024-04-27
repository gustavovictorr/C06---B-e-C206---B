public class Main {
    public static void main(String[] args) {
    Atletas l[] = new Atletas[6];

    l[0] = new Atletas("Gustavo",2,
            1,7,72.0F,1.78F,
            23,"Brasileiro");

    l[1] = new Atletas("Jude",3,
            2,10,78.0F,1.90F,
            27,"Turco");

    l[0].apresentar();
    l[1].apresentar();

    l[0].ganharLuta();
    l[1].perderLuta();

    l[0].apresentar();
    l[1].apresentar();
    }
}