package view;

import controller.RodandoQuicksort;

public class Main {

	public static void main(String[] args) {
		//exercicio 1
		int [ ] v = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		//exercicio 2
		int [ ] v2 = {44, 43, 42, 41, 40, 39, 38}; 
		//exercicio 3
		int [ ] v3 = {31, 32, 33, 34, 99, 98, 97, 96}; 
		
		System.out.println("Exercicio 1");
		RodandoQuicksort.ordenar(v);
		
		System.out.println();
		
		System.out.println("Exercicio 2");
		RodandoQuicksort.ordenar(v2);
		
		System.out.println();
		
		System.out.println("Exercicio 3");
		RodandoQuicksort.ordenar(v3);

	}

}
 