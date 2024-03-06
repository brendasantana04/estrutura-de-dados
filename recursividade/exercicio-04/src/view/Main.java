package view;

import controller.Exercicio4; 

public class Main {

	public static void main(String[] args) {
				
		//4. Crie uma função recursiva que exiba o total de elementos nega�vos de um vetor de inteiros, de N
		//posições, passado como parâmetro:
		
		//variaveis 
		int [ ] v  = {-1, 3, 4, -2, 0, -7, 6, 11, -4, 9 , -3, 10, 23}; //total deve dar 5
		int cont = 0;
		int tam = v.length - 1;
		
		//instancia de classe
		Exercicio4 ex4 = new Exercicio4();
		
		//exibindo resultado
		int resultado = ex4.contador(v, cont, tam);
		System.out.println("O número de negativos no vetor é de " + resultado);
		
	}

}
