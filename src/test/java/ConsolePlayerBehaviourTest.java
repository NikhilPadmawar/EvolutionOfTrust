import org.junit.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class ConsolePlayerBehaviourTest {
    @Test
    public void shouldReturnMoveTypeCooperateWhenInputIsCO() throws IOException {

        BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
        when(bufferedReader.readLine()).thenReturn("CO");

        ConsolePlayerBehaviour consolePlayerBehaviour = new ConsolePlayerBehaviour(bufferedReader);
        MoveType cooperatePlayerBehaviour = consolePlayerBehaviour.behaviour();

        assertEquals(MoveType.COOPERATE,cooperatePlayerBehaviour);
    }
}