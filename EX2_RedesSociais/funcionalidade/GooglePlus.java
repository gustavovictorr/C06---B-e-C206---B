package funcionalidade;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    @Override
    public void postarFoto() {
        System.out.println("Foto postada no Google+!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Vídeo postado no Google+!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentário postado no Google+!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo streaming no Google+!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no Google+!");
    }
}
