package ProjetoPOO;

public class Maldicao extends Personagem{

    public Maldicao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " atacou!");
    }
}
