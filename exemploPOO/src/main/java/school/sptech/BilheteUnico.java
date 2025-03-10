package school.sptech;

public class BilheteUnico {
    // Atributos da classe bilhete único
    String nomeUsuario;
    String numero;
    Double saldo;
    Boolean estudante, idoso;
    Integer anoEmissao;

    Boolean carregar(Double valor)
    {
        if (valor < 2.0 || valor > 100.0)
        {
            System.out.println("Valor inválido para recarga!");
            return false;
        }
        saldo += valor;
        System.out.println("Recarga realizada com sucesso!");
        return true;
    }

    void passarBilhete(Boolean integracao)
    {
        if (integracao || idoso)
        {
            System.out.println("Subsídio: R$0,00");
            return;
        }

        Double valorPassagem = estudante ? 2.60 : 5.20;
        String mensagem = estudante ? "Estudante" : "Comum";

        if (saldo >= valorPassagem)
        {
            System.out.printf("%s: %.2f!\n", mensagem, valorPassagem);
            saldo -= valorPassagem;
        } else
        {
            System.out.println("Saldo insuficiente!");
        }

    }
}


