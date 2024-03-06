package controller;

public class Exercicio11 {

	//construtor
	public Exercicio11() {
		super();
	}
	
	//funcao recursiva
	public int contDigitos(int numero, int dig, int cont) {
		//condicao de parada = todas as casas do numero foram contadas
		if(numero <= 0) {
			return cont;
		}else {
			//divide numero por 1..10..100 até chegar ao fim, numero de casas é contador
			if (numero > dig) {
				cont++;
				return contDigitos(numero / dig, dig, cont);
			}
			else {
				cont++;
				return cont;

			}
		}
	}
	
}
