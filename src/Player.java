public class Player {
    private static String name;
    private int weekScore;
    public Player(String name) {
        this.name = name;
        this.weekScore = 0;
    }

    public String getName() {
        return name;
    }
    public int getWeekScore() {
        return weekScore;
    }
}
