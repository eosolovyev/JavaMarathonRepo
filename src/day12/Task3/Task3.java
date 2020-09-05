package day12.Task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Band_1", 1958);
        MusicBand musicBand2 = new MusicBand("Band_2", 2020);
        MusicBand musicBand3 = new MusicBand("Band_3", 1999);
        MusicBand musicBand4 = new MusicBand("Band_4", 1998);
        MusicBand musicBand5 = new MusicBand("Band_5", 2005);
        MusicBand musicBand6 = new MusicBand("Band_6", 2006);
        MusicBand musicBand7 = new MusicBand("Band_7", 1987);
        MusicBand musicBand8 = new MusicBand("Band_8", 2011);
        MusicBand musicBand9 = new MusicBand("Band_9", 1988);
        MusicBand musicBand10 = new MusicBand("Band_10", 2015);
        MusicBand musicBand11 = new MusicBand("Band_11", 2013);


        List<MusicBand> bandList = new ArrayList<>();
        bandList.add(musicBand1);
        bandList.add(musicBand2);
        bandList.add(musicBand3);
        bandList.add(musicBand4);
        bandList.add(musicBand5);
        bandList.add(musicBand6);
        bandList.add(musicBand7);
        bandList.add(musicBand8);
        bandList.add(musicBand9);
        bandList.add(musicBand10);
        bandList.add(musicBand11);
        System.out.println(bandList);

        Collections.shuffle(bandList);

        System.out.println(bandList);

        List<MusicBand> bandListNew = new ArrayList<>();

        for (MusicBand musicBand : bandList) {
            if (musicBand.getYear() >= 2000){
                bandListNew.add(musicBand);
            }
        }
        System.out.println(bandListNew);
    }
}
