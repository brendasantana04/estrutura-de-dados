package view;
import controller.Exercicio12;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

//		2. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número inteiro de 10
//		a 999999 e recebendo um 2o número inteiro (de 0 a 9), tenha uma função recursiva que apresente quantas
//		vezes o 2o número aparece no primeiro.
//		• Exemplo1: 1o. Número = 523578; 2o. Número = 5; retorno aparece 2 vezes
//		• Exemplo2: 1o. Número = 836363; 2o. Número = 3; retorno aparece 3 vezes
//		• A validação da entrada e do dígito deve ser feito na main da aplicação e não na função recursiva;
//		• O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
//		• O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada
//		dos passos;
		
		//variaveis
		int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor de 10 a 999999"));
		int proc = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor entre 0 a 9"));
		int c = 0; //contador
		
		//instancia de classe
		Exercicio12 ex12 = new Exercicio12();
		int resultado = ex12.contVal(num, proc, c); 
		
		System.out.println("O numero "+ proc +" aparece " + resultado + " vezes");
		
	}

}
