package ProjetoPOO.Personagens;

import ProjetoPOO.Interfaces.Energia;
import ProjetoPOO.Feiticeiro;
import ProjetoPOO.Interfaces.ExpansaoDominio;

public class Sukuna extends Feiticeiro implements Energia, ExpansaoDominio {


    public Sukuna(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void energiaAmaldicoada() {
        System.out.println("Sukuna usou Mizushi!");
    }

    @Override
    public void dominio() {
        System.out.println("Expansão de domínio Santuário Malévolo!");
    }
}
