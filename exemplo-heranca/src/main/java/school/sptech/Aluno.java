package school.sptech;

public class Aluno {
    private String nome;
    private String ra;
    private Double notaContinuada;
    private Double notaEntrega;

    public Aluno(){
    }

    public Aluno(String nome, String ra, Double notaContinuada, Double notaEntrega) {
        this.nome = nome;
        this.ra = ra;
        this.notaContinuada = notaContinuada;
        this.notaEntrega = notaEntrega;
    }

    public Double calcularMedia()
    {
        return (this.notaContinuada + notaEntrega / 2.0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaEntrega() {
        return notaEntrega;
    }

    public void setNotaEntrega(Double notaEntrega) {
        this.notaEntrega = notaEntrega;
    }

    /*
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ra='" + ra + '\'' +
                ", notaContinuada=" + notaContinuada +
                ", notaEntrega=" + notaEntrega +
                '}';
    }*/
    @Override
    public String toString(){
        return "Nome = '" + nome + '\'' +
                ", RA = '" + ra + '\'' +
                ", notaContinuada = " + notaContinuada +
                ", notaEntrega = " + notaEntrega;
    }
}
