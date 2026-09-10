package ProjetoPOO.Personagens;

import ProjetoPOO.Interfaces.Energia;
import ProjetoPOO.Feiticeiro;
import ProjetoPOO.Interfaces.ExpansaoDominio;
import ProjetoPOO.Tecnicas.Tecnica;

public class Itadori extends Feiticeiro implements Energia, ExpansaoDominio {


    public Itadori(String nome, int idade) {
        super(nome, idade);
        setTecnica(new Tecnica("Punho Divergente", 40));
    }

    @Override
    public void energiaAmaldicoada() {
        System.out.println("Yuji Itadori usou Punho Divergente!");
    }

    @Override
    public void dominio() {

    }
}
