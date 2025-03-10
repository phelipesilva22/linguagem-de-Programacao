package school.sptech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------- EXEMPLO POO ---------------------");

        Scanner leitor = new Scanner(System.in);
        // Cria um novo objeto da classe bilhete
        BilheteUnico bilhete1 = new BilheteUnico();
        bilhete1.nomeUsuario = "Phelipe";
        bilhete1.saldo = 0.0;
        bilhete1.numero = "0000001";
        bilhete1.estudante = true;
        bilhete1.idoso = false;
        bilhete1.anoEmissao = 2025;

        // Instâncias do objeto (bilhete1 e bilhete2)
        BilheteUnico bilhete2 = new BilheteUnico();
        bilhete2.nomeUsuario = "Silvia";
        bilhete2.saldo = 0.0;
        bilhete2.numero = "0000002";
        bilhete2.estudante = false;
        bilhete2.idoso = false;
        bilhete2.anoEmissao = 2025;

        System.out.println("ANTES DA RECARGA");
        System.out.printf("Saldo do bilhete 1: R$%.2f\n", bilhete1.saldo);
        System.out.printf("Saldo do bilhete 2: R$%.2f\n\n", bilhete2.saldo);

        bilhete1.carregar(10.0);
        bilhete2.carregar(5.0);

        System.out.println("\nDEPOIS DA RECARGA");
        System.out.printf("Saldo do bilhete 1: R$%.2f\n", bilhete1.saldo);
        System.out.printf("Saldo do bilhete 2: R$%.2f\n\n", bilhete2.saldo);


        bilhete1.passarBilhete(false);
        bilhete1.passarBilhete(true);

        bilhete2.passarBilhete(false);
        bilhete2.carregar(5.0);
        bilhete2.passarBilhete(false);

        System.out.printf("Saldo do bilhete 1: R$%.2f\n", bilhete1.saldo);
        System.out.printf("Saldo do bilhete 2: R$%.2f\n", bilhete2.saldo);

    }
}