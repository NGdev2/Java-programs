import java.util.Calendar;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        Boxer Lebedev = new Boxer();
        Lebedev.name = "Denis";
        Lebedev.birth_year = 1979;
        Lebedev.height = 180;
        Lebedev.weight = 96.1f;
        Lebedev.age = (get_age(Lebedev.birth_year));
        Lebedev.category = get_category(Lebedev.weight);
//        System.out.println("Lebedev weight category: " + Lebedev.category);
//        System.out.println(Lebedev.age);
//        System.out.println(get_age(1993));


        Boxer Muhammad = new Boxer();
        Muhammad.name = "Ali";
        Muhammad.category = "heavyweight";
        Muhammad.birth_year = 1942;
        Muhammad.height = 191;
        Muhammad.weight = 107.2f;
        Muhammad.age = (2016-Muhammad.birth_year);
        //        System.out.println(Muhammad.age);


        Boxer Tyson = new Boxer();
        Tyson.name = "Michael";
        Tyson.birth_year = 1966;
        Tyson.height = 178;
        Tyson.weight = 100.0f;
        Tyson.age = (get_age(Tyson.birth_year));
        Tyson.category = get_category(Tyson.weight);
        System.out.println(Tyson);
//        System.out.println("Tyson weight category: " + Tyson.category);


        Boxer Alvarez = new Boxer(175,75.5f,1990, 31, "Saul", "Super middleweight");
//        Alvarez.name = "Saul";
//        Alvarez.birth_year = 1990;
//        Alvarez.height = 175;
//        Alvarez.weight = 75.5f;
//        Alvarez.age = (get_age(Alvarez.birth_year));
//        Alvarez.category = get_category(Alvarez.weight);
        System.out.println("Boxer Alvarez name: " + Alvarez.name + " age: " + Alvarez.age + " height: " + Alvarez.height + " weight: " + Alvarez.weight + " category: " + Alvarez.category);

    }

    public static int get_age(int birth_year){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("russia/moscow"));
        int year = cal.get(Calendar.YEAR);
        return year-birth_year;
    }

    public static String get_category(float weight){
        if (weight > 90.7f)
            return "heavyweight";
        else if (weight > 79.4f)
            return "Cruiserweight";
        else if (weight > 76.2f)
            return "Light heavyweight";
        else if (weight > 72.5f)
            return "Super middleweight";
        else if (weight > 69.8f)
            return "Middleweight";
        else if (weight > 66.7f)
            return "Super welterweight";
        else if (weight > 63.5f)
            return "Welterweight";
        else
            return "Lightweight";
    }
}
