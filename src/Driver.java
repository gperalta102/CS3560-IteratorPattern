public class Driver {

    public static void main(String[] args) {
        NotificationCollection notificationCollection = new NotificationCollection();
        NotificationBar notificationBar = new NotificationBar(notificationCollection);
        notificationBar.printNotifications();

        //creating a musicplayer
        SongCollection playlist01 = new SongCollection();
        MusicPlayer ipod = new MusicPlayer(playlist01);
        ipod.printSongs();
    }
}
