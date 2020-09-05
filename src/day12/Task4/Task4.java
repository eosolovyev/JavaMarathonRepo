package day12.Task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Member_1-1");
        members1.add("Member_1-2");
        members1.add("Member_1-3");
        members1.add("Member_1-4");
        MusicBand musicBand1 = new MusicBand("MusicBand1", 2000, members1);


        List<String> members2 = new ArrayList<>();
        members2.add("Member_2-1");
        members2.add("Member_2-2");
        members2.add("Member_2-3");
        members2.add("Member_2-4");
        MusicBand musicBand2 = new MusicBand("MusicBand2", 1989, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.replaceMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
