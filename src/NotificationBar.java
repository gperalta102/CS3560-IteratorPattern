public class NotificationBar {

    NotificationCollection notifications;
    public NotificationBar(NotificationCollection n){
        this.notifications = n;

    }

    public void printNotifications(){
        Iterator iterator = notifications.createIterator();
        System.out.println("*************** NotificationBar ***************");

        while (iterator.hasNext()){
            Notification n = (Notification)iterator.next();
            System.out.println(n.getNotification());
        }
    }
}
