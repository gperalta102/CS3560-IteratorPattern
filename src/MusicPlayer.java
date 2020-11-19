public class MusicPlayer {

    SongCollection songList;

    public MusicPlayer( SongCollection s){
        this.songList = s;
    }

    public void printSongs(){
        Iterator iterator = songList.createIterator();
        System.out.println("<----------playlist-------->");

        while(iterator.hasNext()){
            Song s = (Song)iterator.next();
            System.out.println(s.getSongName());
        }
    }
}
