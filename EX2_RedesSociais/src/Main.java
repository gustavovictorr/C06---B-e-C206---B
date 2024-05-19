import java.util.HashSet;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de RedesSociais
        RedeSocial facebook = new Facebook();
        RedeSocial googlePlus = new GooglePlus();
        RedeSocial instagram = new Instagram();
        RedeSocial twitter = new Twitter();

        // Adicionando redes sociais ao usuário usando HashSet
        HashSet<RedeSocial> redesSociaisHashSet = new HashSet<>();
        redesSociaisHashSet.add(facebook);
        redesSociaisHashSet.add(googlePlus);
        redesSociaisHashSet.add(instagram);
        redesSociaisHashSet.add(twitter);

        // Criando uma instância de Usuarios
        Usuarios usuarioHashSet = new Usuarios("João Silva", "joao.silva@example.com");


        // Testando os métodos das redes sociais usando HashSet
        for (RedeSocial rede : usuarioHashSet.getRedesSociaisHashSet()) {
            System.out.println("\nUsando " + getNomeRedeSocial(rede) + ":");

            // Postando foto, vídeo, comentário e curtindo publicação
            rede.postarFoto();
            rede.postarVideo();
            rede.postarComentario();
            rede.curtirPublicacao();
        }

        // Adicionando redes sociais ao usuário usando HashMap
        HashMap<String, RedeSocial> redesSociaisHashMap = new HashMap<>();
        redesSociaisHashMap.put("Facebook", facebook);
        redesSociaisHashMap.put("GooglePlus", googlePlus);
        redesSociaisHashMap.put("Instagram", instagram);
        redesSociaisHashMap.put("Twitter", twitter);

        // Criando uma instância de Usuarios
        Usuarios usuarioHashMap = new Usuarios("Maria", "maria@example.com");
        usuarioHashMap.setRedesSociaisHashMap(redesSociaisHashMap);

        // Imprimindo detalhes do usuário usando HashMap
        usuarioHashMap.imprimirRedesSociaisHashMap();

        // Testando os métodos das redes sociais usando HashMap
        for (RedeSocial rede : usuarioHashMap.getRedesSociaisHashMap().values()) {
            System.out.println("\nUsando " + getNomeRedeSocial(rede) + ":");

            // Postando foto, vídeo, comentário e curtindo publicação
            rede.postarFoto();
            rede.postarVideo();
            rede.postarComentario();
            rede.curtirPublicacao();
        }
    }
}

