package controller;

import haine.lib.pilha.*;

public class ConverteController {

	public ConverteController() {
		super();
	}
	
	public String converteDecimal(int dec) throws Exception {
			
			Pilha pilha = new Pilha();
			divisao(dec, pilha);
			return retornaBinario(pilha);
			
		}

	private void divisao(int dec, Pilha pilha) {
		while(dec > 0) {
			int resto = dec % 2;
			dec /= 2;
			pilha.push(resto);
		}
	}
	
	private String retornaBinario(Pilha pilha) throws Exception {
		String numeroString = "";
		while(!pilha.isEmpty()) {
			numeroString += String.valueOf(pilha.pop());			
		}
		return numeroString;
	}
}
