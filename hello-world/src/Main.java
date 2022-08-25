public class Main {
    public static void main(String[] args) {
        int a = 2147483647;
        int b = -2147483648;
        short c = 32767;
        short d = -32768;
        long e = 2147483647;
        float f = 15.5f;
        char g = 'g';

        String h = "Testing out Variables (Strings in Java are Objects). ";
        String i = "The + operator only works with primitives and the String objects! Nothing else. ";
        String j = h + i;
        String k = "Give me " + a + " more lives!";

        boolean l = false;
        boolean m = true;

        if (l || m) {
            System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e +
                                   "\n" + f + "\n" + g + "\n" + h + "\n" + i +
                                   "\n" + j + "\n" + k + "\n" + l + "\n" + m);
        }

        System.out.println(a);
    }
}