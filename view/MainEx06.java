package view;

import controller.Sorts;

public class MainEx06 {

	public static void main(String[] args) {

		Sorts sorts = new Sorts();

		int[] vetor = new int[1500];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = vetor.length - i;
		}
		
		sorts.ordenar(vetor);

	}
}
