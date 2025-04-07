package school.sptech;

public class AlunoPos extends Aluno {
    private Double notaTCC;
    public AlunoPos(String nome, String ra, Double notaContinuada, Double notaEntrega, Double notaTCC)
    {
        super (nome, ra, notaContinuada, notaEntrega);
        this.notaTCC = notaTCC;

    }

    public Double getNotaTCC() {
        return notaTCC;
    }

    public void setNotaTCC(Double notaTCC) {
        this.notaTCC = notaTCC;
    }

    @Override
    public Double calcularMedia()
    {
        return (this.getNotaContinuada() + this.getNotaEntrega() + this.notaTCC) / 3;
    }

    @Override
    public String toString() {
        return super.toString()  +
                ", notaTCC = " + notaTCC;
    }
}
