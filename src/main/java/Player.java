
public class Player {
    private PlayerBehaviour playerBehaviour;

    public Player(PlayerBehaviour playerBehaviour) {
        this.playerBehaviour = playerBehaviour;
    }

    public MoveType makeMove(){
        return  playerBehaviour.behaviour();
    }

    //This is only relevant for third type behaviour....how should we restrict for other two behaviours?
    public void updateMoveType(String moveTypeInput){

    }
}
