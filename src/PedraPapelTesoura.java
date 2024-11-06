import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {

    public static void main(String[] args) {
        // Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Opções do jogo
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        // Loop para manter o jogo rodando até o jogador sair
        while (true) {
            // Exibe as opções para o jogador
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");
            System.out.println("0 - Sair");

            // Lê a escolha do jogador
            int escolhaJogador = scanner.nextInt();

            // Verifica se o jogador quer sair do jogo
            if (escolhaJogador == 0) {
                System.out.println("Você saiu do jogo!");
                break;
            }

            // Verifica se a entrada é válida
            if (escolhaJogador < 1 || escolhaJogador > 3) {
                System.out.println("Escolha inválida. Tente novamente.");
                continue;
            }

            // Gera uma escolha aleatória para o computador
            Random random = new Random();
            int escolhaComputador = random.nextInt(3) + 1; // Gera número entre 1 e 3

            // Exibe as escolhas do jogador e do computador
            System.out.println("Você escolheu: " + opcoes[escolhaJogador - 1]);
            System.out.println("O computador escolheu: " + opcoes[escolhaComputador - 1]);

            // Determina o resultado
            if (escolhaJogador == escolhaComputador) {
                System.out.println("Empate!");
            } else if ((escolhaJogador == 1 && escolhaComputador == 3) ||
                    (escolhaJogador == 2 && escolhaComputador == 1) ||
                    (escolhaJogador == 3 && escolhaComputador == 2)) {
                System.out.println("Você venceu!");
            } else {
                System.out.println("O computador venceu!");
            }

            System.out.println();  // Linha em branco para separar as rodadas
        }

        // Fecha o scanner
        scanner.close();
    }
}
