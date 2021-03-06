package day7.Task2;


public class Player {

    private int stamina;
    public final static int MAX_STAMINA = 100;
    public final static int MIN_STAMINA = 0;
    public static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public void run() {
        if (stamina == MIN_STAMINA)
            return;
        stamina--;

        if (stamina == MIN_STAMINA)
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