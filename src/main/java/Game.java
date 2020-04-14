import com.sun.tools.javac.util.Pair;

public class Game {
    private Player player1,player2;
    private RuleEngine ruleEngine;

    Game(Player player1,Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.ruleEngine = new RuleEngine();
    }

    public Pair<Integer,Integer> getScore(){
        return ruleEngine.checkInputs(player1.makeMove(),player2.makeMove());
    }
}
