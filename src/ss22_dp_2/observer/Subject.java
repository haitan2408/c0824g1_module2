package ss22_dp_2.observer;

public interface Subject {
    void add(Observer observer);
    void remove(Observer observer);
    void note();
}
