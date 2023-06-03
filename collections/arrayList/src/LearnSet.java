import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // O(1)
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(5);
        System.out.println(set);
        System.out.println(set.contains(5));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
        Set<Integer> lset = new LinkedHashSet<>();
        // now numbers cannot be repeated but are in order
        Set<Integer> tset = new TreeSet<>();
        // O(Log n),bst and set, basically numbers are stored in bst and are in sorted form, and cannot be repeated
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("aditya",1));
        studentSet.add(new Student("Rohan",2));
        studentSet.add(new Student("Soham",3));
        studentSet.add(new Student("Arjun",3));
        studentSet.add(new Student("Alia",2));
        System.out.println(studentSet);

    }
}
