package school.sptech;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("--------------- EXEMPLO STATE ---------------");

        Musica musica1 = new Musica("Tempo perdido", 240, "Legião urbana");
        Musica musica2 = new Musica("Lanterna dos Afogados", 300, "Paralamas do sucesso");
        Musica musica3 = new Musica("Another Brick on the Wall part 2,", 280, "Pink Floyd");

        Player player = new Player();
        player.adicionarMusica(musica1);
        player.adicionarMusica(musica2);
        player.adicionarMusica(musica3);


        player.tocandoAgora();
        player.tocar();
        player.tocandoAgora();
        player.tocar();
        player.parar();
        player.tocandoAgora();
     }
}