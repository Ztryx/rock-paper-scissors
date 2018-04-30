package en.lottoland.rockpaperscissors.entities;

/**
 * Created by andyx on 30/4/18.
 */
public class GameMatch {
    private String playerOne;
    private String playerTwo;
    private String result;

    public GameMatch(String playerOne, String playerTwo, String result) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.result = result;
    }

    public String getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(String playerOne) {
        this.playerOne = playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(String playerTwo) {
        this.playerTwo = playerTwo;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
