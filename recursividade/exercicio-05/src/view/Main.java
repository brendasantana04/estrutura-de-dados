package view;

import controller.Exercicio05; 

public class Main {

	public static void main(String[] args) {
				
		//5. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número
		//inteiro (N), apresente a saída da somatória s = 1 + 1/2 + 1/3 ..1/n
		
		//variaveis 
		int n = 6; // s = (1/1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6) = 2.45 
		int contador = 1;
		
		//instancia de classe
		Exercicio05 ex5 = new Exercicio05();
		
		//exibindo resultado
		double somatorio = ex5.somatorio(n, contador);
		System.out.println("a soma total equivale a " + somatorio);
		
	}

}
