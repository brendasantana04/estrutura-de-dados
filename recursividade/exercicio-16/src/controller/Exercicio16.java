package controller;

public class Exercicio16 {
	
	//construtor
	public Exercicio16() {
		super();
	}
	
	//funcoes recursivas
	public double somaFat(int n) {
		//apos o numero desejado ser contado, retornar
        if (n == 0) {
            return 1;
        } else {
        	//apos encontrar o fatorial de um numero, ele será dividido por um e
        	// adicionado a funcao, até que todos os valores sejam contados
        	return somaFat(n- 1) + 1.0 / fat(n); 
        }
    }
	
	//encontrar fatorial de um numero
	public int fat(int n) {
		if(n <= 1) {
			return 1;
		}else {
			return n * fat(n - 1);
		}
	}

}

