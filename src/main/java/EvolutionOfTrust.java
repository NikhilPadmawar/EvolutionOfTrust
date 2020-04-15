import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvolutionOfTrust {

    public static void main(String[] args) throws IOException {
        RuleEngine ruleEngine = new RuleEngine();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Player firstPlayer = new Player(new ConsolePlayerBehaviour(bufferedReader));
        Player secondPlayer = new Player(new ConsolePlayerBehaviour(bufferedReader));

        Game game = new Game(firstPlayer,secondPlayer);
        System.out.println("Number of rounds?");
        int rounds =  Integer.parseInt(bufferedReader.readLine());
        game.getScore(rounds);
    }
}
