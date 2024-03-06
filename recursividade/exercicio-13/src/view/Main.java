package view;
import controller.Exercicio13;

public class Main {

	public static void main(String[] args) {

//		3. Crie uma função recursiva que exiba o resultado da inversão de uma cadeia de caracteres
//		(Ex.: entrada = teste ; saída = etset):
//			Deve se u�lizar a função SUBSTRING da Java
//			O código deve trazer como comentários:
//			• A condição de parada
//			• Como escrever a função para o termo n em função do termo anterior
		
		//variaveis
		String txt = "colevati";
//		int t = txt.length(); //tamanho
//	    ArrayList<String> palavra = new ArrayList();
		
		//instancia de classe
		Exercicio13 ex13 = new Exercicio13();
		String resultado = ex13.invText(txt); 
		
		System.out.println("O contrario de "+ txt +" é " + resultado);
		
	}

}
