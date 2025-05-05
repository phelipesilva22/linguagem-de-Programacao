package school.sptech;

public class Carta {
    private SimboloCarta valor;
    private NaipeCarta naipe;

    public Carta(SimboloCarta valor, NaipeCarta naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public SimboloCarta getSimboloCarta() {
        return valor;
    }

    public void setValor(SimboloCarta valor) {
        this.valor = valor;
    }

    public NaipeCarta getNaipe() {
        return naipe;
    }

    public void setNaipe(NaipeCarta naipe) {
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "valor='" + valor + '\'' +
                ", naipe='" + naipe + '\'' +
                '}';
    }
}
