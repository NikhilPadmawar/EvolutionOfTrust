
import com.sun.tools.javac.util.Pair;
import org.junit.Test;
import static org.junit.Assert.*;


public class RuleEngineTest {


    @Test
    public void user1AndUser2ShouldCooperate(){
        Pair<Integer, Integer> result = new RuleEngine().checkInputs(MoveType.COOPERATE, MoveType.COOPERATE);
        assertEquals(new Pair<Integer, Integer>(GameConstant.BOTHCOOPERATE,GameConstant.BOTHCOOPERATE),result);
    }

    @Test
    public void user1AndUser2ShouldCheat(){
        Pair<Integer, Integer> result = new RuleEngine().checkInputs(MoveType.CHEAT, MoveType.CHEAT);
        assertEquals(new Pair<Integer, Integer>(GameConstant.BOTHCHEAT,GameConstant.BOTHCHEAT),result);
    }
    @Test
    public void user1ShouldCooperateAndUser2ShouldCheat(){
        Pair<Integer, Integer> result = new RuleEngine().checkInputs(MoveType.COOPERATE, MoveType.CHEAT);
        assertEquals(new Pair<Integer, Integer>(GameConstant.ONECOOPERATE,GameConstant.ONECHEAT),result);
    }
    @Test
    public void user1ShouldCheatAndUser2ShouldCooperate(){
        Pair<Integer, Integer> result = new RuleEngine().checkInputs(MoveType.CHEAT, MoveType.COOPERATE);
        assertEquals(new Pair<Integer, Integer>(GameConstant.ONECHEAT,GameConstant.ONECOOPERATE),result);
    }

}