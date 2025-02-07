// Interface for Edibles (Subject)
interface Edibles {
    void register(Adversary observer);

    void unregister(Adversary observer);

    void notifyObservers();

    Object getState();

    void setState(Object state);
}
