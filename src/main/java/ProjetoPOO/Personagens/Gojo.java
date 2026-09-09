package ProjetoPOO.Personagens;

import ProjetoPOO.Interfaces.Energia;
import ProjetoPOO.Feiticeiro;
import ProjetoPOO.Interfaces.ExpansaoDominio;

public class Gojo extends Feiticeiro implements Energia, ExpansaoDominio {


    @Override
    public void energiaAmaldicoada() {
        System.out.println("Gojo usou Mukagen!");
    }

    @Override
    public void dominio() {
        System.out.println("Expansão de domínio Vazio Ilimitado!");
    }
}
