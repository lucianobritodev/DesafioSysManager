package desafio.test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import desafio.entities.Wagon;
import desafio.enuns.WayWagonEnum;

public class WagonTest {
	
	//deve passar
	@Test
	public void testGetOrder() {
		Wagon wg = new Wagon(1, WayWagonEnum.LEFT);
		wg.setOrder(10);
		assertThat(wg.getOrder(), is(10));
	}
	
	//deve passar
	@Test
	public void testGetWay() {
		Wagon wg = new Wagon(1, WayWagonEnum.LEFT);
		wg.setOrder(10);
		
		assertThat(wg.getWay(), is(WayWagonEnum.LEFT.name()));
	}

}
