import com.sun.tools.javac.util.Pair;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    private CooperatePlayerBehaviour cooperatePlayerBehaviour = new CooperatePlayerBehaviour();
    private CheatPlayerBehaviour cheatPlayerBehaviour = new CheatPlayerBehaviour();

    @Test
    public void shouldCheckThatTheBothPlayersAreCool(){
        Player coolPerson1 = new Player(cooperatePlayerBehaviour);
        Player coolPerson2 = new Player(cooperatePlayerBehaviour);
        Game game = new Game(coolPerson1,coolPerson2);
        assertEquals(new Pair<Integer, Integer>(GameConstant.BOTHCOOPERATE,GameConstant.BOTHCOOPERATE),game.getScore(1));
    }

    @Test
    public void shouldReturnTotalScoreWhenBothPlayersAreCool() {
        int numOfRounds = 5;
        Player coolPerson1 = new Player(cooperatePlayerBehaviour);
        Player coolPerson2 = new Player(cooperatePlayerBehaviour);
        Game game = new Game(coolPerson1,coolPerson2);
        assertEquals(new Pair<Integer,Integer>(10,10),game.getScore(numOfRounds));
        assertEquals(new Pair<Integer,Integer>(10,10),game.getScore(numOfRounds));
    }

    @Test
    public void shouldReturnTotalScoreWhenPlayerOneCooperatesAndOtherOneCheat() {
        int numOfRounds = 5;
        Player coolPerson1 = new Player(cooperatePlayerBehaviour);
        Player coolPerson2 = new Player(cheatPlayerBehaviour);
        Game game = new Game(coolPerson1,coolPerson2);
        assertEquals(new Pair<Integer,Integer>(-5,15),game.getScore(numOfRounds));
    }
}