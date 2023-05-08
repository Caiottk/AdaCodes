import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int cards = 5;

    public static void main(String[] args) {
        // Inicio do Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os nomes dos participantes: ");
        String str = sc.nextLine();
        String[] jogadores = jogadores(str);
        int numberOfPlayers = jogadores.length;

        printCartela(createCartela(true, numberOfPlayers), jogadores);
        String[][] cartPlayers = createCartela(true, numberOfPlayers), cartMark = criaMarkCartela(cartPlayers[0].length);
        cartMark = marcaCartela(cartPlayers, cartMark, "44");

        for (int i = 0; i < numberOfPlayers; i++) {
            for (int j = 0; j < numberOfPlayers; j++) {
                System.out.printf("%s ", cartMark[i][j]);
            }
            System.out.printf("\n");
        }
        sc.close();
    }

    public static String[] jogadores(String str) {
        String[] players = str.split("-", -2);
        return players;
    }

    public static boolean bingo() {
        return false;
    }

    public static String[][] createCartela(boolean input, int lenP) {
        Scanner sc = new Scanner(System.in);
        String str;
        String inp[] = new String[50];
        String cartela[][] = new String[lenP][cards];
        Random gerador = new Random(19700621);
        int aux = 0, k = 0;
        boolean repete = false;
        if (input) {
            for (int i = 0; i < lenP; i++) {
                for (int j = 0; j < cards; j++) {
                    aux = 1 + gerador.nextInt(61);
                    cartela[i][j] = Integer.toString(aux);
                    String num = cartela[i][j];
                    repete = rep(cartela, num, i, j);
                    if (repete) {
                        j--;
                    }
                }
            }
        } else {
            System.out.println("Insira os números da cartela para cada jogador!");
            str = sc.nextLine();
            inp = str.split("-", -2);
            String copia[];
            int i = 0, len = 0;
            while (len != inp.length) {
                copia = inp[len].split(",", -2);
                for (int j = 0; j < cards; j++) {
                    cartela[i][j] = copia[j];
                }
                len++;
                i++;
            }
        }
        sc.close();
        return cartela;
    }

    public static boolean rep(String car[][], String num, int a, int b) {
        for (int j = 0; j < b; j++) {
            if (car[a][j].equals(num)) {
                return true;
            }
        }
        return false;
    }

    public static void printCartela(String cartela[][], String players[]) {
        int aux = 0, i = 0;
        while (aux != players.length) {
            System.out.printf("[ %s -> ", players[aux]);
            for (int j = 0; j < cards; j++) {
                System.out.printf("%s ", cartela[i][j]);
            }
            System.out.println("]");
            aux++;
            i++;
        }
    }

    public static String[][] criaMarkCartela(int len) {
        String cartMark[][] = new String[cards][cards];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < cards; j++) {
                cartMark[i][j] = "0";
            }
        }
        return cartMark;
    }

    public static String[][] marcaCartela(String cartelas[][], String marcaCar[][], String num) {
        int len = cartelas[0].length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < cards; j++) {
                if (cartelas[i][j].equals(num)) {
                    marcaCar[i][j] = "1";
                }
            }
        }
        return marcaCar;
    }
}