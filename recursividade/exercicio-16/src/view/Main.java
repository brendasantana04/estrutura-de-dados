package view;
import controller.Exercicio16;

public class Main {

	public static void main(String[] args) {

//		6. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número
//		inteiro (N), apresente a saída da somatória s = 1 + 1/2! + 1/3! + ... + 1/n!
		//variaveis
		int n = 5;
		
		//instancia de classe
		Exercicio16 ex16 = new Exercicio16();
		double resultado = ex16.somaFat(n);
		
		//resultado
		System.out.println("a soma da sequência de fatoriais é " + resultado);
		
	}

}
