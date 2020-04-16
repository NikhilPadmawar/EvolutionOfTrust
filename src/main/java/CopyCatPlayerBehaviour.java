import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

public class CopyCatPlayerBehaviour implements PlayerBehaviour, Observer {

    private MoveType nextMoveType = MoveType.COOPERATE;

    @Override
    public MoveType behaviour() throws IOException {
        return nextMoveType;
    }

    @Override
    public void update(Observable observable, Object moveType) {
        this.nextMoveType = (MoveType) moveType;
    }
}
