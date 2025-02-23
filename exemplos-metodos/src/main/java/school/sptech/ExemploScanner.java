package school.sptech;
import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("----------------- ESCOLA JAVALI CANSADO -----------------");

        System.out.print("Digite um nome do aluno: ");
        String nomeAluno = leitor.nextLine();

        System.out.print("Digite a primeira nota: ");
        Double nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        Double nota2 = leitor.nextDouble();

        System.out.print("Digite a terceira nota: ");
        Double nota3 = leitor.nextDouble();

        Auxiliar auxiliar = new Auxiliar();
        Double mediaFinal = auxiliar.calcularMedia(nota1, nota2, nota3, 10.0);

        System.out.printf("%s, a sua média final é %.2f\n", nomeAluno, mediaFinal);
    }
}
