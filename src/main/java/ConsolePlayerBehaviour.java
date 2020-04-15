import java.io.BufferedReader;
import java.io.IOException;

public class ConsolePlayerBehaviour implements PlayerBehaviour {
    BufferedReader bufferedReader;
    public ConsolePlayerBehaviour(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    @Override
    public MoveType behaviour() throws IOException {
        return  MoveType.valueFor(this.bufferedReader.readLine());
    }
}
