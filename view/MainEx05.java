package view;

import br.com.biblioteca.quick.QuickSort;

public class MainEx05 {

	public static void main(String[] args) {

		QuickSort qs = new QuickSort();

		int[] vetor = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
		int[] vetor2 = { 44, 43, 42, 41, 40, 39, 38 };
		int[] vetor3 = { 31, 32, 33, 34, 99, 98, 97, 96 };

		qs.quickSort(vetor, 0, vetor.length - 1);

		qs.quickSort(vetor2, 0, vetor2.length - 1);

		qs.quickSort(vetor3, 0, vetor3.length - 1);
		

		for (int i : vetor) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i : vetor2) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i : vetor3) {
			System.out.print(i + " ");
		}

	}

}
