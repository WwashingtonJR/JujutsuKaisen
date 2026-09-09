package ProjetoPOO.Personagens;

import ProjetoPOO.Interfaces.Energia;
import ProjetoPOO.Feiticeiro;
import ProjetoPOO.Interfaces.ExpansaoDominio;

public class Itadori extends Feiticeiro implements Energia, ExpansaoDominio {


    @Override
    public void energiaAmaldicoada() {
        System.out.println("Yuji Itadori usou Punho Divergente!");
    }

    @Override
    public void dominio() {

    }
}
