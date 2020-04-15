import com.sun.tools.javac.util.Pair;

import java.io.IOException;

public class Game {
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
        for(int i=0;i<numOfRounds;i++){
            setPlayerLatestScore(ruleEngine.checkInputs(player1.makeMove(),player2.makeMove()));
        }
        return new Pair<Integer, Integer>(this.score.getScoreForPlayerOne(),this.score.getScoreForPlayerTwo());
    }

    private void setPlayerLatestScore(Pair<Integer,Integer> score)
    {
        this.score.updateScore(score.fst,score.snd);
    }
}

