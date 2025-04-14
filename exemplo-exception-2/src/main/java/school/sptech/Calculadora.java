package school.sptech;

public class Calculadora {
    public Integer somar(Integer a, Integer b)
    {
        if (a < 0 || b < 0)
        {
            throw new NumeroNegativoException("Teste Teste");
        }

        return a + b;
    }
}
