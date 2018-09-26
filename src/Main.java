import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void tinkerTailor(List<Integer> numberList, int k) {
        for (int i = 0; i < numberList.size(); i++) {

        }
    }

    public static void main(String[] args) {
        System.out.println("How many players are there? ");
        Scanner scanner = new Scanner(System.in);
        int players = scanner.nextInt();
        System.out.println("How long is the rhyme? ");
        int rhyme = scanner.nextInt();
        List<Integer> playerList = new ArrayList<>();
        for (int i = 0; i < players; i++) {
            playerList.add((i+1));
        }
        tinkerTailor(playerList, rhyme);
    }
}
