public class Main {
    public static void main(String[] args) {
        System.out.println("Start Program");

        if (true == false) {
            System.out.println("How did you get here?");
        } else {
            System.out.println("Everything is fine.");
        }

        int test = true == false ? 10 : 20; // Single Line If-Else statement.

        String a = new String("This is an Object");
        String b = new String("This is an Object");
        String ab = a;

        boolean t1 = a == b; // This is false
        boolean t2 = a.equals(b); // This is true
        boolean t3 = a == ab; // This is true
    }
}