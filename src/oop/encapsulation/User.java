package oop.encapsulation;

public class User {
    private long id;
    private String name;
    private String surname;
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name!=null && !name.isEmpty()){
            this.name = name;
        }else{
            System.out.println("Ad yanlis daxil edilib");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname!=null && !surname.isEmpty()){
            this.surname = surname;
        }else{
            System.out.println("Soyad yanlis daxil edilib");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0){
            this.age = age;
        }else{
            System.out.println("Yas yanlis daxil edilib");
        }
    }
}
