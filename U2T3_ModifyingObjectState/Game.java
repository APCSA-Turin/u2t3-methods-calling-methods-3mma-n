package U2T3_ModifyingObjectState;

public class Game {
    private String gameName;
    private int players;
    private int score;

    public Game(String gameName, int players) {
        this.gameName = gameName;
        this.players = players;
    }
    public String getGameName() {
        return gameName;
    }
    public int getPlayers() {
        return players;
    }
    public int getScore() {
        return score;
    }
    public void addPlayer() {
        players++;
    }
    public void increaseScore(int increase) {
        score += increase;
    }
    public double averageScorePerPlayer() {
        return (double) score / players;
    }
    public boolean isGameOver() {
        if (score > 9) {
            return true;
        }
        return false;
    }
    public void switchGame(String gameName) {
        this.gameName = gameName;
        score = 0;
    }
    public void playerDropOut() {
        score -= (int) (averageScorePerPlayer() + 0.5);
        players--;
    }
}
