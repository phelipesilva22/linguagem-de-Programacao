package school.sptech;

public enum SimboloCarta {

    A(1),
    DOIS(2),
    TRES(3),
    QUATRO(4),
    CINCO(5),
    SEIS(6),
    SETE(7),
    OITO(8),
    NOVE(9),
    DEZ(10),
    J(11),
    Q(12),
    K(13);

    private Integer valor;

    SimboloCarta(Integer valor)
    {
        this.valor = valor;
    }

    public Integer getValor()
    {
        return valor;
    }

    public static SimboloCarta fromInteger(Integer valor)
    {

        for (SimboloCarta simboloDaVez : SimboloCarta.values())
        {
            if (simboloDaVez.getValor().equals(valor))
            {
               return simboloDaVez;
            }
        }
        throw new RuntimeException("Valor de carta inválido");
    }

}
