package school.sptech;

public class AlunoPos {
    private String nome;
    private Integer notaTcc;

    public AlunoPos(String nome, Integer notaTcc) {
        this.nome = nome;
        this.notaTcc = notaTcc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNotaTcc() {
        return notaTcc;
    }

    public void setNotaTcc(Integer notaTcc) {
        this.notaTcc = notaTcc;
    }

    @Override
    public String toString() {
        return "AlunoPos{" +
                "nome='" + nome + '\'' +
                ", notaTcc=" + notaTcc +
                '}';
    }
}
