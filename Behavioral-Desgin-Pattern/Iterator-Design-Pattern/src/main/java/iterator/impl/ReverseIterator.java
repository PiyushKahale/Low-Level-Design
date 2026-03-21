package iterator.impl;

import iterator.service.Iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class ReverseIterator implements Iterator {

    private List<String> songs;
    private int position;

    public ReverseIterator(List<String> songs) {
        this.songs = songs;
        this.position =  this.songs.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return position >= 0;
    }

    @Override
    public String next() {
        if(!hasNext()) throw new NoSuchElementException();
        return this.songs.get(position--);
    }
}
