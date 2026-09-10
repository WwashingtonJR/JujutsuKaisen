package ProjetoPOO;


import ProjetoPOO.Personagens.Gojo;
import ProjetoPOO.Personagens.Itadori;
import ProjetoPOO.Personagens.Sukuna;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Personagem> personagens = new ArrayList<>();
        personagens.add(new Gojo("Gojo", 30));
        personagens.add(new Itadori("Itadori", 19));
        personagens.add(new Sukuna("Sukuna", 19));


        // fazendo o SCANNER/MENU = Precisei de ajuda para concluir essa fase do projeto!

        int opcao;

        do {
            System.out.println("\n===== MENU JUJUTSU KAISEN =====");
            System.out.println("1 - Listar personagens");
            System.out.println("2 - Atacar (usar técnica)");
            System.out.println("3 - Iniciar batalha");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();


        switch (opcao){
            case 1:
                listarPersonagens(personagens);
                break;

            case 2:
                escolherEAtacar(scanner, personagens);
                break;

            case 3:
                iniciarBatalha(scanner, personagens);
                break;


            case 0:
                System.out.println("Encerrando...");
                break;

            default:
                System.out.println("Opção inválida!");
        }

        }while (opcao != 0);

        scanner.close();

    }

    static void listarPersonagens(List<Personagem> personagens) {
        for (int i = 0; i < personagens.size(); i++) {
            Personagem p = personagens.get(i);
            System.out.println(i + " - " + p.getNome() + " (vida: " + p.getVida() + ")");
        }
    }

    static void escolherEAtacar(Scanner scanner, List<Personagem> personagens) {
        listarPersonagens(personagens);
        System.out.print("Escolha o índice de quem vai atacar: ");
        int idx = scanner.nextInt();
        personagens.get(idx).atacar();
    }

    static void iniciarBatalha(Scanner scanner, List<Personagem> personagens) {
        listarPersonagens(personagens);
        System.out.print("Índice do lutador 1: ");
        int i1 = scanner.nextInt();
        System.out.print("Índice do lutador 2: ");
        int i2 = scanner.nextInt();

        Personagem p1 = personagens.get(i1);
        Personagem p2 = personagens.get(i2);

        while (p1.estaVivo() && p2.estaVivo()) {
            p1.atacar();
            p2.receberDano(20);
            System.out.println(p2.getNome() + " ficou com " + p2.getVida() + " de vida.");
            if (!p2.estaVivo()) break;

            p2.atacar();
            p1.receberDano(20);
            System.out.println(p1.getNome() + " ficou com " + p1.getVida() + " de vida.");
        }

        Personagem vencedor = p1.estaVivo() ? p1 : p2;
        System.out.println("🏆 " + vencedor.getNome() + " venceu a batalha!");
    }
}

