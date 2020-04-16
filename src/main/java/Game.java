import com.sun.tools.javac.util.Pair;

import java.io.IOException;
import java.util.Observable;

public class Game extends Observable {
    private Player player1,player2;
    private RuleEngine ruleEngine;
    private Score score;


    Game(Player player1,Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.ruleEngine = new RuleEngine();

    }

    public Pair<Integer,Integer> getScore(int numOfRounds) throws IOException {
        this.score = new Score(0,0);
        System.out.println("Rounds\tPlayer1\tPLayer2");
        for(int i=1;i<=numOfRounds;i++){
            MoveType playerOneMoveType = player1.makeMove();
            setPlayerLatestScore(ruleEngine.checkInputs(playerOneMoveType,player2.makeMove()),i);
            setChanged();
            notifyObservers(playerOneMoveType);
        }
        return new Pair<Integer, Integer>(this.score.getScoreForPlayerOne(),this.score.getScoreForPlayerTwo());
    }

    private void setPlayerLatestScore(Pair<Integer,Integer> score, int round)
    {
        this.score.updateScore(score.fst,score.snd);
        System.out.println(+round + "\t\t"+ score.fst + "\t\t" + score.snd);
    }
}

