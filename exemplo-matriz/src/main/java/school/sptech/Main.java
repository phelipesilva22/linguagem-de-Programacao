package school.sptech;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------- EXEMPLOS MATRIZ --------------");
        Integer[] vetor = new Integer[10];
        Integer[][] matriz = new Integer[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }
        System.out.println(Arrays.toString(vetor));

        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                System.out.print("["+matriz[i][j] + " ");
            }
        }



    }
}