import org.junit.Test;

import static org.junit.Assert.*;

public class ScoreTest {

    @Test
    public void shouldSetScore() {
        Score score = new Score(2,2);
        score.updateScore(GameConstant.BOTHCOOPERATE,GameConstant.BOTHCOOPERATE);
        assertEquals(4,score.getScoreForPlayerOne());
        assertEquals(4,score.getScoreForPlayerTwo());
    }



}