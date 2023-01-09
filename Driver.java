package paymoney1;

import java.util.*;

public class Driver {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of currency denominations");
		int size = sc.nextInt();
		System.out.println("enter the currency denominations value");
		int[] curr_value = new int[size];
		for (int i = 0; i < size; i++) {
			curr_value[i] = sc.nextInt();
		}

		MergeSort mergesort = new MergeSort();
		mergesort.sort(curr_value, 0, size - 1);

		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();

		System.out.println();

		CurrencyDenomination CurrencyDenomination = new CurrencyDenomination();

		CurrencyDenomination.denomination(size, curr_value, amount);

	}
}
