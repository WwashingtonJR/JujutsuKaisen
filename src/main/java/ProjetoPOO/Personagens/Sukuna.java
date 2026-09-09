package ProjetoPOO.Personagens;

import ProjetoPOO.Interfaces.Energia;
import ProjetoPOO.Feiticeiro;
import ProjetoPOO.Interfaces.ExpansaoDominio;
import ProjetoPOO.Maldicao;

public class Sukuna extends Maldicao implements Energia, ExpansaoDominio {


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
