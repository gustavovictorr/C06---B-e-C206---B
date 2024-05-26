package funcionalidade;

import java.util.HashSet;

public class Usuarios {
    private String nome;
    private String email;
    private HashSet<RedeSocial> redesSociais;

    // Construtor
    public Usuarios(String nome, String email, RedeSocial[] redesSociaisArray) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = new HashSet<RedeSocial>();

        if (redesSociaisArray != null) {
            for (RedeSocial rede : redesSociaisArray) {
                this.redesSociais.add(rede);
            }
        }
    }

    // Método para imprimir as redes sociais do usuário
    public void imprimirRedesSociais() {
        System.out.println("\nUsuário: " + nome + ", Email: " + email);
        System.out.println("Redes Sociais:");
        for (RedeSocial rede : redesSociais) {
            System.out.println("- " + rede.getClass().getSimpleName());
        }
    }

    // Get
    public HashSet<RedeSocial> getRedesSociais() {
        return redesSociais;
    }
}
