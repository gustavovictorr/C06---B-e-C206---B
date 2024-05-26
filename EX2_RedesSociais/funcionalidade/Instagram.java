package funcionalidade;

public class Instagram extends RedeSocial {
    @Override
    public void postarFoto() {
        System.out.println("Foto postada no Instagram!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Vídeo postado no Instagram!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentário postado no Instagram!");
    }
}
