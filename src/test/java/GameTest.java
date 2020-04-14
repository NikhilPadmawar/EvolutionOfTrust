import com.sun.tools.javac.util.Pair;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {


    @Test
    public void shouldCheckThatTheBothPlayersAreCool(){
        Player coolPerson1 = new Player(MoveType.COOPERATE);
        Player coolPerson2 = new Player(MoveType.COOPERATE);
        Game game = new Game(coolPerson1,coolPerson2);
        assertEquals(new Pair<Integer, Integer>(GameConstant.BOTHCOOPERATE,GameConstant.BOTHCOOPERATE),game.getScore(1));
    }

    @Test
    public void shouldCheckTotalScoreWhenBothPlayersAreCool() {
        int numOfRounds = 5;
        Player coolPerson1 = new Player(MoveType.COOPERATE);
        Player coolPerson2 = new Player(MoveType.COOPERATE);
        Game game = new Game(coolPerson1,coolPerson2);
        assertEquals(new Pair<Integer,Integer>(10,10),game.getScore(numOfRounds));
        assertEquals(new Pair<Integer,Integer>(10,10),game.getScore(numOfRounds));
    }

    @Test
    public void shouldCheckTotalScoreWhenPlayerOneCooperatesAndOtherOneCheat() {
        int numOfRounds = 5;
        Player coolPerson1 = new Player(MoveType.COOPERATE);
        Player coolPerson2 = new Player(MoveType.CHEAT);
        Game game = new Game(coolPerson1,coolPerson2);
        assertEquals(new Pair<Integer,Integer>(-5,15),game.getScore(numOfRounds));
    }
}