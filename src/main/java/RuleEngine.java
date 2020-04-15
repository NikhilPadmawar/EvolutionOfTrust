import com.sun.tools.javac.util.Pair;

public class RuleEngine {



    public Pair<Integer, Integer> checkInputs(MoveType user1, MoveType user2) {
        if(user1 == MoveType.COOPERATE && user2 == MoveType.COOPERATE){
          return new Pair<Integer, Integer>(GameConstant.BOTHCOOPERATE,GameConstant.BOTHCOOPERATE);
        }
        else if(user1 == MoveType.CHEAT && user2 == MoveType.CHEAT){
            return new Pair<Integer, Integer>(GameConstant.BOTHCHEAT,GameConstant.BOTHCHEAT);
        }
        else if(user1 == MoveType.COOPERATE && user2 == MoveType.CHEAT)
        {
            return new Pair<Integer, Integer>(GameConstant.ONECOOPERATE,GameConstant.ONECHEAT);
        }
        else if(user1 == MoveType.CHEAT && user2 == MoveType.COOPERATE)
        {
            return new Pair<Integer, Integer>(GameConstant.ONECHEAT,GameConstant.ONECOOPERATE);

        }
        else
            return null;
    }
}
