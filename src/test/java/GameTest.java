import com.sun.tools.javac.util.Pair;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GameTest {

    private Player player1;
    private Player player2;
    private Game game;

    @Before
    public void setUp() throws Exception {
        player1 = Mockito.mock(Player.class);
        player2 = Mockito.mock(Player.class);
        game = new Game(player1, player2);
    }

    @Test
    public void shouldReturnTotalScoreWhenPlayerOneCooperatesAndOtherOneIsConsolePlayer() throws IOException {
        int numOfRounds = 2;
        when(player1.makeMove()).thenReturn(MoveType.COOPERATE).thenReturn(MoveType.CHEAT);
        when(player2.makeMove()).thenReturn(MoveType.CHEAT).thenReturn(MoveType.COOPERATE);
        assertEquals(new Pair<Integer, Integer>(2, 2), game.getScore(numOfRounds));
    }
}
