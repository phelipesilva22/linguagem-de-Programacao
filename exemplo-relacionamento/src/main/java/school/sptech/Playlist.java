package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private String usuario;
    private List<Musica> musicas;

    public Playlist(String nome, String usuario) {
        this.nome = nome;
        this.usuario = usuario;
        this.musicas = new ArrayList<>();
    }

    public void adicionar(Musica musica)
    {
        this.musicas.add(musica);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public Integer getDuracao()
    {
        Integer somaDuracao = 0;
        for (Musica musica : musicas) {
             somaDuracao += musica.getDuracao();
        }
        return somaDuracao;
    }

    @Override
    public String toString() {
        return "Playlist" +
                "= " + nome + '\'' +
                ", Usuario='" + usuario + '\'' +
                "\nMusicas=" + musicas;
    }
}
