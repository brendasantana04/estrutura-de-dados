package controller;

public class Exercicio02 {
	
	//metodo contrutor
	public Exercicio02 () {
		super();
	}
	
	//funcao recursiva
	public int menorValor (int [] v, int tamV, int ultVal) {
		
		//condicao de parada = quando terminar de percorrer todo o vetor, parar
		
		if (tamV == 1) {
			return ultVal;
		} else {
			
			//estou definindo que o menor valor inicial de um vetor é o útlimo, para assim percorrer o vetor e
			//encontrar o verdadeiro menor valor
			
			if (v[tamV - 1] < ultVal) {
				ultVal = v[tamV -1];
			} else {
				return menorValor(v, tamV - 1, ultVal);
			}
			
			return ultVal;
			
		}
	}
}