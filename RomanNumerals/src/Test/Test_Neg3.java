package Test;

import static org.junit.jupiter.api.Assertions.*;
import main.RomanNumerals;
import org.junit.jupiter.api.Test;

class Test_Neg3 {
	 RomanNumerals test = new RomanNumerals();

	 @Test
		void TCN_3_1() {
			try {
				test.convertRomanNumToInt("IIII");
				fail("Expected invalid Roman Number 'IIII'");
			} catch(NullPointerException e) {
				
			}
		}
	 @Test
		void TCN_3_2() {
			try {
				test.convertRomanNumToInt("XXXX");
				fail("Expected invalid Roman Number 'XXXX'");
			} catch(NullPointerException e) {
		
			}
		}	
	 @Test
		void TCN_3_3() {
		 	try {
				test.convertRomanNumToInt("CCCC");
				fail("Expected invalid Roman Number 'CCCC'");
		} catch(NullPointerException e) {
			
		}
	 }
	 @Test
		void TCN_3_4() {
			try {
				test.convertRomanNumToInt("MMMM");
				fail("Expected invalid Roman Number 'MMMM'");
			} catch(NullPointerException e) {
		
			}
		}

}
