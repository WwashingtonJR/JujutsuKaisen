package ProjetoPOO.Personagens;

import ProjetoPOO.Interfaces.Energia;
import ProjetoPOO.Feiticeiro;
import ProjetoPOO.Interfaces.ExpansaoDominio;
import ProjetoPOO.Tecnicas.Tecnica;

public class Megumi extends Feiticeiro implements Energia, ExpansaoDominio {


    public Megumi(String nome, int idade) {
        super(nome, idade);
        setTecnica(new Tecnica("Dez Sombas",40));
    }

    @Override
    public void energiaAmaldicoada() {
        System.out.println("Megumi usou  Técnica das Dez Sombras!");
    }

    @Override
    public void dominio() {
        System.out.println("Expansão de domínio Jardim das Sombras Justapostas!");
    }
}
