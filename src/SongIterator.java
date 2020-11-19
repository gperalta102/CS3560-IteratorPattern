import java.util.List;

public class SongIterator implements Iterator {

    Song[] songs;
    int position = 0;

    public SongIterator(List<Song> s){
        this.songs = s.toArray(new Song[0]);
    }


    @Override
    public boolean hasNext() {
        if (position>= songs.length|| songs[position]==null){
            return false;
        }else {
            return true;
        }


    }

    @Override
    public Object next() {
        Song song = songs[position];
        position++;
        return song;
    }
}
