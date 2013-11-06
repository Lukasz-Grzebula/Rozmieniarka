package javahive;

import javahive.Rozmieniarka;

public class RozmieniarkaImpl implements Rozmieniarka {
	public Nominaly rozmien(double kwota, double[] dostepneNominaly) {
		Nominaly nominaly = new Nominaly();
		
		int l = dostepneNominaly.length;
		if(kwota<0){
			throw new IllegalArgumentException("Wartosc nie moze byc ujemna");
		}
		for (int i=0; i<l; i++) {
			double nominal = dostepneNominaly[i];
			while (kwota >= nominal) {
				nominaly.setIlosc(nominal, nominaly.getIlosc(nominal)+1);
				kwota -= nominal;
			}
		}
//		nominaly.setIlosc(100, 1);
//		nominaly.setIlosc(20, 1);
//		nominaly.setIlosc(2, 2);
		return nominaly;
	}
	
	
	}
