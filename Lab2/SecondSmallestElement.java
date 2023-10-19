package Examples;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestElement {

    public static int getSecondSmallest(int[] arr) {
        // check if the array has at least two elements
        if (arr.length < 2) {
            throw new IllegalArgumentException("Minimum array length has to be 2");
        }

        // sort in ascending order
        Arrays.sort(arr);

        // return the second element 
        return arr[1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int numElements = scanner.nextInt();

        int[] arr = new int[numElements];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < numElements; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int secondSmallest = getSecondSmallest(arr);
        System.out.println("Second smallest element: " + secondSmallest);

        scanner.close();
    }
}

