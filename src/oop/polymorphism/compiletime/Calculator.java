package oop.polymorphism.compiletime;

public class Calculator {
    //parametr sayina gore overloading
    public int add(int a, int b){
        return a+b;
    };
    public int add(int a, int b, int c){
        return a+b+c;
    };
    public int add(int a, int b, int c, int d){
        return a+b+c+d;
    };
    //parametr tipine gore ovelroading
    public double add(int a, double e){
        return a+e;
    };
    public double add(double e, double f){
        return e+f;
    };

}
