package school.sptech;

public class TesteConstrutor {
    public static void main(String[] args) {
        /*
        BilheteUnico bilheteUnico1 = new BilheteUnico("Phelipe", "123", 0.0, true, false, 2025);
        System.out.printf("Usuário do bilhete1: %s\n", bilheteUnico1.nomeUsuario);
        System.out.printf("Número do bilhete1: %s\n", bilheteUnico1.numero);
        System.out.printf("Saldo do bilhete1: %.2f\n", bilheteUnico1.saldo);
        System.out.printf("É estudante?: %b\n", bilheteUnico1.estudante);
        System.out.printf("É idoso? %b\n", bilheteUnico1.idoso);
        System.out.printf("Ano de emissão: %d\n", bilheteUnico1.anoEmissao);

        BilheteUnico bilheteUnico2 = new BilheteUnico();
        bilheteUnico2.nomeUsuario = "Manoel";
        bilheteUnico2.numero = "234";
        bilheteUnico2.estudante = false;
        bilheteUnico2.idoso = true;
        bilheteUnico2.anoEmissao = 1975;

        System.out.println("-----------------------------------------------------");
        System.out.printf("Usuário do bilhete2: %s\n", bilheteUnico2.nomeUsuario);
        System.out.printf("Número do bilhete2: %s\n", bilheteUnico2.numero);
        System.out.printf("Saldo do bilhete2: %.2f\n", bilheteUnico2.saldo);
        System.out.printf("É estudante?: %b\n", bilheteUnico2.estudante);
        System.out.printf("É idoso? %b\n", bilheteUnico2.idoso);
        System.out.printf("Ano de emissão: %d\n", bilheteUnico2.anoEmissao);
         */
        BilheteUnico b1 =  new BilheteUnico("Murilo");
        b1.carregar(50.0);
        b1.setNome("Phelipe Bruione");

        System.out.println("Nome do usuário: "+ b1.getNome());
        System.out.println("Saldo do bilhete: "+ b1.getSaldo());



    }
}
