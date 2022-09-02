public class Main {
    public static void main(String[] args) {
        System.out.println("Main Started");

        int[] array_a;
        array_a = new int[10];

        System.out.println(array_a.length);

        array_a[0] = 10;
        array_a[4] = 3;
        array_a[7] = 5;
        array_a[9] = 9;

        array_a[3] = array_a[3] + 5;
        array_a[3] += 5;
        array_a[3]++;
        System.out.println(array_a[3]);

        System.out.println("Before Loop");

        for (int i = 0; i < array_a.length; i++) {
            System.out.println(array_a[i]);
        }

        System.out.println("After Loop");

        int x = 0;
        for (System.out.println("One Time on First Iteration"); x < 5; x++) {
            System.out.println(x + " Loop Iteration");
        }

        while (true) {
            System.out.println("While loop ends");
            break;
        }

        do {
            System.out.println("Do-While Loop ends");
        } while (false);

        for (int ab : array_a) {
            System.out.println(ab);
        }

        System.out.println("===========");

        for (int y = 0; y < 10; y++) {

            if (y == 3) {
                System.out.println(y + " 4th Iteration");
                continue;
            }

            if (y > 5) {
                System.out.println(y + " This is the 7th iteration");
                break;
            }
        }

        System.out.println("===========");

        int[] numbers = {
                951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544,
                615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941,
                386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345,
                399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217,
                815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717,
                958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470,
                743, 527 };

        for (int z : numbers) {
            if (z == 237) {
                break;
            }
            if (z % 2 == 0) {
                System.out.println(z);
            }
        }
    }
}