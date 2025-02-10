package school.sptech;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        // --- Declaração das variáveis ---
        String nome = "Phelipe"; // String -> Objeto
        // --- Tipos Primitivos ---
        int idade = 20;
        double peso = 74.0;
        float altura = 1.69f;
        char genero = 'M';
        boolean temCarro = true;
        long numeroBig = 10000000L;

        // --- Tipos Wrapper --- Objeto que dentro dele tem um tipo primitivo
        Integer minhaIdade = 20;
        Double meuPeso = 74.0;
        Float minhaAltura = 1.69f;
        Character meuGenero = 'M';
        Boolean temMeuCarro = true;
        Long meuNumeroGrande = 10000000L;

        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos e " + altura + "m de altura!");
        System.out.println("Tenho carro? " + temCarro);
    }
}
