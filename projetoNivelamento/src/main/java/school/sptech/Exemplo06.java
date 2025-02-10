package school.sptech;

public class Exemplo06 {
    public static void main(String[] args) {
        // --- Declaração da variáveis ---
        String nome = "Phelipe";
        Integer idade = 20;
        Double peso = 74.5;

        String mensagem = String.format("Meu nome é %s, tenho %d anos e %.1fKG", nome, idade, peso);

        System.out.println("Interpolação em Java");
        System.out.println(mensagem);
        System.out.println(String.format("""
                Olá Pessoas,
                Tudo bem?
                Meu nome é %s
                Tenho %d anos
                Quero ser um bom programador!
                """, nome, idade));
    }
}
