package Lab8;

public class Student extends Peopls{
    Student(String name, String lastname, int age) {
        super(name, lastname, age);
    }
    public void learn() {
        System.out.printf("Учится %s %s %s ", name, lastname, age);
    }
}
