package school.sptech;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {
        System.out.println("---------------- EXEMPLO TRY CATCH ----------------");

        Scanner leitor = new Scanner(System.in);
        Integer n1 = null;
        Integer n2 = null;

        do {
            try {
                System.out.print("Digite um número: ");
                n1 = leitor.nextInt();

                System.out.print("Digite outro número: ");
                n2 = leitor.nextInt();

                System.out.printf("%d / %d = %.2f\n", n1, n2, n1 / n2);
            } catch (InputMismatchException e) {
                System.out.println("Número inválido! Tente novamente!");
                leitor.next();
            } catch (ArithmeticException e)
            {
                System.out.println("Não é possível dividir o número por 0!");
            }
        } while (n1 == null || n2 == null || n2 == 0);



    }
}
