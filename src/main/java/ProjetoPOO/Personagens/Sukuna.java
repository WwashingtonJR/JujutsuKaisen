package ProjetoPOO.Personagens;

import ProjetoPOO.Energia;
import ProjetoPOO.Feiticeiro;

public class Sukuna extends Feiticeiro implements Energia {
    @Override
    public void energiaAmaldicoada() {
        System.out.println("Sukuna usou Mizushi!");
    }
}
