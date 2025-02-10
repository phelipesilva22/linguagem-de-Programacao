package school.sptech;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Exemplo07 {
    public static void main(String[] args) {
        System.out.println("--- Numéros Aleatórios ---");

        Integer numeroRandomicInteiro = ThreadLocalRandom.current().nextInt(10, 20);
        System.out.println(String.format("Número randômico Inteiro: %d", numeroRandomicInteiro));


        Double numeroRandomicoReal = ThreadLocalRandom.current().nextDouble(10.5, 20.5);
        System.out.println(String.format("Número randômico Real: %.2f", numeroRandomicoReal));

        Boolean caraCoroa = ThreadLocalRandom.current().nextBoolean();
        String sorteioCaraCoroa = "Cara";

        if (caraCoroa == false)
            sorteioCaraCoroa = "Coroa";

        System.out.println(caraCoroa);
        System.out.println(sorteioCaraCoroa);

    }
}
