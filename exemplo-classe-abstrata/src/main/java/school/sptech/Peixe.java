package school.sptech;

public class Peixe extends Pet{
    private Boolean marinho;

    public Peixe(String nome, String raca, Double peso, Boolean marinho) {
        super(nome, raca, peso);
        this.marinho = marinho;
    }

    public Boolean getMarinho() {
        return marinho;
    }

    public void setMarinho(Boolean marinho) {
        this.marinho = marinho;
    }

    @Override
    public void comer(String alimento) {
        System.out.println("Comendo: " + alimento);
        System.out.println("Glub Glub");
    }
}
