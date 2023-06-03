import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        int index = Arrays.binarySearch(a,4);
        System.out.println(index);
        int b[] = {1,2,6,4,5,11,7,8,9};
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        // parallel sort uses multiple processors to inc efficiency, min elements 8192
        Arrays.fill(a,1);
        for (int n: a
             ) {
            System.out.println(n);
        }
    }
}
