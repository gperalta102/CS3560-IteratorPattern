
public class NotificationCollection implements Collection {

    static int maxItems = 6;
    int numOfItems = 0;
    Notification[] notifications;

    public NotificationCollection(){
        notifications = new Notification[maxItems];
        addItem("notification 01");
        addItem("notification 02");
        addItem("notification 03");
    }

    private void addItem(String s) {
        Notification notification = new Notification(s);
        if (numOfItems>=maxItems){
            System.out.println("full");
        }else{
            notifications[numOfItems] = notification;
            numOfItems++;
        }

    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notifications);
    }

}
