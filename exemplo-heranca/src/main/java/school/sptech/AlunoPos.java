package school.sptech;

public class AlunoPos extends Aluno {
    private Double notaTCC;
    public AlunoPos(String nome, String ra, Double notaContinuada, Double notaEntrega, Double notaTCC)
    {
        super (nome, ra, notaContinuada, notaEntrega);
        this.notaTCC = notaTCC;
    }

    @Override
    public String toString() {
        return super.toString()  +
                ", notaTCC = " + notaTCC;
    }
}
