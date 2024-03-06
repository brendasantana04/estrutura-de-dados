package view;

import controller.Exercicio03; 

public class Main {

	public static void main(String[] args) {
				
		//3. Crie uma função recursiva que exiba o resultado do fatorial de um número (Pela limitação da
		//recursividade, o número de entrada deverá ser baixo para não dar estouro(limite de entrada = 12))
		
		//variaveis 
		int numero = 8;
		
		//instancia de classe
		Exercicio03 ex3 = new Exercicio03();
		
		//exibindo resultado
		int resultado = ex3.fatorial(numero, numero);
		System.out.println("O resultado do fatorial de um número é " + resultado);
		
	}

}
