package oop.encapsulation;

public class Test {
    public static void main(String[] args){
        User user= new User();
        user.setName("Farid");
        user.setSurname("Hakhiyev");
        user.setAge(23);
        System.out.println("Istifadecinin adi: "+ user.getName());
        System.out.println("Istifadecinin soyadi: "+ user.getSurname());
        System.out.println("Istifadecinin yasi: "+ user.getAge());
    }
}
