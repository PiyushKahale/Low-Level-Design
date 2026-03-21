package iterator;

import iterator.impl.ReverseIterator;
import iterator.playlist.Playlist;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Playlist mySongs = new Playlist();
        mySongs.addSongs("Song 1");
        mySongs.addSongs("Song 2");
        mySongs.addSongs("Song 3");
        mySongs.addSongs("Song 4");

        ReverseIterator iterator = mySongs.iterator();

        System.out.println("Playing in Reverse Order:");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}