package Examples;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

    public static String[] sortStrings(String[] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            return arr;
        }

        // Sort the array in alphabetical order
        Arrays.sort(arr);

        int middle = (arr.length + 1) / 2;

        // Convert elements in the left half to uppercase
        for (int i = 0; i < middle; i++) {
            arr[i] = arr[i].toUpperCase();
        }

        // Convert elements in the right half to lowercase
        for (int i = middle; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int numOfStrings = scanner.nextInt();

      
        scanner.nextLine();

        String[] arr = new String[numOfStrings];
        System.out.println("Enter the strings:");

        for (int i = 0; i < numOfStrings; i++) {
            System.out.print("String " + (i + 1) + ": ");
            arr[i] = scanner.nextLine();
        }

        String[] sortedArr = sortStrings(arr);

        // print the sorted array
        System.out.println("The Sorted Array is as follows:");
        for (String str : sortedArr) {
            System.out.println(str);
        }

        scanner.close();  
    }
}
