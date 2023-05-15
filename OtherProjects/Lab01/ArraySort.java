package lab01;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.printf("Enter number of array: ");
			int n = input.nextInt();

			int[] arr = new int[n];
			for(int i = 0; i < n; i++){
			    arr[i] = input.nextInt();
			}

			Arrays.sort(arr);
			
			int sum = 0;
			
			for (int i = 0; i < arr.length; i++) {
			    sum += arr[i];
			}
			
			double avg = (double)sum / arr.length;
			
			System.out.println("Sorted array: " + Arrays.toString(arr));
			System.out.println("Sum of array elements: " + sum);
			System.out.println("Average value of array elements: " + avg);
		}
    }
}