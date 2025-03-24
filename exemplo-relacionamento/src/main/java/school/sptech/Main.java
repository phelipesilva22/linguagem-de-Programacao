package school.sptech;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------- HERANÇA -----------");
        Usuario usuario1 = new Usuario("Phelipe", "phelipe.silva@sptech.school");

        Musica m1 = new Musica("Resenha do arrocha", "J Eskine", 300);
        Musica m2 = new Musica("Telefone fora de área", "Raquel dos teclados", 180);
        Musica m3 = new Musica("Coração sem noção", "Silvano Salles", 240);

        Playlist p1 = new Playlist("Summer Arrocha Hits (2025)", usuario1.getNome());
        p1.adicionar(m1);
        p1.adicionar(m2);
        p1.adicionar(m3);

        p1.getDuracao();
        System.out.println(p1);
        System.out.println("Duração da playlist: "+ p1.getDuracao() + "seg");

    }
}