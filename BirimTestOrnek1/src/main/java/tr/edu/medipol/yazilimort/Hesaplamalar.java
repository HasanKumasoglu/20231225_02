package tr.edu.medipol.yazilimort;

public class Hesaplamalar {
	
	public static int faktoriyelREC(int n) {
		if(n == 1) return 1;
		return n* faktoriyelREC(n-1);
	}
	
	public static int faktoriyelLOOP(int n) {
		int sonuc = 1;
		for (int i = 1; i <= n; i++) {
			
		sonuc = sonuc * i;
			
		}
		
		return sonuc;
	}
	
	  public static int topla(int sayi1, int sayi2) {
		  int sonuc = sayi1 + sayi2;
	        return sonuc;
	    }
	   
	    public static int cikart(int sayi1, int sayi2) {
	    	int sonuc = sayi1 - sayi2;
	        return sonuc;
	    }
	   
	    public static int carpma(int sayi1, int sayi2) {
	    	int sonuc = sayi1 * sayi2;
	        return sonuc;
	    }

}
