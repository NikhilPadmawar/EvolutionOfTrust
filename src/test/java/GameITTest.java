import com.sun.tools.javac.util.Pair;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GameITTest {

    private CooperatePlayerBehaviour cooperatePlayerBehaviour = new CooperatePlayerBehaviour();
    private CheatPlayerBehaviour cheatPlayerBehaviour = new CheatPlayerBehaviour();
    private CopyCatPlayerBehaviour copyCatPlayerBehaviour = new CopyCatPlayerBehaviour();


    @Test
    public void shouldCheckThatTheBothPlayersAreCool() throws IOException {
        Player coolPerson1 = new Player(cooperatePlayerBehaviour);
        Player coolPerson2 = new Player(cooperatePlayerBehaviour);
        Game game = new Game(coolPerson1,coolPerson2);
        assertEquals(new Pair<Integer, Integer>(GameConstant.BOTHCOOPERATE,GameConstant.BOTHCOOPERATE),game.getScore(1));
    }

    @Test
    public void shouldReturnTotalScoreWhenBothPlayersAreCool() throws IOException {
        int numOfRounds = 5;
        Player coolPerson1 = new Player(cooperatePlayerBehaviour);
        Player coolPerson2 = new Player(cooperatePlayerBehaviour);
        Game game = new Game(coolPerson1,coolPerson2);
        assertEquals(new Pair<Integer,Integer>(10,10),game.getScore(numOfRounds));
        assertEquals(new Pair<Integer,Integer>(10,10),game.getScore(numOfRounds));
    }

    @Test
    public void shouldReturnTotalScoreWhenPlayerOneCooperatesAndOtherOneCheat() throws IOException {
        int numOfRounds = 5;
        Player coolPerson1 = new Player(cooperatePlayerBehaviour);
        Player coolPerson2 = new Player(cheatPlayerBehaviour);
        Game game = new Game(coolPerson1,coolPerson2);
        assertEquals(new Pair<Integer,Integer>(-5,15),game.getScore(numOfRounds));
    }

    @Test
    public void shouldReturnTotalScoreWhenPlayerOneCooperatesAndSecondOneConsole() throws IOException{
        int numOfRounds = 1;
        Player coolPerson1 = new Player(cooperatePlayerBehaviour);
        BufferedReader bufferedReader = new BufferedReader(new StringReader("CO"));
        Player consolePlayer = new Player(new ConsolePlayerBehaviour(bufferedReader));
        Game game = new Game(coolPerson1,consolePlayer);
        assertEquals(new Pair<Integer,Integer>(2,2),game.getScore(numOfRounds));
    }

    @Test
    public void shouldNotifyObserverForOpponentsMove() throws IOException {
        int numOfRounds = 5;
        Player coolPlayer = new Player(cheatPlayerBehaviour);
        Player copyCatPlayer = new Player(copyCatPlayerBehaviour);
        Game game = new Game(coolPlayer,copyCatPlayer);

        game.addObserver(copyCatPlayerBehaviour);

        assertEquals(new Pair<Integer,Integer>(3,-1),game.getScore(numOfRounds));
    }

}