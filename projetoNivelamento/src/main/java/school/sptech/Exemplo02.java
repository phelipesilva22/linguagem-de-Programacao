package school.sptech;
import java.util.Scanner;
public class Exemplo02 {
    public static void main(String[] args) {
        Integer idade;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        if (idade < 16)
            System.out.println("Não pode votar!");
        else if (idade < 18)
            System.out.println("Pode votar, mas não é obrigatório");
        else
            System.out.println("Já pode votar!");

        String mensagem = idade > 16 ? "Pode votar" : "Ainda não pode votar";
        System.out.println(mensagem);

    }
}
