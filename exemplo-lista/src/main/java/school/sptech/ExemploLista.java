package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        System.out.println("----------- Exemplo Lista -----------");

        List<Integer> lista;
        lista = new ArrayList<>();

        lista.add(100);
        lista.add(60);
        lista.add(1, 75);

        lista.set(2, 99);

        Integer valor = 75;

        lista.remove(valor);
        System.out.println(lista);

        List<String> frutas = new ArrayList<>(
                List.of("Pera", "Banana", "Tomate")
        );
        frutas.add("Abacate");
        frutas.add("Morango");
        frutas.add("Goiaba");
        frutas.add("Limão");

        frutas.remove("Abacate");
        System.out.println(frutas);

        System.out.println("-------- For aprimorado com lista --------");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        System.out.println("-------- For com lista --------");
        for (int i = 0; i < frutas.size(); i++)
        {
            System.out.println(frutas.get(i));
        }
    }
}