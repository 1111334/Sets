import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> daysOfTheWeek =  new HashSet<>();
        daysOfTheWeek.add("Lunedi");
        daysOfTheWeek.add("Martedi");
        daysOfTheWeek.add("Mercoledi");
        daysOfTheWeek.add("Giovedi");
        daysOfTheWeek.add("Venerdi");
        daysOfTheWeek.add("Sabato");
        daysOfTheWeek.add("Domenica");

        System.out.println(daysOfTheWeek);

        LinkedHashSet<String> daysOfTheWeekSave = new LinkedHashSet<>();
        daysOfTheWeekSave.add("Lunedi");
        daysOfTheWeekSave.add("Martedi");
        daysOfTheWeekSave.add("Mercoledi");
        daysOfTheWeekSave.add("Giovedi");
        daysOfTheWeekSave.add("Venerdi");
        daysOfTheWeekSave.add("Sabato");
        daysOfTheWeekSave.add("Domenica");

        System.out.println(daysOfTheWeekSave);

        //Is the first Set equal to the second one?
        System.out.println("no it's not the same hashset it doesn't preserve the insertion order of the days of the week\n" +
                "TreeSet instead allows you to do it");


    }


}
