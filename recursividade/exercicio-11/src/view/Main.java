package view;
import controller.Exercicio11;

public class Main {

	public static void main(String[] args) {

//		1. Crie uma função recursiva que exiba a quan�dade de dígitos de um número inteiro passado como
//		parâmetro:
//		O código deve trazer como comentários:
//		A condição de parada
//		Como escrever a função para o termo n em função do termo anterior
		
		//	variaveis
		int numero = 962211;
		int dig = 10;
		int cont = 0;
		
		//instancia
		Exercicio11 ex11 = new Exercicio11();
		
		//exibindo o resultado
		int resultado = ex11.contDigitos(numero, dig, cont);
		System.out.println("Quantidade de dígitos " + resultado);
	}

}
