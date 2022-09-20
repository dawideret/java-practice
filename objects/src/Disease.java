import java.awt.*;

public class Disease {
    int mortality;
    int infectivity;
    String variant;

    Disease() {
        this(0, 0, "First");
    }

    Disease(int mortality, int infectivity, String variant) {
        this.mortality = mortality;
        this.infectivity = infectivity;
        this.variant = variant;
    }

    Disease compare(Disease other) {
        return new Disease(mortality - other.mortality, infectivity - other.infectivity, "Null");
    }
}