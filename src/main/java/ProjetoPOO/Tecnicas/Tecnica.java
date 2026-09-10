package ProjetoPOO.Tecnicas;

public class Tecnica {
    private String nome;
    private int dano;


    public Tecnica(String nome, int dano){

        this.setNome(nome);
        this.setDano(dano);

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
}
