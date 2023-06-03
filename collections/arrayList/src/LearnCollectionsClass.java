import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(10);
        num.add(100);
        num.add(142);
        num.add(45351);
        num.add(1535363);
        num.add(1654667474);
        num.add(1234242);
        num.add(14343);
        System.out.println(Collections.min(num));
        System.out.println(Collections.max(num));
        System.out.println(Collections.frequency(num,1));
        Collections.sort(num, Comparator.reverseOrder());
        System.out.println(num);

        List<Student> list = new ArrayList<>();
        list.add(new Student("sharma",1));
        list.add(new Student("bakshi",2));
        list.add(new Student("chaudhary",3));
        list.add(new Student("verma",4));
        Collections.sort(list);
        System.out.println(list);
    }
}
