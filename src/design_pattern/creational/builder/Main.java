package design_pattern.creational.builder;

public class Main {
    public static void main(String[] args) {
        Student student1= new Student.Builder("Farid","Hakhiyev",23)
                .setHasFails(false)
                .setHasLibrarySubscription(true)
                .setHasSportClubSubscription(true)
                .build();
        Student student2= new Student.Builder("Asif","Mustafayev",23)
                .setHasLibrarySubscription(true)
                .build();
        Student student3= new Student.Builder("Osman","Bashirov",23)
                .setHasFails(true)
                .build();
        Student student4= new Student.Builder("Murad","Aliyev",22)
                .setHasSportClubSubscription(true)
                .build();

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
    }
}
