public class Person {
    public int height;
     float weight;

    protected void say (String str){
        System.out.println(str);
    }

    Person (int height, float weight){
        this.height = height;
        this.weight = weight;
    }

    Person () {}

    public static String affilation = "Alderaanian"; //static. without initialization of class
    final String yoda = "Grogu or MAESTRO YODA. Unknown race"; // unchanged type unlike static.
    // final with used to class it's means that this class don't have an extends
    public static void write (){
        System.out.println("Иди своей дорогой, СТАЛКЕР!");
    }
}
