package controller;

public class Exercicio05 {
	
	//metodo contrutor
	public Exercicio05 () {
		super();
	}
	
	//funcao recursiva
	public double somatorio (int n, double contador) {
		
		//condicao de parada = realizar o somatorio, adicionando ao contador +1 até chegar n
		if (contador == n + 1) {
			return 0;
		} else {
			//ir somando as divisoes até atingir a condicao de parada
			return (1/contador) + somatorio(n, contador+1);
		}
	}
}