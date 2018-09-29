import java.util.*;

public class Main {

    public static void tinkerTailor(List<Integer> playerList, int rhyme) {
        Iterator<Integer> iterator = playerList.iterator();
        while(playerList.size() > 1){
            for(int i = 1; i <= rhyme; i++){
                if(!iterator.hasNext()){
                    iterator = playerList.iterator();
                }
                iterator.next();
                if(i == rhyme){
                    iterator.remove();
                }
            }
        }
        System.out.println(playerList.get(0));
    }

    public static void main(String[] args) {
        System.out.println("How many players are there? ");
        Scanner scanner = new Scanner(System.in);
        int players = scanner.nextInt();
        System.out.println("How long is the rhyme? ");
        int rhyme = scanner.nextInt();
        List<Integer> playerList = new ArrayList<>();
        for (int i = 0; i < players; i++) {
            playerList.add((i + 1));
        }

        tinkerTailor(playerList, rhyme);
    }
}
