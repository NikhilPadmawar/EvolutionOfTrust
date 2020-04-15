import org.junit.Test;

import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void shouldReturnCooperateBehaviour() throws IOException {
        Player alwaysCooperatePlayer = new Player(new CooperatePlayerBehaviour());
        assertEquals(MoveType.COOPERATE,alwaysCooperatePlayer.makeMove());
    }

    @Test
    public void shouldReturnCheatBehaviour() throws IOException {
        Player alwaysCheatPlayer = new Player(new CheatPlayerBehaviour());
        assertEquals(MoveType.CHEAT,alwaysCheatPlayer.makeMove());
    }
}