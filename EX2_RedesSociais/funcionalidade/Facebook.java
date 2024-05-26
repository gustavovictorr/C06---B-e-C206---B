package funcionalidade;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {
    @Override
    public void postarFoto() {
        System.out.println("Foto postada no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Vídeo postado no Facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentário postado no Facebook!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo streaming no Facebook!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no Facebook!");
    }
}
