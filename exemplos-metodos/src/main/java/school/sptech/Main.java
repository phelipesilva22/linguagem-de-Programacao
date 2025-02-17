package school.sptech;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String mensagem;
        Double nota1, nota2, nota3;

        System.out.println("-------------- CÁLCULO DA MÉDIA --------------");

        Scanner leitura = new Scanner(System.in);

        System.out.print("Nota 1: ");
        nota1 = leitura.nextDouble();;

        System.out.print("Nota 2: ");
        nota2 = leitura.nextDouble();;

        System.out.print("Nota 3: ");
        nota3 = leitura.nextDouble();;

        // auxiliar.exibirMensagem(mensagem);

        Auxiliar auxiliar = new Auxiliar();

        Double mediaFinal = auxiliar.calcularMedia(nota1, nota2, nota3);
        System.out.println(String.format("A média final é %.2f!", mediaFinal));

        Integer resultadoSoma = auxiliar.somar(10, 5);
        Integer resultadoFinal = auxiliar.somar(resultadoSoma, 3);
        System.out.println(String.format("A soma é %d!", resultadoFinal));

        auxiliar.exibirMensagem("Estou programando em Java");

    }
}