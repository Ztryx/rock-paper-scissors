package en.lottoland.rockpaperscissors.entities;

import junit.framework.TestCase;

/**
 * Created by andyx on 30/4/18.
 */
public class GameMatchTest extends TestCase {
    private final GameMatch testGameMatchGetters = new GameMatch("Rock", "Paper", "Draw");
    private final GameMatch testGameMatchSetters = new GameMatch("Rock", "Paper", "Draw");

    public void testGetPlayerOne() throws Exception {
        assertNotNull(testGameMatchGetters.getPlayerOne());
        assertEquals("Rock", testGameMatchGetters.getPlayerOne());
    }
    public void testSetPlayerOne() throws Exception {
        testGameMatchSetters.setPlayerOne("Paper");
        assertNotNull(testGameMatchGetters.getPlayerOne());
        assertEquals("Paper", testGameMatchSetters.getPlayerOne());
    }

    public void testGetPlayerTwo() throws Exception {
        assertNotNull(testGameMatchGetters.getPlayerTwo());
        assertEquals("Paper", testGameMatchGetters.getPlayerTwo());
    }

    public void testSetPlayerTwo() throws Exception {
        testGameMatchSetters.setPlayerTwo("Rock");
        assertNotNull(testGameMatchGetters.getPlayerTwo());
        assertEquals("Rock", testGameMatchSetters.getPlayerTwo());
    }

    public void testGetResult() throws Exception {
        assertNotNull(testGameMatchGetters.getResult());
        assertEquals("Draw", testGameMatchGetters.getResult());
    }

    public void testSetResult() throws Exception {
        testGameMatchSetters.setResult("PlayerOne");
        assertNotNull(testGameMatchGetters.getResult());
        assertEquals("PlayerOne", testGameMatchSetters.getResult());
    }
}