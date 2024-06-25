package Observer;

public interface Observer {
    void notified(String title);
    void unsubscribe(Observer ob);

}
