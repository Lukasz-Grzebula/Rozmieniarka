package javahive;

public class RozmieniarkaImp2 implements Rozmieniarka2 {
	public Nominaly rozmien(double kwota,String kwota2) {
	
	        kwota = Double.parseDouble(kwota2);
	        double dzielnik;
	        Integer dwiescie,sto,piecdziesiat,dwadziescia,dziesiec,piec,dwa,jeden;
	        double dw = 0, st = 0, piecdz = 0, dwadz = 0, dzies = 0, pienczl = 0, dwazl = 0, jedenzl = 0;
	        Nominaly nominaly = new Nominaly();
	        for (int i = 0; i < kwota2.length(); i++) {
	            if (kwota / 200 > 0) {
	                dw = kwota / 200;              
	                dzielnik = dw * 200;             
	                kwota = kwota - dzielnik;
	                dwiescie=(int)dw;
	                nominaly.setIlosc(200, dwiescie);
	                i++;
	            }
	                if (kwota / 100 > 0) {
	                st = kwota / 100;
	                dzielnik = st * 100;
	                kwota = kwota - dzielnik;
	                sto=(int)st;
	                nominaly.setIlosc(100, sto);
	                i++;
	            }
	                if (kwota / 50 > 0) {
	                piecdz = kwota / 50;
	                dzielnik = piecdz * 50;
	                kwota = kwota - dzielnik;
	                piecdziesiat=(int)piecdz;
	                nominaly.setIlosc(50, piecdziesiat);
	                i++;
	            }
	                if (kwota / 20 > 0) {
	                dwadz = kwota / 20;
	                dzielnik = dwadz * 20;
	                kwota = kwota - dzielnik;
	                dwadziescia=(int)dwadz;
	                nominaly.setIlosc(20, dwadziescia);
	                i++;
	            }
	                if (kwota / 10 > 0) {
	                dzies = kwota / 10;
	                dzielnik = dzies * 10;
	                kwota = kwota - dzielnik;
	                dziesiec=(int)dzies;
	                nominaly.setIlosc(10, dziesiec);
	                i++;
	            }
	                if (kwota / 5 > 0) {
	                pienczl = kwota / 5;
	                dzielnik = pienczl * 5;
	                kwota = kwota - dzielnik;
	                piec=(int)pienczl;
	                nominaly.setIlosc(5, piec);
	                i++;
	            }
	                if (kwota / 2 > 0) {
	                dwazl = kwota / 2;
	                dzielnik = dwazl * 2;
	                kwota = kwota - dzielnik;
	                dwa=(int)dwazl;
	                nominaly.setIlosc(2, dwa);
	                i++;
	            }
	                if (kwota / 1 > 0) {
	                jedenzl = kwota / 1;
	                dzielnik = 1 * 1;
	                kwota = kwota - dzielnik;
	                jeden=(int)jedenzl;
	                nominaly.setIlosc(200, jeden);
	                i++;
	            }
	                if (kwota  == 0) {
	                    break;
	            }
	        }
	       // System.out.println(dw+"x\t200z³\t"+st+"x\t100z³\t"+piecdz+"x\t50z³\t"+dwadz+"x\t20z³\t"+dzies+
	       //         "x\t10z³\t"+piec+"x\t5z³\t"+dwa+"x\t2z³\t"+jeden+"x\t1z³");
	        
	        return nominaly;
	    }
	}
	
