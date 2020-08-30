package day7.Task2;


public class Task2 {
    public static void main(String[] args) {
        Player p1 = new Player(88);
        Player p2 = new Player(99);
        Player p3 = new Player(75);
        Player p4 = new Player(50);
        Player p5 = new Player(22);
        Player p6 = new Player(98);

        Player.run(p1);
        Player.info();
    }
}
