package school.sptech;

public class BilheteUnico {
    // Atributos da classe bilhete único
    private String nomeUsuario;
    private String numero;
    private Double saldo;
    private Boolean estudante, idoso;
    private Integer anoEmissao;

    BilheteUnico()
    {
        this.saldo = 0.0;
    }
    
    BilheteUnico(String nomeUsuario)
    {
        this();
    }
                                   
    public BilheteUnico (String nomeUsuario, String numero, Double saldo, Boolean estudante, Boolean idoso, Integer anoEmissao)
    {
        this.nomeUsuario = nomeUsuario;
        this.numero = numero;
        this.saldo = saldo;
        this.estudante = estudante;
        this.idoso = idoso;
        this.anoEmissao = anoEmissao;
    }

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

    Double passarBilhete(Boolean integracao) {
        if (integracao || idoso) {
            System.out.println("Subsídio: R$0,00");
            return saldo;
        }

        Double valorPassagem = estudante ? 2.60 : 5.20;
        String mensagem = estudante ? "Estudante" : "Comum";

        if (saldo >= valorPassagem) {
            System.out.printf("%s: %.2f!\n", mensagem, valorPassagem);
            saldo -= valorPassagem;
        } else {
            System.out.println("Saldo insuficiente!");
        }
        return saldo;
    }


    public Double getSaldo() {
        return saldo;
    }
    
    public void setNome(String nomeUsuario)
    {
         this.nomeUsuario = nomeUsuario;
    }
    
    public String getNome(){
        return nomeUsuario;
    }
    
}


