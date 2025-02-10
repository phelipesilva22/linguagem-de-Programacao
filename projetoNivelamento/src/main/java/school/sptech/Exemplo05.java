package school.sptech;
import java.util.Scanner;
import static java.lang.Math.pow;

public class Exemplo05 {
    public static void main(String[] args) {
        // +, -, *, /, %, **
        Integer n1, n2;

        Scanner ler = new Scanner(System.in);
        System.out.println("--- Operadores aritméticos ---");

        System.out.print("Digite um número: ");
        n1 = ler.nextInt();;

        System.out.print("Digite outro número: ");
        n2 = ler.nextInt();

        System.out.println("Soma: " + n1 + " + "  + n2+ " = " + (n1 + n2));
        System.out.println("Subtração: " + n1 + " - "  + n2+ " = " + (n1 - n2));
        System.out.println("Multiplicação: " + n1 + " * "  + n2+ " = " + (n1 * n2));
        System.out.println("Divisão: " + n1 + " / "  + n2+ " = " + (n1 / n2));
        System.out.println("Resto da Divisão: " + n1 + " % "  + n2+ " = " + (n1 % n2));
        System.out.println("Potenciação: " + n1 + " ^ "  + n2+ " = " + Math.pow(n1, n2));

    }
}
