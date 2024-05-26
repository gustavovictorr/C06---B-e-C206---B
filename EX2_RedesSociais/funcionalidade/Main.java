package funcionalidade;

import excecoes.MinhaExcecaoChecked;
import excecoes.MinhaExcecaoUnchecked;

public class Main {
    public static void main(String[] args) {
        RedeSocial facebook = new Facebook();
        RedeSocial instagram = new Instagram();
        RedeSocial googlePlus = new GooglePlus();
        RedeSocial twitter = new Twitter();

        RedeSocial[] redesJoao = {facebook, instagram};
        RedeSocial[] redesMaria = {facebook, twitter};
        RedeSocial[] redesAna = {googlePlus, twitter};

        Usuarios gustavo = new Usuarios("Gustavo Almeida", "gustavo.almeida@example.com", redesJoao);
        Usuarios neymar = new Usuarios("Neymar Junior", "neymar.jr@example.com", redesMaria);
        Usuarios chico = new Usuarios("Chico Moedas", "chico.moedas@example.com", redesAna);

        gustavo.imprimirRedesSociais();
        neymar.imprimirRedesSociais();
        chico.imprimirRedesSociais();

        System.out.println("\nMétodos das redes sociais de Gustavo:");
        for (RedeSocial rede : gustavo.getRedesSociais()) {
            try {
                usarRedeSocial(rede);
            } catch (MinhaExcecaoChecked | MinhaExcecaoUnchecked e) {
                System.err.println("Exceção capturada: " + e.getMessage());
            }
        }

        System.out.println("\nMétodos das redes sociais de Neymar:");
        for (RedeSocial rede : neymar.getRedesSociais()) {
            try {
                usarRedeSocial(rede);
            } catch (MinhaExcecaoChecked | MinhaExcecaoUnchecked e) {
                System.err.println("Exceção capturada: " + e.getMessage());
            }
        }

        System.out.println("\nMétodos das redes sociais de Chico:");
        for (RedeSocial rede : chico.getRedesSociais()) {
            try {
                usarRedeSocial(rede);
            } catch (MinhaExcecaoChecked | MinhaExcecaoUnchecked e) {
                System.err.println("Exceção capturada: " + e.getMessage());
            }
        }
    }

    public static void usarRedeSocial(RedeSocial rede) throws MinhaExcecaoChecked, MinhaExcecaoUnchecked {
        System.out.println("\nUsando " + rede.getClass().getSimpleName() + ":");

        if (rede instanceof Compartilhamento) {
            Compartilhamento compartilhamento = (Compartilhamento) rede;
            compartilhamento.compartilhar();
        }

        if (rede instanceof VideoConferencia) {
            VideoConferencia videoConferencia = (VideoConferencia) rede;
            videoConferencia.fazStreaming();
        }

        rede.postarFoto();
        rede.postarVideo();
        rede.postarComentario();
        rede.curtirPublicacao();

        if (rede.getClass().getSimpleName().equals("GooglePlus")) {
            throw new MinhaExcecaoChecked("Erro ao usar o GooglePlus");
        }

        if (rede.getClass().getSimpleName().equals("Twitter")) {
            throw new MinhaExcecaoUnchecked("Erro ao usar o Twitter");
        }
    }
}
