package school.sptech;

import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numeroDigitado;

        do {
            System.out.print("Digite um número entre 0 e 10: ");
            numeroDigitado = leitor.nextInt();
        } while (numeroDigitado < 0 || numeroDigitado > 10);
        System.out.println("O números digitado foi: " + numeroDigitado);
    }
}
