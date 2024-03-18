package view;
import controller.BibliotecasController;

public class Main {

	public static void main(String[] args) {

//		6. Criar um projeto Java que receba as bibliotecas BubbleSort, MergeSort e QuickSort. O projeto deve
//		prever um vetor com 1500 posições ({1499, 1498, 1497, ..., 0}) e apresentar o tempo de ordenação para
//		cada um dos métodos.
		
		//variaveis
		double inicio, fim, total;
		
		//criando vetor com 1500 posições
		int [] v = new int[1500];
		
		//copiando o vetor para cada metodo de sorting
		int [ ] vBubble = v.clone();
		int [ ] vMerge = v.clone();
		int [ ] vQuick = v.clone();
		
		//preenchendo o vetor
        for (int i = 0; i < 1500; i++) {
            v[i] = i + 1;
        }
        
        //instancia de classe
        BibliotecasController bc = new BibliotecasController();
        
        //fazendo a verificação de tempo
        //bubblesort
        inicio = System.nanoTime();
        bc.bubbleSort(vBubble);
        fim = System.nanoTime();
        total = (fim - inicio) / 1_000_000_000.0;; //para converter em milisegundos
        System.out.println("O tempo demorado em segundos para bubblesort foi de: " + total + " segundos");
        
        //mergesort
        inicio = System.nanoTime();
        bc.mergeSort(vMerge);
        fim = System.nanoTime();
        total = (fim - inicio) / 1_000_000_000.0;; //para converter em milisegundos
        System.out.println("O tempo demorado em segundos para mergesort foi de: " + total + " segundos");
        
        //quicksort
        inicio = System.nanoTime();
        bc.quickSort(vQuick);
        fim = System.nanoTime();
        total = (fim - inicio) / 1_000_000_000.0;; //para converter em milisegundos
        System.out.println("O tempo demorado em segundos para quicksort foi de: " + total + " segundos");
	}

}
