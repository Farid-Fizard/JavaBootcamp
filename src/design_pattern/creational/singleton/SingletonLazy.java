package design_pattern.creational.singleton;

public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy(){

    }
    public static SingletonLazy getInstance(){
        if(instance==null) {
            //Singletonu Thread safe hala getirmek ucun
            synchronized (SingletonLazy.class) {
                instance = new SingletonLazy();
            }
        }
        return instance;
    }
}
