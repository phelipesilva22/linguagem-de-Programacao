package school.sptech;

public class Musica {
    private String nome;
    private String artista;
    private Integer duracao; // Em segundos

    public Musica(String nome, String artista, Integer duracao) {
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "nome = " + nome + '\'' +
                ", artista = " + artista + '\'' +
                "duracao = " + duracao +
                '}' + '\n';
    }
}
