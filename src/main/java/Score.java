public class Score {

    private int playerOne = 0;
    private int playerTwo = 0;

    public Score(int playerOne, int playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }


    public int getScoreForPlayerOne() {
        return playerOne;
    }

    public int getScoreForPlayerTwo() {
        return playerTwo;
    }

    public void updateScore(int playerOneScore, int playerTwoScore) {
        this.playerOne = this.playerOne + playerOneScore;
        this.playerTwo = this.playerTwo +  playerTwoScore;
    }
}
