package view;

import controller.Exercicio02; 

public class Main {

	public static void main(String[] args) {
				
		//2. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um vetor de inteiros, o
		//tamanho do vetor e o valor da úl�ma posição do vetor como o primeiro menor valor, retorne o menor
		//valor con�do neste vetor.
		
		//variaveis 
		int [ ] v = {4, 5, 6, 7, 8, 3};
		int tamV = v.length; 
		int ultVal = v[tamV - 1]; //ultimo valor do vetor
		
		//instancia de classe
		Exercicio02 ex2 = new Exercicio02();
		
		//exibindo resultado
		int menorValor = ex2.menorValor(v, tamV, ultVal);
		System.out.println("O menor valor do vetor é " + menorValor);
		
	}

}
