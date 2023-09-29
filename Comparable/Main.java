import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        List<TransferMarket.FootballPlayers> players = new ArrayList<>();
        TransferMarket tm = new TransferMarket();


        players.add(tm.new Forwards(10, "Benzema", "Real Madrid", 5));
        players.add(tm.new Defenders(5, "Varan", "PSG", 8));


        //System.out.println("Игроки до сортировки:");
        for (TransferMarket.FootballPlayers player : players) {
            System.out.println(player);


        }
        for (TransferMarket.FootballPlayers player : players){
            System.out.println("КПД игрока: " + player.getName() + " " + player.getGameStat());
        }

        Collections.sort(players);

        System.out.println("------------------");
        for (TransferMarket.FootballPlayers player: players) {
            System.out.println("КПД игрока " + player.getName() + " " + player.getGameStat());
        }
    }
}