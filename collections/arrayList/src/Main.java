import java.util.ArrayList;
import java.util.Iterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        ArrayList<String> students = new ArrayList<>();
        students.add("Aditya");
        students.add("Sharma");
        students.add(1,"Rahul");
        ArrayList<String> sign = new ArrayList<>();
        sign.add("rohan");
        sign.add("abhi");
        System.out.println(students);
        students.addAll(sign);
        System.out.println(students);
//        System.out.println(students.get(0));
//        students.remove(1);
//        System.out.println(students);
//        students.remove("Aditya");
//        System.out.println(students);
//        students.clear();
//        System.out.println(students);
        // in middle, insertion and deletion, time complexity O(n)
        students.set(1,"varma");
        System.out.println(students);
         // if size is n initially then new size will be (n + n/2 + 1), this is how arraylist
        // increases its size

        for (int i = 0; i < students.size(); i++) {
            System.out.println("forloop "+students.get(i));
        }

        for (String name:
             students) {
            System.out.println("foreach "+name);
        }

        Iterator<String> it = students.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}