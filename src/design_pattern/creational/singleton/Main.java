package design_pattern.creational.singleton;

public class Main {
    public static void main(String []args){
        SingletonEarly singletonEarly1 =SingletonEarly.getInstance();
        SingletonEarly singletonEarly2 =SingletonEarly.getInstance();
        System.out.println(singletonEarly2.equals(singletonEarly1));

        SingletonLazy singletonLazy1 =SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 =SingletonLazy.getInstance();
        System.out.println(singletonLazy2.equals(singletonLazy1));
    }
}
