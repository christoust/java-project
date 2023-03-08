package array;

import java.util.Scanner;

public class Cumilative_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n = sc.nextInt();

		int[] a = new int[n];
		if (n == 0) {
			System.out.println("Invalid ");

		} else {
			System.out.println("Enter the elements");
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

		}
		int sum = 0;
		int[] cummilative_array = new int[n];
		for (int j = 0; j < n; j++) {
			sum = sum + a[j];
//			System.out.println(sum);
			cummilative_array[j] = sum;

		}
		for (int k : cummilative_array) {
			System.out.print(k + " ");
		}
	}

}
