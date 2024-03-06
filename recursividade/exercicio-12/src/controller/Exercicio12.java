package controller;

public class Exercicio12 {
	
	//construtor
	public Exercicio12() {
		super();
	}
	
	//funcao recursiva
	public int contVal(int num, int proc, int c) {
		//apos ver todos os numeros, retornar contador
		if(num <= 0) {
			return c;
		} else {
			//se o valor procurado está na variavel num
			if (num % 10 == proc) {
				c++;
				return contVal(num / 10, proc, c);
			} else {
				return contVal(num / 10, proc, c);
			}
		}
	}
	
}

