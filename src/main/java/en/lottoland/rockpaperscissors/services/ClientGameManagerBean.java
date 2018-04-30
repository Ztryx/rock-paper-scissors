package en.lottoland.rockpaperscissors.services;

import en.lottoland.rockpaperscissors.entities.GameMatch;
import en.lottoland.rockpaperscissors.services.utils.GameRules;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.*;

@ManagedBean(name = "clientGameInstance", eager = true)
@SessionScoped
public class ClientGameManagerBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<GameMatch> tableGame;

    @PostConstruct
    public void initClientGameManagerBean() {
        tableGame = new ArrayList<GameMatch>();
    }

    public void setNewMatch() throws Throwable {
        int[] randomMatch = GameRules.getRandomMatch();
        String matchResult = GameRules.getResult(String.valueOf(randomMatch[0]) + "-" + String.valueOf(randomMatch[1]));
        tableGame.add(new GameMatch(GameRules.getChoice(randomMatch[0]), GameRules.getChoice(randomMatch[1]), matchResult));
    }

    public String getRounds() {
        return tableGame.isEmpty() ? "No se han jugado partidas": String.valueOf(tableGame.size());
    }

    public void reset() {
        tableGame.clear();
    }

    public ArrayList<GameMatch> getList() {
        return tableGame;
    }
}