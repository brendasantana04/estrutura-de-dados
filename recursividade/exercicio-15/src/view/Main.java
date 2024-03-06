package view;
import controller.Exercicio15;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

//		5. Considere a série de Fibonacci:
//		1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
//		Escrever uma função recursiva que, dado uma posição da série, a função retorne seu valor.
//		Entrada limitada a 20 (Condição que deve ser testada na Main da aplicação).

		//variaveis
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor até 20"));
		
		//instancia de classe
		Exercicio15 ex15 = new Exercicio15();
		int resultado = ex15.fib(n);
		
		//resultado
		System.out.println("a posicao "+ n +" na sequência de fibonacci corresponde ao valor " + resultado);
		
	}

}
