package school.sptech;

public class Cachorro extends Pet{
    private Integer numeroJornais;

    public Cachorro(String nome, String raca, Double peso) {
        super(nome, raca, peso);
        this.numeroJornais = 0;
    }

    @Override
    public void comer(String alimento) {
        System.out.println("Comendo: " + alimento);
        System.out.println("AU AU AU!");
    }

    public void buscarJornal()
    {
        System.out.println("Indo buscar jornal...");
        this.numeroJornais++;
    }

    public Integer getNumeroJornais() {
        return numeroJornais;
    }
}
