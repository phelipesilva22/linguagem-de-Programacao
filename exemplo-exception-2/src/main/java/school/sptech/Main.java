package school.sptech;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------- EXCEPTION 2 ----------------");

        Calculadora calculadora = new Calculadora();
        Integer soma = calculadora.somar(-5, 8);
        System.out.println("Resultado: "+ soma);

    }
}