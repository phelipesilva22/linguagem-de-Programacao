package school.sptech;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploMap {
    public static void main(String[] args) {

    Aluno aluno1 = new Aluno("João", 50, 7);
    Aluno aluno2 = new Aluno("Maria", 19, 3);
    Aluno aluno3 = new Aluno("Alison", 55, 9);
    Aluno aluno4 = new Aluno("Phelipe", 20, 8);

    List<Aluno> alunos = new ArrayList<>(
            List.of(aluno1, aluno2, aluno3, aluno4)
    );

    List<AlunoPos> alunosPos = alunos.stream().map(a -> new AlunoPos("Manoel", 9)).toList();
    System.out.println("Aluno Pos: "+ alunosPos);

    List<String> resultado = alunos.stream()
                                          .filter(aluno -> aluno.getIdade() > 20)
                                          .sorted(Comparator.comparing(Aluno::getNota)).limit(3)
                                          .map(a -> a.getNome().toUpperCase())
                                          .toList();
    System.out.println("Alunos  filtrado: "+ resultado);



    }
}
