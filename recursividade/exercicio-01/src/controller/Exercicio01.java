package controller;

public class Exercicio01 {
	
	//metodo contrutor
	public Exercicio01 () {
		super();
	}
	
	//funcao recursiva
	public int soma (int n) {
		//condicao de parada = quando o contador dos numeros naturais chegar a zero, parar
		if (n == 0) {
			return 0;
		} else {
			return n + soma(n - 1);
		}
	}
}