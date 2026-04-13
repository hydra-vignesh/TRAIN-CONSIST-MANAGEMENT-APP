import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("UC20 - Prevent Search on Empty Train");
        System.out.println("==================================");

        List<String> bogieIds = new ArrayList<>();

        String searchId = "BG101";

        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("Cannot perform search: Train has no bogies.");
        }

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie ID " + searchId + " found.");
        } else {
            System.out.println("Bogie ID " + searchId + " not found.");
        }
    }
}