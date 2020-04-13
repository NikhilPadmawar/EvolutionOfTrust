import com.sun.tools.javac.util.Pair;
//import

public class EvolutionOfTrust {


    //naming conventions
    public Pair<Integer, Integer> checkInputs(UserPreference user1, UserPreference user2) {
        if(user1 == UserPreference.COOPERATE && user2 == UserPreference.COOPERATE){
          return new Pair<Integer, Integer>(2,2);
        }
        else if(user1 ==UserPreference.CHEAT && user2 == UserPreference.CHEAT){
            return new Pair<Integer, Integer>(0,0);
        }

        else if(user1 == UserPreference.COOPERATE && user2 == UserPreference.CHEAT)
        {
            return new Pair<Integer, Integer>(3,-1);
        }
        else if(user1 == UserPreference.CHEAT && user2 == UserPreference.COOPERATE)
        {
            return new Pair<Integer, Integer>(-1,3);

        }
        else
            return null;
    }
}
