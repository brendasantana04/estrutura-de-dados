package controller;

public class Exercicio4 {
	
	//metodo contrutor
	public Exercicio4 () {
		super();
	}
	
	//funcao recursiva
	public int contador (int [] v, int cont, int tam) {
		
		//condicao de parada = percorrer todo o vetor e contar o total de negativos			
		if (tam == -1) {
			return cont;
		} else {
			//se o numero for menor que zero, adiciona +1 ao contador
			if (v[tam] < 0) {
				return contador (v, cont+1, tam-1);
			}else {
				return contador(v, cont, tam-1);
			}
		}
	}
}