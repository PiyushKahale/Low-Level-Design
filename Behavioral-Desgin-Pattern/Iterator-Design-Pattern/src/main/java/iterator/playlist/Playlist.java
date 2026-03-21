package iterator.playlist;

import iterator.impl.ReverseIterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<String> songs =  new ArrayList<String>();

    public void addSongs(String song) {
        songs.add(song);
    }

    public ReverseIterator iterator() {
        return new ReverseIterator(songs);
    }
}
