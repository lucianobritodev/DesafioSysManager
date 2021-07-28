package desafio.test;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import desafio.util.Count;

public class CountTest {

	
	/**
	 * Verifica se o tipo da variável retornada realmente é Inteiro
	 * */
	@Test
	public void testCountNumbers1() {
		int a = Count.countNumbers(new int[] {1,3,5,7}, 4);
		assertThat(((Object) a).getClass().getSimpleName(), is("Integer"));
	}
	
	/**
	 * Verifica se o método realmente está contando todas as ocorrências
	 * de valores menores que o passado por parâmetro
	 * */
	@Test
	public void testCountNumbers2() {
		int a = Count.countNumbers(new int[] {1,3,5,7}, 4);
		assertThat(a, is(2));
	}
	
	/**
	 * Verifica se o tipo da variável retornada realmente é Inteiro
	 * */
	@Test
	public void testSort1() {
		int a = Count.countNumbers(new int[] {1,3,5,7}, 4);
		assertThat(((Object) a).getClass().getSimpleName(), is("Integer"));
	}
	
	/**
	 * Verifica se o array está retornando ordenado
	 * */
	@Test
	public void testSort2() {
		int[] a = new int[] {5,3,1,7};
		int[] b = Count.sort(a);		
		assertThat(b, is(new int[] {1,3,5,7}));
	}
}
