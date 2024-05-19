public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{
    @Override
    public void postarFoto() {
        System.out.println("Foto postada no GooglePlus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Vídeo postado no GooglePlus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentário postado no GooglePlus!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no GooglePlus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Stremando no GooglePlus!");
    }
}
