import java.util.ArrayList;
import java.util.List;

// Concrete Subject: Dots
class Dots implements Edibles {
    private List<Adversary> adversaryList = new ArrayList<>();
    private Object state;

    @Override
    public void register(Adversary observer) {
        adversaryList.add(observer);
    }

    @Override
    public void unregister(Adversary observer) {
        adversaryList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Adversary observer : adversaryList) {
            observer.update(this); // Notify each observer
        }
    }

    @Override
    public Object getState() {
        return this.state;
    }

    @Override
    public void setState(Object state) {
        this.state = state;
        notifyObservers(); // Notify observers when state changes
    }
}
