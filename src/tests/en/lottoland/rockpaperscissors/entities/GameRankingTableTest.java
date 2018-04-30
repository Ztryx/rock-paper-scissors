package en.lottoland.rockpaperscissors.entities;

import junit.framework.TestCase;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by andyx on 30/4/18.
 */
public class GameRankingTableTest extends TestCase {
    GameRankingTable testGameRankingTable = new GameRankingTable();

    public void testGetPlayerOneWins() throws Exception {
        assertNotNull(testGameRankingTable.getPlayerOneWins());
        assertEquals(new AtomicInteger(0).intValue(), testGameRankingTable.getPlayerOneWins());
    }

    public void testIncreasePlayerOne() throws Exception {
        AtomicInteger playerOneWinsTest = new AtomicInteger(0);
        for(int i=0; i<1000; i++) {
            testGameRankingTable.increasePlayerOne();
            assertNotNull(testGameRankingTable.getPlayerOneWins());
            assertEquals(playerOneWinsTest.incrementAndGet(), testGameRankingTable.getPlayerOneWins());
        }
    }

    public void testGetPlayerTwoWins() throws Exception {
        assertNotNull(testGameRankingTable.getPlayerTwoWins());
        assertEquals(new AtomicInteger(0).intValue(), testGameRankingTable.getPlayerTwoWins());
    }

    public void testIncreasePlayerTwo() throws Exception {
        AtomicInteger playerTwoWinsTest = new AtomicInteger(0);
        for(int i=0; i<1000; i++) {
            testGameRankingTable.increasePlayerTwo();
            assertNotNull(testGameRankingTable.getPlayerTwoWins());
            assertEquals(playerTwoWinsTest.incrementAndGet(), testGameRankingTable.getPlayerTwoWins());
        }
    }

    public void testGetDraws() throws Exception {
        assertNotNull(testGameRankingTable.getDraws());
        assertEquals(new AtomicInteger(0).intValue(), testGameRankingTable.getDraws());
    }

    public void testIncreaseDraw() throws Exception {
        AtomicInteger drawsTest = new AtomicInteger(0);
        for(int i=0; i<1000; i++) {
            testGameRankingTable.increaseDraw();
            assertNotNull(testGameRankingTable.getDraws());
            assertEquals(drawsTest.incrementAndGet(), testGameRankingTable.getDraws());
        }
    }

    public void testGetRounds() throws Exception {
        assertNotNull(testGameRankingTable.getRounds());
        assertEquals(new AtomicInteger(0).intValue(), testGameRankingTable.getRounds());
    }

    public void testIncreaseRounds() throws Exception {
        AtomicInteger roundsTest = new AtomicInteger(0);
        for(int i=0; i<1000; i++) {
            testGameRankingTable.increaseRounds();
            assertNotNull(testGameRankingTable.getRounds());
            assertEquals(roundsTest.incrementAndGet(), testGameRankingTable.getRounds());
        }
    }
}