import java.util.ArrayList;
import java.util.List;

public class SongCollection implements Collection {
    int numberOfSongs = 0;

    List<Song> songlist;


    public SongCollection(){
        //creates songs..
        songlist = new ArrayList<Song>();
        addSong("Read My Mind - The Killers");
        addSong("You Only Live Once - The Strokes");
        addSong("SpiderHead - Cage the Elephants");

    }

    public void addSong(String name){
        Song tempSong = new Song();
        tempSong.setSongName(name);
        numberOfSongs++;
        songlist.add(tempSong);
    }
    @Override
    public Iterator createIterator() {
        return new SongIterator(songlist);
    }
}
