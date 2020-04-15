import org.junit.Test;

import static org.junit.Assert.*;


public class MoveTypeTest {

    @Test
    public void shouldReturnCooperateWhenInputIsCO() {
        MoveType result = MoveType.valueFor("CO");
        assertEquals(MoveType.COOPERATE,result);
    }

    @Test
    public void shouldReturnCheatWhenInputIsCH() {
        MoveType result = MoveType.valueFor("CH");
        assertEquals(MoveType.CHEAT, result);
    }

    @Test
    public void shouldReturnNullWhenInputIsDifferent() {
        MoveType result = MoveType.valueFor("CHE");
        assertEquals(null, result);
    }
}