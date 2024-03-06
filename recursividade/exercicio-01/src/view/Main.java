package view;

import controller.Exercicio01; 

public class Main {

	public static void main(String[] args) {
				
		//1. Criar uma aplicação em Java que tenha uma função recursiva que calcule o somatório do N primeiros
		// número NATURAIS (a função deve retornar zero para números nega�vos)
		
		//variaveis 
		int n = 6;
		
		//instancia de classe
		Exercicio01 ex1 = new Exercicio01();
		
		//exibindo resultado
		int s = ex1.soma(n);
		System.out.println("A soma dos números reais é de " + s);
		
	}

}
