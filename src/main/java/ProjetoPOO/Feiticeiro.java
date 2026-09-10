package ProjetoPOO;

import ProjetoPOO.Interfaces.Atacar;
import ProjetoPOO.Tecnicas.Tecnica;

public  class Feiticeiro extends Personagem implements Atacar{

    private Tecnica tecnica;

    public Feiticeiro(String nome, int idade){
        super(nome,idade);
    }

    public Tecnica getTecnica(){
        return tecnica;
    }

    public void setTecnica(Tecnica tecnica){
        this.tecnica = tecnica;
    }

    @Override
    public void atacar() {
       if (tecnica != null){
           System.out.println(getNome() + " atacou com " + tecnica.getNome() + " causando " + tecnica.getDano());
       }else {
           System.out.println(getNome() + " está atacando!");
       }
    }
}
