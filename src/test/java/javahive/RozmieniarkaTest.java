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
	@Test
	public void PowinienRozmienicPoprawnie1000() {
		//given
		Rozmieniarka rozmieniarka=new RozmieniarkaImpl();
		//when
		Nominaly nominaly=rozmieniarka.rozmien(1000, NOMINALY_PL);
		//then
		assertTrue(nominaly.getIlosc(200)==5);
		assertTrue(nominaly.getIlosc(100)==0);
	}
	
	@Test
	public void PowinnaWyrzucacWyjatekDlaUjemnychWartosci(){
		int waluta=-200;
		Rozmieniarka rozmieniarka = new RozmieniarkaImpl();
		if(waluta<0){
			//Assert.fail();
			throw new IllegalArgumentException("Wartosc nie moze byc ujemna");
		}else{
			Nominaly nominaly=rozmieniarka.rozmien(waluta,NOMINALY_PL);
			assertTrue(waluta>0);
		}
	}
	
	@Test
	public void PowinienRozmienicPoprawnie999(){
		//given
		Rozmieniarka rozmieniarka=new RozmieniarkaImpl();
		//when
		Nominaly nominaly=rozmieniarka.rozmien(124, NOMINALY_PL);
		//then
		assertTrue(nominaly.getIlosc(200)==4);
		assertTrue(nominaly.getIlosc(100)==1);
		assertTrue(nominaly.getIlosc(50)==1);
		assertTrue(nominaly.getIlosc(20)==2);
		assertTrue(nominaly.getIlosc(5)==1);
		assertTrue(nominaly.getIlosc(2)==2);
	}
	@Test
	public void Rozmieniarka2PowinnaPoprawnieRozmienic999(){
		Rozmieniarka2 roz2=new RozmieniarkaImp2();
		Nominaly nominaly=roz2.rozmien(999, "999");
		assertTrue(nominaly.getIlosc(200)==4);
		assertTrue(nominaly.getIlosc(100)==1);
		assertTrue(nominaly.getIlosc(50)==1);
		assertTrue(nominaly.getIlosc(20)==2);
		assertTrue(nominaly.getIlosc(5)==1);
		assertTrue(nominaly.getIlosc(2)==2);
		
	}
}
