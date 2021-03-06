package sort;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void testQuickSort() {
		int quantidade = 1000;
		int[] vetor = new int[quantidade];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
		}

		long tempoInicial = System.currentTimeMillis();
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(vetor, 0, vetor.length - 1);
		long tempoFinal = System.currentTimeMillis();
		System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
		System.out.println("Comparações:  " + quickSort.getRetornoDados().get(SortKeys.KEY_COMPARA));
		System.out.println("Troca:  " + quickSort.getRetornoDados().get(SortKeys.KEY_TROCA));
	}
	
}
