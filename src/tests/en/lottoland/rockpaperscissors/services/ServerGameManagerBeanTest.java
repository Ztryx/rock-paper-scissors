package en.lottoland.rockpaperscissors.services;

import junit.framework.TestCase;

/**
 * Created by andyx on 30/4/18.
 */
public class ServerGameManagerBeanTest extends TestCase {
    ServerGameManagerBean serverTestBean = new ServerGameManagerBean();

    public void testInitServerGameManagerBean() throws Exception {
        serverTestBean.initServerGameManagerBean();
        assertNotNull(serverTestBean.getRanking());
    }

    public void testAddNewResult() throws Exception, Throwable {
        serverTestBean.initServerGameManagerBean();
        int playerOneWins, playerTwoWins, draws;
        for(int i=0; i<1000; i++) {
            playerOneWins = Integer.valueOf(serverTestBean.getPlayerOneWins());
            playerTwoWins = Integer.valueOf(serverTestBean.getPlayerTwoWins());
            draws = Integer.valueOf(serverTestBean.getDraws());
            serverTestBean.addNewResult("increasePlayerOne");
            serverTestBean.addNewResult("increasePlayerTwo");
            serverTestBean.addNewResult("increaseDraw");
            assertEquals(String.valueOf(playerOneWins + 1), serverTestBean.getPlayerOneWins());
            assertEquals(String.valueOf(playerTwoWins + 1), serverTestBean.getPlayerTwoWins());
            assertEquals(String.valueOf(draws + 1), serverTestBean.getDraws());
        }
    }

    public void testGetRounds() throws Exception, Throwable {
        serverTestBean.initServerGameManagerBean();
        for(int i=0; i<1000; i++) {
            serverTestBean.addNewResult("increasePlayerOne");
            serverTestBean.addNewResult("increasePlayerTwo");
            serverTestBean.addNewResult("increaseDraw");
        }
        assertEquals(String.valueOf(3000), serverTestBean.getRounds());
    }

    public void testGetPlayer1Wins() throws Exception, Throwable {
        serverTestBean.initServerGameManagerBean();
        for(int i=0; i<1000; i++)
            serverTestBean.addNewResult("increasePlayerOne");
        assertEquals(String.valueOf(1000), serverTestBean.getPlayerOneWins());
    }

    public void testGetPlayer2Wins() throws Exception, Throwable {
        serverTestBean.initServerGameManagerBean();
        for(int i=0; i<1000; i++)
            serverTestBean.addNewResult("increasePlayerTwo");
        assertEquals(String.valueOf(1000), serverTestBean.getPlayerTwoWins());
    }

    public void testGetDraws() throws Exception, Throwable {
        serverTestBean.initServerGameManagerBean();
        for(int i=0; i<1000; i++)
            serverTestBean.addNewResult("increaseDraw");
        assertEquals(String.valueOf(1000), serverTestBean.getRounds());
    }

    public void testGetLivePieModel() throws Exception, Throwable {
        serverTestBean.initServerGameManagerBean();
        assertNotNull(serverTestBean.getLivePieModel());
    }

}