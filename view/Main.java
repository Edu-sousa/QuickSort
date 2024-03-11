package view;

import br.com.biblioteca.sort.BubbleSort;
import br.com.biblioteca.sort.MergeSort;

public class Main {

	public static void main(String[] args) {

		MergeSort ms = new MergeSort();
		BubbleSort bs = new BubbleSort();

		int bubbleUm[] = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
		int mergeUm[] = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
		int bubbleDois[] = { 44, 43, 42, 41, 40, 39, 38 };
		int mergeDois[] = { 44, 43, 42, 41, 40, 39, 38 };

		bs.bubbleSort(bubbleUm);

		System.out.println("\n-------------------------\nVetor Organizado");
		for (int valor : bubbleUm) {
			System.out.print(valor + " ");
		}

		System.out.println("\n\n\n\n");

		bs.bubbleSort(bubbleDois);

		System.out.println("\n-------------------------\nVetor Organizado");
		for (int valor : bubbleDois) {
			System.out.print(valor + " ");
		}

		System.out.println("\n\n\n\n-------------------------\nVetor Organizado com Merge Sort");

		ms.mergeSort(mergeUm, 0, mergeUm.length - 1);
		for (int valor : mergeUm) {
			System.out.print(valor + " ");
		}

		System.out.println("\n\n\n\n-------------------------\nVetor Organizado com Merge Sort");

		ms.mergeSort(mergeDois, 0, mergeDois.length - 1);
		for (int valor : mergeDois) {
			System.out.print(valor + " ");
		}

	}

}
