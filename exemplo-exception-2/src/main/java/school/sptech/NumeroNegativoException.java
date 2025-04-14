package school.sptech;
/*
* unchecked-exception: Pode escolher se quer tratar a exceção -> RunTimeException
* checked-exception: Tem que tratar a exceção -> Exception*/


public class NumeroNegativoException extends RuntimeException{
    public NumeroNegativoException()
    {
        super("Número não pode ser negativo");
    }

    public NumeroNegativoException(String mensagem)
    {
        super(mensagem);
    }

}
