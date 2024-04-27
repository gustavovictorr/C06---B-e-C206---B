public class Atletas {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Construtor
    public Atletas(String no, int emp, int der, int vit, float pe, float al, int id, String na) {
        this.nome = no;
        this.empates = emp;
        this.derrotas = der;
        this.vitorias = vit;
        this.setPeso(pe);
        this.altura = al;
        this.idade = id;
        this.nacionalidade = na;
    }

    //Metodos GET e SET
    public String getNome() {
        return nome;}
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEmpates() {
        return empates;}
    public void setEmpates(int empates) {
        this.empates = empates;}

    public int getDerrotas() {
        return derrotas;}
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getVitorias() {
        return vitorias;}
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public String getCategoria() {
        return categoria;}
    private void setCategoria() {
        if(this.peso < 53.2){
            this.categoria = "Invalido";
        }
        else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }
        else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }
        else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Invalido";
        }
    }

    public float getPeso() {
        return peso;}
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public float getAltura() {
        return altura;}
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    //Métodos
    public void apresentar(){
        System.out.println("\nNome: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Idade: " + getIdade());
        System.out.println("Peso: " + getPeso());
        System.out.println("Categoria: Peso " + getCategoria());
        System.out.println("Vitorias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
    }

    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }
    public void empate(){
        setEmpates(getEmpates()+1);
    }


}
