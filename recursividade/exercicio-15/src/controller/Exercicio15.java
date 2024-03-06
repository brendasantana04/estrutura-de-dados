package controller;

public class Exercicio15 {
	
	//construtor
	public Exercicio15() {
		super();
	}
	
	//funcoes recursivass
	public int fib(int n) {
		//quando for encontrado o valor da posição desejada, retorne
        if (n == 0) {
            return 1;
        } else {
        	//enquanto o numero for maior que dois, será encontrado o valor
        	//na sequencia de fibonacci, que é um valor somado ao seu anterior
        	if (n > 2) {
        		return fib(n-1) + fib(n-2);
        	}
        	return 1;
        }
    }
}

