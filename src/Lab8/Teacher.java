package Lab8;

public class Teacher extends Peopls{
    Teacher(String name, String lastname, int age) {
        super(name, lastname, age);
    }
    public void teach() {
        System.out.printf("Учит %s %s %s ", name, lastname, age);
    }
}
