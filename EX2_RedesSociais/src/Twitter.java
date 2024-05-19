public class Twitter extends RedeSocial implements Compartilhamento{
    @Override
    public void postarFoto() {
        System.out.println("Foto postada no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Vídeo postado no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentário postado no Twitter!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no Twitter!");
    }


}
