package school.sptech;

public class Exemplo04 {
    public static void main(String[] args) {
        int j = 0, c = 0;

        System.out.println("ESTRUTURA DE REPETIÇÃO");

        System.out.println("USANDO WHILE");
        while (j < 10)
        {
            System.out.print(j + " ");
            j++;
        }

        System.out.println("\nUSANDO DO-WHILE");
        do {
            System.out.print(c + " ");
            c++;
        } while (c < 10);


        System.out.println("\nUSANDO FOR");
        for (int i = 0; i < 10; i++)
            System.out.print(i + " ");

    }
}
