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

        Set<String> daysOfTheWeekSave =  new TreeSet<>();
        daysOfTheWeekSave.add("a- Lunedi");
        daysOfTheWeekSave.add("b- Martedi");
        daysOfTheWeekSave.add("c- Mercoledi");
        daysOfTheWeekSave.add("d- Giovedi");
        daysOfTheWeekSave.add("e- Venerdi");
        daysOfTheWeekSave.add("f- Sabato");
        daysOfTheWeekSave.add("g- Domenica");

        System.out.println(daysOfTheWeekSave);

        //Is the first Set equal to the second one?
        System.out.println("no it's not the same hashset it doesn't preserve the insertion order of the days of the week\n" +
                "TreeSet instead allows you to do it");


    }


}
