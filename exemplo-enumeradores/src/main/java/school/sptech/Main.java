package school.sptech;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("------------ ENUMERADORES ------------");


        Carta c1 = new Carta(SimboloCarta.A, NaipeCarta.OUROS);
        Carta c2 = new Carta(SimboloCarta.CINCO, NaipeCarta.ESPADAS);
        Carta c3 = new Carta(SimboloCarta.DEZ, NaipeCarta.PAUS);
        Carta c4 = new Carta(SimboloCarta.J, NaipeCarta.COPAS);

        if(c1.getNaipe().compareTo(c2.getNaipe()) > 0)
            System.out.println("Carta 1 ganhou");
        else if (c1.getNaipe().compareTo(c2.getNaipe()) == 0)
            System.out.println("Empate");
        else
            System.out.println("Carta 1 perdeu");

        if (c1.getValor().getSimbolo() > 3)
            System.out.println("Você ganhou");
        else
            System.out.println("Você perdeu");


        switch (c1.getNaipe())
        {
            case ESPADAS -> System.out.println("Está carta é do naipe de espadas");
            case OUROS -> System.out.println("Está carta é do naipe de ouros");
            case PAUS -> System.out.println("Está carta é do naipe de paus");
            case COPAS -> System.out.println("Está carta é do naipe de copas");
        }


        String naipeDesejado = "copas";
        Integer valorDesejado = 10;
        /*
        * A partir dos valores de 'naipeDesejado' e 'simboloDesejado'
        * Crie um novo objeto Carta
        * */


        for(SimboloCarta simbolo: SimboloCarta.values())
        {
            if (simbolo.getValor().equals(valorDesejado))
            {
                System.out.println("Valor válido");
                break;
            }
        }

        for(SimboloCarta simbolo: SimboloCarta.values())
        {
            if (simbolo.getValor().equals(valorDesejado))
            {
                System.out.println("Valor válido");
                break;
            }
        }

    }
}