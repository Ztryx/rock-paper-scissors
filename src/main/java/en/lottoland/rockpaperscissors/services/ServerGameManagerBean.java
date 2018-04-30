package en.lottoland.rockpaperscissors.services;

/**
 * Created by andyx on 30/4/18.
 */

import en.lottoland.rockpaperscissors.entities.GameRankingTable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.lang.reflect.Method;

/**
 * Created by andyx on 27/4/18.
 */
@ManagedBean(name = "serverGameInstance", eager = true)
@ApplicationScoped
public class ServerGameManagerBean implements Serializable {
    private static final long serialVersionUID = 2L;
    private GameRankingTable ranking;

    @PostConstruct
    public void initServerGameManagerBean() {
        ranking = new GameRankingTable();
    }

    public void addNewResult(String methodToExecute) throws Throwable {
        Method method = ranking.getClass().getDeclaredMethod(methodToExecute);
        method.invoke(ranking);
        ranking.increaseRounds();
    }

    public String getRounds() {
        return String.valueOf(ranking.getRounds());
    }

    public String getPlayerOneWins() {
        return String.valueOf(ranking.getPlayerOneWins());
    }

    public String getPlayerTwoWins() {
        return String.valueOf(ranking.getPlayerTwoWins());
    }

    public String getDraws() {
        return String.valueOf(ranking.getDraws());
    }

    public GameRankingTable getRanking() {
        return ranking;
    }
}