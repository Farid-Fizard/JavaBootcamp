package design_pattern.creational.singleton;

public class SingletonEarly {
private static final SingletonEarly instance = new SingletonEarly();

    private SingletonEarly() {
    }
    public static SingletonEarly getInstance(){
        return instance;
    }
}
