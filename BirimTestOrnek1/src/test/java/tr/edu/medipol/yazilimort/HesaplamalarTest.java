package tr.edu.medipol.yazilimort;

import static org.junit.Assert.*;

import org.junit.Test;

	public class HesaplamalarTest {

		@Test
		public void testFaktoriyelREC() {
			int sonuc = Hesaplamalar.faktoriyelREC(5);
			assertEquals(120, sonuc);
		}

		@Test
		public void testFaktoriyelLOOP() {
			int sonuc = Hesaplamalar.faktoriyelREC(5);
			assertEquals(120, sonuc);
		}

		@Test
		public void testTopla() {
			int sonuc = Hesaplamalar.topla(5,8);
			assertEquals(13, sonuc);	
			}

		@Test
		public void testCikart() {
			int sonuc = Hesaplamalar.cikart(7,4);
			assertEquals(3, sonuc);
		}

		@Test
		public void testCarpma() {
			int sonuc = Hesaplamalar.carpma(3,5);
			assertEquals(15, sonuc);
		}

	}
