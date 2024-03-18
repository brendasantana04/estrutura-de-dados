package view;

import lib.sort.quick.*;

public class Main {

	public static void main(String[] args) {
		//vetor-1
		int v[ ] = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		
		
		//instancia
		Quicksort qs = new Quicksort();
		
		//mostrando resultado quicksort
		System.out.println("=== Ordenando o valor com Quicksort ====");
		
		System.out.println();
		System.out.println("Vetor Original");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]);
			System.out.print(" ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("===== Organizando o vetor =====");
		
		//quicksort
		qs.quickSort(v, 0, v.length - 1); //resultado quicksort
		
		System.out.println();
		System.out.println("Vetor Organizado");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]);
			System.out.print(" ");
		}
	}
}

