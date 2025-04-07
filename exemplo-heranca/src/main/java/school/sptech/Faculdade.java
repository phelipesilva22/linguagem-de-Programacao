package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }
    public void matricular(Aluno aluno)
    {
        this.alunos.add(aluno);
    }

    public void exibirMedia()
    {
        for (Aluno alunoDaVez : alunos)
        {
            System.out.println("Média do %s: %.2f".formatted(alunoDaVez.getNome(), alunoDaVez.calcularMedia()));
        }
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    //  Crie um metodo que exibe a nota tcc de todos os alunos de pós graduação
    public void exibirNotaTcc()
    {
        for (Aluno alunoDaVez : alunos)
        {
            if (alunoDaVez instanceof AlunoPos alunoPos)
            {
                // AlunoPos alunoPos = (AlunoPos) alunoDaVez; // Trocando o tipo da varíável: Aluno -> AlunoPos (Casting)
                System.out.println("Nota TCC do %s: %.2f!".formatted(alunoPos.getNome(), alunoPos.getNotaTCC()));
            }
        }
    }


    @Override
    public String toString() {
        return nome + '\'' +
                ", alunos=" + alunos;
    }
}
