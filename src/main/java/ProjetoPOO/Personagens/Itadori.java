package ProjetoPOO.Personagens;

import ProjetoPOO.Energia;
import ProjetoPOO.Feiticeiro;

public class Itadori extends Feiticeiro implements Energia {


    @Override
    public void energiaAmaldicoada() {
        System.out.println("Yuji Itadori usou Punho Divergente!");
    }
}
