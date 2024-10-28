package oop.inheritance;

public class Test {
    public static void main(String[] args) {
        Shape s1= new Circle(5);
        Shape s2= new Triangle(3,4);
        Shape s3= new Rectangle(6,8);
        s1.draw();
        System.out.println("Dairenin sahesi: "+s1.area());
        s2.draw();
        System.out.println("Ucbucagin sahesi: "+s2.area());
        s3.draw();
        System.out.println("Dordbucagin sahesi: "+s3.area());
    }
}