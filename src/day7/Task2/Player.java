package day7.Task2;


public class Player {

    private static int stamina;
    public final static int MAX_STAMINA = 100;
    public final static int MIN_STAMINA = 0;
    public static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }

    public static void run(Player player) {
        while (stamina > MIN_STAMINA) {
            stamina--;
        }
        countPlayers--;
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команда неполная, есть еще " + (6 - countPlayers) + " мест");
        } else {
            System.out.println("Команда полная");
        }
    }
}