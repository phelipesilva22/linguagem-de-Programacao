package school.sptech;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Exemplo2 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 50, 7);
        Aluno aluno2 = new Aluno("Maria", 19, 3);
        Aluno aluno3 = new Aluno("Alison", 55, 9);
        Aluno aluno4 = new Aluno("Phelipe", 20, 8);

        List<Aluno> alunos = new ArrayList<>(
                List.of(aluno1, aluno2, aluno3, aluno4)
        );


        List<Aluno> alunosOrdenados = alunos.stream().sorted(Comparator.comparing(Aluno::getNota)).limit(2).toList();
        System.out.println("Alunos ordenados: "+ alunosOrdenados);

        List<Aluno> alunoAbaixoDaMedia = alunos.stream().filter(alunodaVez -> alunodaVez.getNota() < 6).toList();
        System.out.println("Alunos abaixo da média: "+ alunoAbaixoDaMedia);


    }
}
