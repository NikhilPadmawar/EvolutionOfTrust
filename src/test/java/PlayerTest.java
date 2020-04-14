import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void shouldReturnCooperate() {
        assertEquals(MoveType.COOPERATE,new Player(MoveType.COOPERATE).makeMove());
    }

}