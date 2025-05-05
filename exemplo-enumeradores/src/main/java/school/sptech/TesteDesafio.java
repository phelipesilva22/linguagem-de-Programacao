package school.sptech;

import java.util.Random;
import java.util.Scanner;

public class TesteDesafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor desejado: ");
        Integer valorDesejado = leitor.nextInt();

        System.out.print("Digite o o naipe desejado: ");
        String naipeDesejado = leitor.next();

        SimboloCarta simbolo = SimboloCarta.fromInteger(valorDesejado);
        NaipeCarta naipe = NaipeCarta.fromString(naipeDesejado);

        Carta carta = new Carta(simbolo, naipe);
        System.out.println(carta);
    }
}

