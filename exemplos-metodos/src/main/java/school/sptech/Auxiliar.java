package school.sptech;

public class Auxiliar {
    void exibirMensagem(String msg)
    {
        System.out.println("====================");
        System.out.println(msg);
        System.out.println("--------------------");
    }

    Integer somar(Integer a, Integer b)
    {
        return a + b;
    }

    Double calcularMedia (Double n1, Double n2, Double n3)
    {
        return (n1 + n2 + n3) / 3;
    }

}
