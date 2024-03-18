package controller;

import lib.sort.bubble.Bubblesort;
import lib.sort.merge.Mergesort;
import lib.sort.quick.Quicksort;

public class BibliotecasController {

	//construtor
	public BibliotecasController() {
		super();
	}
	
	//metodo com quicksort
	public static void quickSort(int [ ] vQuick) {
		Quicksort qs = new Quicksort();
		System.out.println("Quicksort");
		qs.quickSort(vQuick, 0, vQuick.length - 1);
		System.out.println();
	}
	
	//metodo com bubblesort
	public static void bubbleSort(int [ ] vBubble) {
		Bubblesort bs = new Bubblesort();
		System.out.println("Bubblesort");
		bs.bubbleSort(vBubble, 0, 0, 0);
		System.out.println();
	}
	
	//metodo com mergesort
	public static void mergeSort(int [ ] vMerge) {
		Mergesort ms = new Mergesort();
		System.out.println("Mergesort");
		ms.mergeSort(vMerge);
		System.out.println();
	}
	
}
