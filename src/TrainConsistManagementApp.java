import java.util.LinkedList;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("==================================");

        List<String> trainConsist = new LinkedList<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial train consist: " + trainConsist);

        trainConsist.add(2, "Pantry Car");

        System.out.println("After inserting Pantry Car: " + trainConsist);

        ((LinkedList<String>) trainConsist).removeFirst();
        ((LinkedList<String>) trainConsist).removeLast();

        System.out.println("Final ordered train consist: " + trainConsist);
    }
}