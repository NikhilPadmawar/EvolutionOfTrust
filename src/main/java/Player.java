import java.io.IOException;

public class Player {
    private PlayerBehaviour playerBehaviour;

    public Player(PlayerBehaviour playerBehaviour) {
        this.playerBehaviour = playerBehaviour;
    }

    public MoveType makeMove() throws IOException {
        return  playerBehaviour.behaviour();
    }
}
