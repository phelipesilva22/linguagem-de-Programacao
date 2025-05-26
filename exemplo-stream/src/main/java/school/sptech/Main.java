package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        System.out.println("-------------- EXEMPLO STREAM --------------");
        List<String> numeros = new ArrayList<>(
                List.of("Um", "dois", "três", "oito")
        );



        List<Integer> inteiros = new ArrayList<>(
                List.of(4, 10, 15, 23, 50)
        );

        Double valorTotal = 0.0;
        for (Integer inteiro : inteiros) {
            valorTotal += inteiro;
        }

        System.out.println("O valor total é: " + valorTotal);
        */
        List<String> numeros = new ArrayList<>(
                List.of("um", "dois", "três", "quatro", "oito")
        );

        List<String> numerosFiltrados = numeros.stream().filter(numeroDaVez -> numeroDaVez.contains("o")).toList();
        System.out.println("Numeros filtrados: "+ numerosFiltrados);

        List<Integer> inteiros = new ArrayList<>(
                List.of(400, 100, 150, 233, 50, 50)
        );

        Integer valorTotal = inteiros.stream().mapToInt(numeroDaVez -> numeroDaVez.intValue()).sum();
        System.out.println("Valor total da lista: "+ valorTotal);

        Double media = inteiros.stream().mapToDouble(numeroDaVez -> numeroDaVez.doubleValue()).average().orElse(0.0);
        System.out.println("Média da lista: "+ media);

        Optional<String> valorOpcional = Optional.ofNullable("Nada");
        String valor = valorOpcional.get();
        System.out.println(valor);

        Boolean numerosMaior15 = inteiros.stream().allMatch(numerodaVez -> numerodaVez > 15);
        System.out.println("Todos os números maiores que 15: "+ numerosMaior15);

        Boolean algumMaior50 = inteiros.stream().anyMatch(numerodaVez -> numerodaVez > 50);
        System.out.println("Algum número maior que 50: "+ algumMaior50);

        Integer primeiroMaiorQue15 = inteiros.stream().filter(numero -> numero > 15).findFirst().orElse(0);
        System.out.println("Primeiro maior que 15: "+ primeiroMaiorQue15);

        List<Integer> numerosOrdenados = inteiros.stream().sorted().toList();
        System.out.println("Números Ordenados: "+ numerosOrdenados);

        List<String> numerosEscritosOrdenados = numeros.stream().sorted().toList();
        System.out.println("String ordenadas: "+ numerosEscritosOrdenados);

        List<Integer> numerosSemRepetir = inteiros.stream().distinct().sorted().toList();
        System.out.println("Números não repetidos: "+ numerosSemRepetir);

        List<String> numerosUpperCase = numeros.stream().map(numeroDaVez -> numeroDaVez.toUpperCase()).toList();
        System.out.println("NÚMEROS UPPERCASE: " + numerosUpperCase);



    }
}