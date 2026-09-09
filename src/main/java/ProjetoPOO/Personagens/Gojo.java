package ProjetoPOO.Personagens;

import ProjetoPOO.Interfaces.Atacar;
import ProjetoPOO.Interfaces.Energia;
import ProjetoPOO.Feiticeiro;
import ProjetoPOO.Interfaces.ExpansaoDominio;

public class Gojo extends Feiticeiro implements Energia, ExpansaoDominio {

    public Gojo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void energiaAmaldicoada() {
        System.out.println("Gojo usou Mukagen!");
    }

    @Override
    public void dominio() {
        System.out.println("Expansão de domínio Vazio Ilimitado!");
    }

}
