package design_pattern.creational.builder;

public class Student {
    //Doldurulmasi zeruri olan field'lar
    private String name;
    private String surname;
    private int age;

    //Optional field'lar
    private boolean hasFails;
    private boolean hasLibrarySubscription;
    private boolean hasSportClubSubscription;

    private Student(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.hasFails = builder.hasFails;
        this.hasLibrarySubscription = builder.hasLibrarySubscription;
        this.hasSportClubSubscription = builder.hasSportClubSubscription;
    }

    public static class Builder{
        //Doldurulmasi zeruri olan field'lar
        private String name;
        private String surname;
        private int age;

        //Optional field'lar
        private boolean hasFails;
        private boolean hasLibrarySubscription;
        private boolean hasSportClubSubscription;

        //zeruri field'leri tutan bir builder constructoru

        public Builder(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        //Optional field'ler doldurmaq ucun set metodlari

        public Builder setHasFails(Boolean hasFails) {
            this.hasFails = hasFails;
            return this;
        }

        public Builder setHasLibrarySubscription(Boolean hasLibrarySubscription) {
            this.hasLibrarySubscription = hasLibrarySubscription;
            return this;
        }

        public Builder setHasSportClubSubscription(Boolean hasSportClubSubscription) {
            this.hasSportClubSubscription = hasSportClubSubscription;
            return this;
        }

        //Student obyektini yaratmaq ucun build metodu;
        public Student build(){
            return new Student(this);
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", hasFails=" + hasFails +
                ", hasLibrarySubscription=" + hasLibrarySubscription +
                ", hasSportClubSubscription=" + hasSportClubSubscription +
                '}';
    }
}
