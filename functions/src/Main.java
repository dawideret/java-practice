public class Main {
    public static void main(String[] args) {
        System.out.println(ping());
        System.out.println(some_math(5, 3, 87));
        System.out.println(some_math(-200, 5, 17));
        bars();
        Businessman Alan = new Businessman();
        Alan.setInformation("Alan",32,"Corn-way St.",1250183931,39240);
        System.out.println(Alan.getAddress());
        System.out.println(Alan.getAge());
        System.out.println(Alan.getName());
        System.out.println(Alan.getCredit_card());
        System.out.println(Alan.getSalary());
        bars();
        Alan.printInformation();
    }

    public static String ping() {
        return "pong";
    }

    public static void bars() {
        System.out.println("=========================");
    }

    public static float some_math(float one, float two, float three) {
        if (one + two + three >= 10) {
            three = one;
            two *= two;
        }
        if (one + two + three <= 0) {
            one *= -1;
            two *= -2;
            three *= -3;
        }
        return (three * two) / one + two;
    }
}