package ProjetoPOO.Personagens;

import ProjetoPOO.Interfaces.Atacar;
import ProjetoPOO.Interfaces.Energia;
import ProjetoPOO.Feiticeiro;
import ProjetoPOO.Interfaces.ExpansaoDominio;
import ProjetoPOO.Tecnicas.Tecnica;

public class Gojo extends Feiticeiro implements Energia, ExpansaoDominio {

    public Gojo(String nome, int idade) {
        super(nome, idade);
        setTecnica(new Tecnica("Mukagen", 40));
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
