package controller;

public class Exercicio14 {
	
	//construtor
	public Exercicio14() {
		super();
	}
	
	//funcoes recursivass
	public String decBinario(int numero) {
		//quando for dividido ao máximo e o denominador chegar a 0, parar
        if (numero == 0) {
            return "";
        } else {
        	//dividirá o numero decimal por dois, e adicionará o resto na funcao
            return decBinario(numero / 2) + numero % 2;
        }
    }
}

