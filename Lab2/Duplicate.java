package Examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Duplicate{

    public static int[] modifyArray(int... arr) {
        // remove duplicates using a set
        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int num : arr) {
            uniqueElements.add(num);
        }

        // Convert the set to an array
        int[] a = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            a[index++] = num;
        }

        // Sort the resulting array in descending order
        Arrays.sort(a);
        reverseArray(a);

        return a;
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
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

        int[] newArr = modifyArray(arr);

        // array without duplicates
        System.out.println("Modified Array (without duplicates):");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nModified Array in Descending Order:");
        for (int i = newArr.length - 1; i >= 0; i--) {
            System.out.print(newArr[i] + " ");
        }
        scanner.close();  
    }
}
