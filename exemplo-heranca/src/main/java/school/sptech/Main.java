/*
*  */
package school.sptech;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------- HERANÇA EM POO --------------");

        Aluno aluno1 = new Aluno("Phelipe", "01242117", 7.8, 9.0);
        Aluno aluno2 = new AlunoPos("Caio", "01242118", 9.0, 10.0, 8.0);
        Faculdade faculdade = new Faculdade("SPTECH");
        faculdade.matricular(aluno1);
        faculdade.matricular(aluno2);

        System.out.println("ALUNO FACULDADE: "+ aluno1);
        System.out.println("ALUNO POS: "+ aluno2);
        System.out.println("FACULDADE = '"+ faculdade);

        faculdade.exibirMedia();
        faculdade.exibirNotaTcc();
    }
}