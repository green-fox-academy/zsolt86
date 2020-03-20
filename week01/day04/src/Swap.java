package week01.day04.src;

public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        int temp;
        System.out.println("before swaping:");
        System.out.println("'a' value is: " + a);
        System.out.println("'b' value is: " + b);
        System.out.println("after swaping:");
        temp = a;
        a = b;
        b = temp;
        System.out.println("'a' value is: " + a);
        System.out.println("'b' value is: " + b);
    }
}
