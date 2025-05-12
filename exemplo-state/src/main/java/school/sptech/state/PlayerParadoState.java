package school.sptech.state;

import school.sptech.Player;
import school.sptech.PlayerState;

public class PlayerParadoState  extends PlayerState {
    public PlayerParadoState(Player player) {
        super(player);
    }

    @Override
    public void tocandoAgora() {
        System.out.println("Player parado!");
        Integer musicaAtual = this.getPlayer().getMusicaAtual();
        System.out.println("Tocando agora: "+ getPlayer().getMusicaAtual());
    }

    @Override
    public void tocar() {

    }

    @Override
    public void parar() {
        System.out.println("Player já esta parado@");
    }
}
