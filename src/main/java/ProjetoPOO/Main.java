package ProjetoPOO;


import ProjetoPOO.Personagens.Gojo;
import ProjetoPOO.Personagens.Itadori;
import ProjetoPOO.Personagens.Sukuna;

public class Main {
    static void main(String[] args) {

        Personagem gojo = new Gojo("Gojo", 30);
        Personagem yuji = new Itadori("Itadori", 19);
        Personagem sukuna = new Sukuna("Sukuna", 19);

        gojo.Atacar();
        yuji.atacar();
        sukuna.atacar();



    }
    }

