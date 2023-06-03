// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int[] numbers = new int[5];
        String[] names = new String[5];

        // data of 5 students
        int[] rollNumber = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
        Student kunal = new Student(7,"kushwaha",67.1f);
        Student random = new Student();
        System.out.println(kunal);
        System.out.println(kunal.name);

    }

}
// every single student structure will be as follows
// a class is a named group of properties and functions
/*
* new operator:
*
* */
class Student {
    int rollNumber;
    String name;
    float marks;
    Student (){
        // this is how you call a constructor from another constructor
        // internally it is like : new Student(arg1,arg2,arg3);
        // this is because we are not calling the "this keyword using the ref variable name, we are calling it using the class name"
        this(13,"random",69.4f);
    }
    Student (int rollNumber,String name, float marks){
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }



}
