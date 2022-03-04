package Lab8;

public class Peopls {
    protected String name;
    protected String lastname;
    protected int age;

    Peopls(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
    public void walk() {
        System.out.printf("%s %s %s годов идет куда-то",name,lastname,age);
    }
    public void voice() {
        System.out.printf("%s %s %s летний человек кричит",name,lastname,age);
    }
    public void run() {
        System.out.printf("%s %s %s лет, убегает от проблем",name,lastname,age);
    }
    public static void main(String[] arg) {
        Peopls chelik = new Peopls("Андрей", "Павук", 21);
        chelik.run();
        chelik.voice();
        chelik.walk();
    }
}
