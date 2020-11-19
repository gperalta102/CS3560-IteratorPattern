public class NotificationIterator implements Iterator{

    Notification[] notificationArray;
    int position = 0;

    public NotificationIterator(Notification[] n){
        this.notificationArray = n;

    }
    @Override
    public boolean hasNext() {
        if (position>=notificationArray.length || notificationArray[position] == null){
            return false;

        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Notification notification = notificationArray[position];
        position++;
        return notification;
    }
}
