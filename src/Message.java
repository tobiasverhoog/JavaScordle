import java.time.LocalTime;

public class Message {
    private static int score;
    private static Player player;
    private static LocalTime time;
    private static String wordleDay;
    public Message(int score, Player player, LocalTime time, String wordleDay) {
        this.score = score;
        this.player = player;
        this.time = time;
        this.wordleDay = wordleDay;
    }

    public int getScore() {
        return score;
    }

    public Player getPlayer() {
        return player;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getWordleDay() {
        return wordleDay;
    }
}
