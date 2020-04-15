import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void shouldReturnCooperateBehaviour() {
        Player alwaysCooperatePlayer = new Player(new CooperatePlayerBehaviour());
        assertEquals(MoveType.COOPERATE,alwaysCooperatePlayer.makeMove());
    }

    @Test
    public void shouldReturnCheatBehaviour() {
        Player alwaysCheatPlayer = new Player(new CheatPlayerBehaviour());
        assertEquals(MoveType.CHEAT,alwaysCheatPlayer.makeMove());
    }

    @Test
    public void shouldReturnConsoleBehaviour() {
        Player consolePlayer = new Player(new ConsolePlayerBehaviour());
        assertEquals(MoveType.CHEAT,consolePlayer.makeMove());
    }

}