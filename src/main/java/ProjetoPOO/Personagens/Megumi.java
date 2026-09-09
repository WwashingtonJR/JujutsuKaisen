package ProjetoPOO.Personagens;

import ProjetoPOO.Energia;
import ProjetoPOO.Feiticeiro;

public class Megumi extends Feiticeiro implements Energia {


    @Override
    public void energiaAmaldicoada() {
        System.out.println("Megumi usou  Técnica das Dez Sombras!");
    }
}
