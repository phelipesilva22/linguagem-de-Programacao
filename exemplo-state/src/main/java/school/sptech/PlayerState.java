package school.sptech;

public abstract class PlayerState {
    private Player player;

    public PlayerState(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public abstract void tocandoAgora();
    public abstract void tocar();
    public abstract void parar();

}
