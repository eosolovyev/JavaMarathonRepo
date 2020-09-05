package day12.Task5;

import day12.Task5.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Member_1-1", 20));
        members1.add(new MusicArtist("Member_1-2", 21));
        members1.add(new MusicArtist("Member_1-3", 22));
        members1.add(new MusicArtist("Member_1-4", 23));
        MusicBand musicBand1 = new MusicBand("MusicBand1", 2000, members1 );


        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Member_2-1", 28));
        members2.add(new MusicArtist("Member_2-2", 29));
        members2.add(new MusicArtist("Member_2-3", 30));
        members2.add(new MusicArtist("Member_2-4", 31));
        MusicBand musicBand2 = new MusicBand("MusicBand2", 1989, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.replaceMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
