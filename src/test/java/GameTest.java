import com.sun.tools.javac.util.Pair;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {


    @Test
    public void shouldCheckThatTheBothPlayersAreCool(){
        Player coolPerson1 = new Player();
        Player coolPerson2 = new Player();
        Game game = new Game(coolPerson1,coolPerson2);
        assertEquals(new Pair<Integer, Integer>(GameConstant.BOTHCOOPERATE,GameConstant.BOTHCOOPERATE),game.getScore());
    }
}