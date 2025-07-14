package Test;

import static org.junit.jupiter.api.Assertions.*;
import main.RomanNumerals;
import org.junit.jupiter.api.Test;

class Test_Neg2 {
	 RomanNumerals test = new RomanNumerals();

	    @Test
		void TCN_2_1() {
			try {
				test.convertRomanNumToInt("VV");
				fail("Expected Invalid Roman Number 'VV'");
			} catch(NullPointerException e) {
				
			}
		}
		@Test
		void TCN_2_2() {
			try {
				test.convertRomanNumToInt("VVV");
				fail("Expected invalid Roman Number 'VVV'");
			} catch(NullPointerException e) {
				
			}
		}
		@Test
		void TCN_2_3() {
			try {
				test.convertRomanNumToInt("LL");
				fail("Expected invalid Roman Number 'LL'");
			} catch(NullPointerException e) {
				
			}
		}
		@Test
		void TCN_2_4() {
			try {
				test.convertRomanNumToInt("LLL");
				fail("Expected invalid Roman Number 'LLL'");
			} catch(NullPointerException e) {
		
			}
		}
		@Test
		void TCN_2_5() {
			try {
				test.convertRomanNumToInt("DD");
				fail("Expected invalid Roman Number 'DD'");
			} catch(NullPointerException e) {
				
			}
		}
		@Test
		void TCN_2_6() {
			try {
				test.convertRomanNumToInt("DDD");
				fail("Expected invalid Roman Number 'DDD'");
			} catch(NullPointerException e) {
		
			}
		}
		
}
