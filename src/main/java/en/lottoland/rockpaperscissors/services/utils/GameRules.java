package en.lottoland.rockpaperscissors.services.utils;

import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.Random;

/**
 * Created by andyx on 30/4/18.
 */
public final class GameRules {
    private final static int sizeChoices = 3;

    private static final Map<Integer, String> choices = ImmutableMap.<Integer, String>builder()
            .put(0, "Rock")
            .put(1, "Paper")
            .put(2, "Scissors")
            .build();

    private static final Map<String, String> results = ImmutableMap.<String, String>builder()
            .put("0-0", "Draw")
            .put("0-1", "PlayerTwo")
            .put("0-2", "PlayerOne")
            .put("1-0", "PlayerOne")
            .put("1-1", "Draw")
            .put("1-2", "PlayerTwo")
            .put("2-0", "PlayerTwo")
            .put("2-1", "PlayerOne")
            .put("2-2", "Draw")
            .build();

    public static String getChoice(Integer choice) {
        return choices.get(choice);
    }

    public static String getResult(String input) {
        return results.get(input);
    }

    public static int getRandomPlayer2Choice() {
        Random rnd = new Random();
        rnd.setSeed(System.currentTimeMillis());
        return rnd.nextInt(3);
    }

    public static int[] getRandomMatch() {
        Random rnd = new Random();
        int positionPlayer2 = 0;
        int[] duel = new int[2];
        rnd.setSeed(System.currentTimeMillis());

        positionPlayer2 = rnd.nextInt(2) + 1;
        switch (positionPlayer2) {
            case(1):
                //Player2 first
                duel[0] = getRandomPlayer2Choice();
                duel[1] = 0; //Rock
                break;
            case(2):
                //Player2 second
                duel[0] = 0; //Rock
                duel[1] = getRandomPlayer2Choice();
                break;
            default:
                break;
        }
        return duel;
    }

    public static int getSizeChoices() {
        return sizeChoices;
    }
}
