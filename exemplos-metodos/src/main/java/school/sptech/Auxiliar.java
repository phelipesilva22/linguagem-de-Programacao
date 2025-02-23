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
    // É chamada sobrecarga (utilizando o mesmo metodo - nome, com parâmetros diferentes - tipos e quantidades)
    Double calcularMedia (Double n1, Double n2, Double n3)
    {
        return (n1 + n2 + n3) / 3;
    }
    Double calcularMedia (Double n1, Double n2, Double n3, Double n4)
    {
        return (n1 + n2 + n3 + n4) / 4;
    }

}
