import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String toString() {
            return type + " (" + cargo + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("==================================");

        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        System.out.println("Goods Bogies: " + goodsBogies);

        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> {
                    if (b.type.equals("Cylindrical")) {
                        return b.cargo.equals("Petroleum");
                    }
                    return true;
                });

        System.out.println("Is train safety compliant? " + isSafe);
    }
}