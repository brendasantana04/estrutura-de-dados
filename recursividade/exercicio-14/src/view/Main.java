package view;
import controller.Exercicio14;

public class Main {

	public static void main(String[] args) {

//		4. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número
//		inteiro, converta para binário. Entrada limitada a 2000.
		
		//variaveis
		int numero = 75;
		
		//instancia de classe
		Exercicio14 ex14 = new Exercicio14();
		String resultado = ex14.decBinario(numero);
		
		//resultado
		System.out.println("O binario de "+ numero +" é " + resultado);
		
	}

}
