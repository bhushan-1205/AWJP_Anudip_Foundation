import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        // Step 1: Create an array
        int[] arr = {10, 25, 30, 45, 50, 60, 75};
        int n = arr.length;
        boolean found = false;

        // Step 2: Take element to search
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Step 3: Linear Search logic
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        // Step 4: If not found
        if (!found) {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
