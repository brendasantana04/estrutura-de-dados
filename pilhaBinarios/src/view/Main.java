package view;
import java.util.Scanner;
import controller.ConverteController;

public class Main {
	public static void main(String[] args) throws Exception {
			
		ConverteController cc = new ConverteController();
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;
		boolean controller = true;
		while(controller) {
			System.out.print("digite um valor ate 1000: \n->  ");
			n = scanner.nextInt();
			
			if(n > 1000) {
				System.out.println("numero invalido!");
			} else {
				controller = false;
			}
		}
		
		System.out.println("o numero decimal " + n + " em binario fica: " + cc.converteDecimal(n));

	}

		
}
