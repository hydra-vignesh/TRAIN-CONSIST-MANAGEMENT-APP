import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("UC11 - Validate Train ID & Cargo Code");
        System.out.println("==================================");

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        Pattern tp = Pattern.compile(trainPattern);
        Pattern cp = Pattern.compile(cargoPattern);

        Matcher trainMatcher = tp.matcher(trainId);
        Matcher cargoMatcher = cp.matcher(cargoCode);

        if (trainMatcher.matches()) {
            System.out.println("Train ID is valid: " + trainId);
        } else {
            System.out.println("Invalid Train ID: " + trainId);
        }

        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is valid: " + cargoCode);
        } else {
            System.out.println("Invalid Cargo Code: " + cargoCode);
        }
    }
}