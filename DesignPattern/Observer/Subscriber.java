package Observer;

public class Subscriber implements Observer{

    String name;
    Subscriber(String name){
        this.name = name;
    }

    @Override
    public void notified(String title) {
        System.out.println("Hello " + this.name + " New Video uploaded" + title);
    }

    @Override
    public void unsubscribe(Observer ob) {
        this.unsubscribe(ob);
    }
}
