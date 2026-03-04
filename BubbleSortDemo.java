import java.util.Arrays;

public class BubbleSortDemo {

 
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

      
        int[] bubbleSortedArr = arr.clone();
        bubbleSort(bubbleSortedArr);

        System.out.println("\nSorted using Bubble Sort:");
        System.out.println(Arrays.toString(bubbleSortedArr));

       
        int[] javaSortedArr = arr.clone();
        Arrays.sort(javaSortedArr);

        System.out.println("\nSorted using Arrays.sort():");
        System.out.println(Arrays.toString(javaSortedArr));
    }
}
