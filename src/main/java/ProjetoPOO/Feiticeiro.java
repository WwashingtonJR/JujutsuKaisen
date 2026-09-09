package ProjetoPOO;

import ProjetoPOO.Interfaces.Atacar;

public  class Feiticeiro extends Personagem implements Atacar{

    public Feiticeiro(String nome, int idade){
        super(nome,idade);
    }


    @Override
    public void atacar() {
        System.out.println(getNome() + " está atacando!");
    }
}
