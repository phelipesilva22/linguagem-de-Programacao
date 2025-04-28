package school.sptech;

public class Gato extends Pet{
    private Integer vidas;

    public Gato(String nome, String raca, Double peso) {
        super(nome, raca, peso);
        this.vidas = 7;
    }


    @Override
    public void comer(String alimento) {
        System.out.println("Comendo: " + alimento);
        System.out.println("MIAU!!!");
    }

    public Integer getVidas() {
        return vidas;
    }
}
