package en.lottoland.rockpaperscissors.services;

import en.lottoland.rockpaperscissors.entities.GameRankingTable;
import org.primefaces.model.chart.PieChartModel;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
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
    private PieChartModel livePieModel;

    @PostConstruct
    public void initServerGameManagerBean() {
        ranking = new GameRankingTable();
        livePieModel = new PieChartModel();
    }

    public void addNewResult(String methodToExecute) throws Throwable {
        //Reflection in order to call the right method
        Method method = ranking.getClass().getDeclaredMethod(methodToExecute);
        method.invoke(ranking);
        ranking.increaseRounds();
    }

    public String getRounds() {
        return String.valueOf(ranking.getRounds());
    }

    public String getPlayerTwoWins() {
        return String.valueOf(ranking.getPlayerTwoWins());
    }

    public String getPlayerOneWins() {
        return String.valueOf(ranking.getPlayerOneWins());
    }

    public String getDraws() {
        return String.valueOf(ranking.getDraws());
    }

    public GameRankingTable getRanking() {
        return ranking;
    }

    public PieChartModel getLivePieModel() {
        int playerOneWins = Integer.valueOf(this.getPlayerOneWins());
        int playerTwoWins = Integer.valueOf(this.getPlayerTwoWins());
        int draws = Integer.valueOf(this.getDraws());

        livePieModel.getData().put("Player One Wins", playerOneWins);
        livePieModel.getData().put("Player Two Wins", playerTwoWins);
        livePieModel.getData().put("Draws", draws);

        livePieModel.setTitle("Rounds");
        livePieModel.setLegendPosition("ne");

        return livePieModel;
    }
}