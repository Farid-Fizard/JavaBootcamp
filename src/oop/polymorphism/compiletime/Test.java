package oop.polymorphism.compiletime;

public class Test {
    public static void main (String[] args){
        //parametr sayina gore overloading
        Calculator calculator= new Calculator();
        int a=5;
        int b=10;
        int c=20;
        int d=40;
        int sum1 =calculator.add(a,b);
        int sum2 =calculator.add(a,b,c);
        int sum3 =calculator.add(a,b,c,d);
        System.out.println("2 ededin toplami: "+sum1);
        System.out.println("3 ededin toplami: "+sum2);
        System.out.println("4 ededin toplami: "+sum3);
        //parametr tipine gore overloading
        double e=80;
        double f=160;
        double sum4=calculator.add(a,e);
        double sum5=calculator.add(e,f);
        System.out.println("2 muxtelif tipli deyisenin toplami: "+sum4);
        System.out.println("2 double tipli deyisenin toplami: "+sum5);
    }

}
