package src;

public class FootballPlayer {
    private String name;
    private int goals;

    public FootballPlayer(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public void scoreGoal() {
        goals++;
        System.out.println(name + " забив гол! Загалом: " + goals);
    }

    public void showStats() {
        System.out.println("Гравець: " + name + " | Голів: " + goals);
    }
}
