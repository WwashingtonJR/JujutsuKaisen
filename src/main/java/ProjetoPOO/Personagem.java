package ProjetoPOO;

import ProjetoPOO.Interfaces.Atacar;

public abstract class Personagem implements Atacar {

    private String nome;
    private int idade;
    private int vida;

    public int getVida(){
        return vida;
    }

    public void receberDano(int dano){
        this.vida -= dano;
        if (this.vida <= 0) this.vida = 0;
    }

    public boolean estaVivo(){
        return vida > 0;
    }

    public Personagem(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}