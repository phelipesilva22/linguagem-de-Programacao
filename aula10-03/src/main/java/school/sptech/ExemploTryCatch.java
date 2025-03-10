package school.sptech;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {
        System.out.println("---------------- EXEMPLO TRY CATCH ----------------");

        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            Integer n1 = leitor.nextInt();

            System.out.print("Digite outro número: ");
            Integer n2 = leitor.nextInt();

            System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
        } catch (InputMismatchException e) {
            System.out.println("Número inválido! Tente novamente!");
        } catch (ArithmeticException e)
        {
            System.out.println("Não é possível dividir o número por 0!");
        }

    }
}
