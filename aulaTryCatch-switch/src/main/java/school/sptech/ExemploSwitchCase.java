package school.sptech;

import java.util.Scanner;

public class ExemploSwitchCase {
    public static void main(String[] args) {
        System.out.println("---------------- EXEMPLO SWITCH CASE ----------------");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        Integer diaDaSemana = leitor.nextInt();

        switch (diaDaSemana)
        {
            case 1, 7:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia da semana: Segunda-Feira ):");
                break;
            case 3:
                System.out.println("Dia da semana: Terça-Feira");
                break;
            case 4:
                System.out.println("Dia da semana: Quarta-Feira");
                break;
            case 5:
                System.out.println("Dia da semana: Quinta-Feira");
                break;
            case 6:
                System.out.println("Dia da semana: Sexta-Feira (:");
                break;
            default:
                System.out.println("Dia da semana não encontrado!");
                break;
        }



    }
}
