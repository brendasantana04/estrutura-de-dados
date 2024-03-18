package controller;

import lib.sort.quick.*;

public class RodandoQuicksort {

	//construtor
	public RodandoQuicksort() {
		super();
	}
	
	//linkando biblioteca de quicksort com o projeto
	public static void ordenar(int [ ] v) {
		Quicksort qs = new Quicksort();
		
		System.out.println("Quicksort");
		
		qs.quickSort(v, 0, v.length - 1);
		System.out.println();
	
	}
}
