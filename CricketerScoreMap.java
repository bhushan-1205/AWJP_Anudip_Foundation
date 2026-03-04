import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketerScoreMap {
    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();

        // Storing cricketer names and scores
        scores.put("Virat Kohli", 120);
        scores.put("Rohit Sharma", 98);
        scores.put("MS Dhoni", 75);
        scores.put("KL Rahul", 65);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter batsman name to search: ");
        String name = sc.nextLine();

        // Search using containsKey()
        if (scores.containsKey(name)) {
            System.out.println("Score of " + name + " is: " + scores.get(name));
        } else {
            System.out.println("Batsman not found.");
        }

        sc.close();
    }
}
