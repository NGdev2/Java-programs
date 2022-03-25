public class Inheritance {
    public static void main(String[] args) {
        Person max = new Person(180, 78.4f);

        max.say("Hi, I'm Maks!");
        System.out.println(max.height);

        Person petia = new Person();
        petia.height = 195;
        petia.weight = 96.7f;

        System.out.println(petia.height);

        Student vasia = new Student(168, 53.6f, 2);
        System.out.println("Student Vasia extends Person. course " + vasia.course);

        System.out.println(Person.affilation);
        Person.write();
        Person.affilation = "Sith";
        System.out.println(Person.affilation);
    }
}
