package en.lottoland.rockpaperscissors.services.utils;

import junit.framework.TestCase;

/**
 * Created by andyx on 30/4/18.
 */
public class GameRulesTest extends TestCase {
    public void testGetChoice() throws Exception {
        assertEquals("Rock", GameRules.getChoice(0));
        assertEquals("Paper", GameRules.getChoice(1));
        assertEquals("Scissors", GameRules.getChoice(2));
    }

    public void testGetResult() throws Exception {
        assertEquals("Draw", GameRules.getResult("0-0"));
        assertEquals("PlayerTwo", GameRules.getResult("0-1"));
        assertEquals("PlayerOne", GameRules.getResult("0-2"));
        assertEquals("PlayerOne", GameRules.getResult("1-0"));
        assertEquals("Draw", GameRules.getResult("1-1"));
        assertEquals("PlayerTwo", GameRules.getResult("1-2"));
        assertEquals("PlayerTwo", GameRules.getResult("2-0"));
        assertEquals("PlayerOne", GameRules.getResult("2-1"));
        assertEquals("Draw", GameRules.getResult("2-2"));
    }

    public void testGetRandomMatch() throws Exception {
        int[] playersChoices = new int[2];
        for(int i=0; i<1000; i++) {
            playersChoices = GameRules.getRandomMatch();
            assertNotNull(playersChoices);
            for(int j=0; j<2; j++) {
                assertNotNull(playersChoices[j]);
                assertTrue(playersChoices[j] >=0 && playersChoices[j] <= GameRules.getSizeChoices());
            }
        }
    }

    public void testGetRandomPlayer2() throws Exception{
        int randomNumber = 0;
        for(int i=0; i<1000; i++) {
            randomNumber = GameRules.getRandomPlayer2Choice();
            assertNotNull(randomNumber);
            assertTrue(randomNumber >= 0 && randomNumber <= GameRules.getSizeChoices());
        }
    }
}