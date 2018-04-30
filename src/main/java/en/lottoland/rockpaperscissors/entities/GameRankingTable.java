package en.lottoland.rockpaperscissors.entities;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by andyx on 30/4/18.
 */
public class GameRankingTable {
    private AtomicInteger playerOneWins;
    private AtomicInteger playerTwoWins;
    private AtomicInteger draws;
    private AtomicInteger rounds;

    public GameRankingTable() {
        this.playerOneWins = new AtomicInteger(0);
        this.playerTwoWins = new AtomicInteger(0);
        this.draws = new AtomicInteger(0);
        this.rounds = new AtomicInteger(0);
    }

    public int getPlayerOneWins() {
        return playerOneWins.intValue();
    }

    public void increasePlayerOne() {
        this.playerOneWins.incrementAndGet();
    }

    public int getPlayerTwoWins() {
        return playerTwoWins.intValue();
    }

    public void increasePlayerTwo() {
        this.playerTwoWins.incrementAndGet();
    }

    public int getDraws() {
        return draws.intValue();
    }

    public void increaseDraw() {
        this.draws.incrementAndGet();
    }

    public int getRounds() {
        return rounds.intValue();
    }

    public void increaseRounds() {
        this.rounds.incrementAndGet();
    }
}
