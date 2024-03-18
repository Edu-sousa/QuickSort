package controller;

import br.com.biblioteca.quick.QuickSort;
import br.com.biblioteca.sort.BubbleSort;
import br.com.biblioteca.sort.MergeSort;

public class Sorts {
	
	
	public Sorts() {
		super();
	}
	
	BubbleSort bubble = new BubbleSort();
	MergeSort merge = new MergeSort();
	QuickSort quick = new QuickSort();
	
	public void ordenar (int vetor[]) {
		
		double tempoInicial, tempoFinal, tempoTotal;
		
		tempoInicial = System.nanoTime();
		bubble.bubbleSort(vetor);
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println("Tempo Bubble Sort  "+tempoTotal);
		
		tempoInicial = System.nanoTime();
		merge.mergeSort(vetor, 0, vetor.length-1);
		tempoFinal = System.nanoTime();
	    tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println("Tempo Merge Sort  "+tempoTotal);
		
		tempoInicial = System.nanoTime();
		quick.quickSort(vetor, 0, vetor.length-1);
		tempoFinal = System.nanoTime();
	    tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println("Tempo Quick Sort  "+tempoTotal);
		
	}
	

}
