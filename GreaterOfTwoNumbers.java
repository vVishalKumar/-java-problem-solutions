package day01;
public class GreaterOfTwoNumbers {
    public static void main(String[] args) {
        int a = 25;
        int b = 15;

        if (a > b) {
            System.out.println(a + " is greater");
        } else if (b > a) {
            System.out.println(b + " is greater");
        } else {
            System.out.println("Both are equal");
        }
    }
}


