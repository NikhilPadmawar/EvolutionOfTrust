
import com.sun.tools.javac.util.Pair;
import org.junit.Test;
import static org.junit.Assert.*;


public class EvolutionOfTrustTest{

    @Test
    public void user1AndUser2ShouldCooperate(){
        Pair<Integer, Integer> result = new EvolutionOfTrust().checkInputs(UserPreference.COOPERATE,UserPreference.COOPERATE);
        assertEquals(new Pair<Integer, Integer>(2,2),result);
    }

    @Test
    public void user1AndUser2ShouldCheat(){
        Pair<Integer, Integer> result = new EvolutionOfTrust().checkInputs(UserPreference.CHEAT,UserPreference.CHEAT);
        assertEquals(new Pair<Integer, Integer>(0,0),result);
    }
    @Test
    public void user1ShouldCooperateAndUser2ShouldCheat(){
        Pair<Integer, Integer> result = new EvolutionOfTrust().checkInputs(UserPreference.COOPERATE,UserPreference.CHEAT);
        assertEquals(new Pair<Integer, Integer>(3,-1),result);
    }
    @Test
    public void user1ShouldCheatAndUser2ShouldCooperate(){
        Pair<Integer, Integer> result = new EvolutionOfTrust().checkInputs(UserPreference.CHEAT,UserPreference.COOPERATE);
        assertEquals(new Pair<Integer, Integer>(-1,3),result);
    }
}