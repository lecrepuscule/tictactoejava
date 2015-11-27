import java.util.*;
import com.igrecs.tictactoemodels.Player;

public class GameController {
  private List<Player> players = new ArrayList<Player>();

  public void initGame(){
    players.add(new Player('O'));
    players.add(new Player('X'));

    System.out.println(players);

    System.out.println("player1 is: " + players.get(0).getPlayerMarker());
    System.out.println("player2 is: " + players.get(1).getPlayerMarker());

  }

  public static void main(String[] args){
    GameController game = new GameController();
    game.initGame();
  }
}