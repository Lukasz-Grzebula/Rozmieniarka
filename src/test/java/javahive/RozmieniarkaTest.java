package javahive;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

public class RozmieniarkaTest {
	private final double[] NOMINALY_PL = { 200, 100, 50, 20, 10, 5, 2, 1, .50, .20, .10, .05, .02, 0.01 };
	@Test
	public void PowinienRozmieniacPoprawnie124(){
		//given
		Rozmieniarka rozmieniarka=new RozmieniarkaImpl();
		//when
		Nominaly nominaly=rozmieniarka.rozmien(124, NOMINALY_PL);
		//then
		assertTrue(nominaly.getIlosc(100)==1);
		assertTrue(nominaly.getIlosc(20)==1);
		assertTrue(nominaly.getIlosc(2)==2);
	}
	
	public void PowinienRozmienicPoprawnie1000() {
		//given
		Rozmieniarka rozmieniarka=new RozmieniarkaImpl();
		//when
		Nominaly nominaly=rozmieniarka.rozmien(1000, NOMINALY_PL);
		//then
		assertTrue(nominaly.getIlosc(200)==5);
		assertTrue(nominaly.getIlosc(100)==0);
	}
}
