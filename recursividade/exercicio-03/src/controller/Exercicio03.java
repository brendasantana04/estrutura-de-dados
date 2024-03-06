package controller;

public class Exercicio03 {
	
	//metodo contrutor
	public Exercicio03 () {
		super();
	}
	
	//funcao recursiva
	public int fatorial (int numero, int fat) {
		
		//condicao de parada = ao terminar de fazer a soma do fatorial	
		
		if (numero == 0) {
			return 1;
		} else {
			
			//estou diminuindo de forma decrescente o numero inicial para realizar a soma de seu fatorial
			
			return numero * fatorial(numero - 1, fat);
			
		}
	}
}