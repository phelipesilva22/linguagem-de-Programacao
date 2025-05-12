package school.sptech.state;

import school.sptech.Player;
import school.sptech.PlayerState;

public class PlayerTocandoState extends PlayerState {
    public PlayerTocandoState(Player player) {
        super(player);
    }

    @Override
    public void tocandoAgora() {
        Integer musicaAtual = this.getPlayer().getMusicaAtual();
        System.out.println("Tocando agora: "+ musicaAtual);
    }

    @Override
    public void tocar() {
        System.out.println("Já esta tocando");
    }

    @Override
    public void parar() {

    }


}
