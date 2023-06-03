import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Cheetah");
        System.out.println("Stack "+animals);
        System.out.println("peak "+animals.peek());
        animals.pop();
        System.out.println("peak "+animals.peek());
        System.out.println("stack "+animals);
    }
}
