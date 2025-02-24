package school.sptech;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExemploVetores {
    public static void main(String[] args) {
        System.out.println("------------- EXEMPLO VETORES -------------");

        int[] vetorPrimitivo;
        Integer[] vetorWrapper;
        String[] vetorCaracteres = new String[10];

        vetorPrimitivo = new int[5];
        vetorWrapper = new Integer[5];

        Integer cont = 0;
        for (int i = 0; i < 5; i++)
        {
            vetorPrimitivo[i] = i + 1;
            vetorWrapper[i] = i + 2;
        }

        System.out.println(Arrays.toString(vetorPrimitivo));
        System.out.println(Arrays.toString(vetorWrapper));

        Integer[] vetorIniciado = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(vetorIniciado));

        System.out.println("------ Percorrendo o vetor ------");
        for (int i = 0; i < vetorIniciado.length; i++)
            System.out.print(vetorIniciado[i] + " ");

        System.out.println("\n------ For aprimorado com vetor ------");
        for (Integer valorDaVez: vetorIniciado)
            System.out.print(valorDaVez + " ");

        
    }
}