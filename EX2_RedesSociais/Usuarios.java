import java.util.Arrays;

public class Usuarios {
    private String nome;
    private String email;
    private RedeSocial[] redesSociais;

    public Usuarios(String nome, String email, RedeSocial[] redesSociais) {
        this.nome = nome;
        this.email = email;

        // Verifica se o parâmetro redesSociais não é nulo
        if (redesSociais != null) {
            this.redesSociais = redesSociais; // Se não for nulo, atribui o valor de redesSociais a this.redesSociais
        } else {
            this.redesSociais = new RedeSocial[0]; // Se for nulo, cria um novo array vazio de RedeSocial e atribui a this.redesSociais
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RedeSocial[] getRedesSociais() {
        return redesSociais;
    }

    public void setRedesSociais(RedeSocial[] redesSociais) {
        this.redesSociais = redesSociais;
    }

}
