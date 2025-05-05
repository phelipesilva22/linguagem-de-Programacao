package school.sptech;

public enum NaipeCarta {
    OUROS,
    ESPADAS,
    COPAS,
    PAUS;

    public static NaipeCarta fromString(String naipe)
    {
        for (NaipeCarta naipeDaVez : NaipeCarta.values())
        {
            if (naipeDaVez.name().equalsIgnoreCase(naipe))
                return  naipeDaVez;
        }
        throw new RuntimeException("Valor do naipe inválido");
    }

}
