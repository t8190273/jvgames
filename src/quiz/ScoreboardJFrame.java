package quiz;

import domain.User;
import service.ScoreboardService;

import javax.swing.*;

public class ScoreboardJFrame extends JFrame {

    protected ScoreboardService scoreboardService;
    protected User user;

    public ScoreboardJFrame(ScoreboardService scoreboardService, User user) {
        this.scoreboardService = scoreboardService;
        this.user = user;
    }
}
