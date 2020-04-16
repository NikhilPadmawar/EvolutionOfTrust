import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class CopyCatPlayerBehaviourTest {
    @Test
    public void alwaysReturnCooperateForFirstRound() throws IOException {
        CopyCatPlayerBehaviour copyCatBehaviour =  new CopyCatPlayerBehaviour();

        assertEquals(MoveType.COOPERATE,copyCatBehaviour.behaviour());
    }

    @Test
    public void shouldAlwaysReturnOpponentsMoveAfterTheFirstRound() throws IOException {
        CopyCatPlayerBehaviour copyCatBehaviour = new CopyCatPlayerBehaviour();
        copyCatBehaviour.behaviour();

        copyCatBehaviour.update(null,MoveType.CHEAT);

        assertEquals(MoveType.CHEAT,copyCatBehaviour.behaviour());
    }
}
