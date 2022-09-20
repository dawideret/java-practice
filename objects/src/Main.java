public class Main {
    public static void main(String[] args) {
        Disease gerkin_germ = new Disease();
        Disease pickle_germ = new Disease(10, 25, "Third");
        System.out.println(pickle_germ.infectivity);
        System.out.println(gerkin_germ.variant);

        Disease differential_disease = gerkin_germ.compare(pickle_germ);
        System.out.println("Variant: " + differential_disease.variant + " Infectivity: " +
                                         differential_disease.infectivity + " Mortality: " +
                                         differential_disease.mortality);
    }
}