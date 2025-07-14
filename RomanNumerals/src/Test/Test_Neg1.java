package Test;

import static org.junit.jupiter.api.Assertions.*;
import main.RomanNumerals;
import org.junit.jupiter.api.Test;

class Test_Neg1 {
	 RomanNumerals test = new RomanNumerals();

	@Test
	void TCN_1_1() {
		try {
			test.convertRomanNumToInt("A");
			fail("Expected invalid Roman Number 'A'");
		} catch(NullPointerException e) {
			
		}
	}
	@Test
	void TCN_1_2() {
		try {
			test.convertRomanNumToInt("F");
			fail("Expected invalid Roman Number 'F'");
		} catch(NullPointerException e) {
			
		}
	}
	@Test
	void TCN_1_3() {
		try {
			test.convertRomanNumToInt("Z");
			fail("Expected invalid Roman Number 'Z'");
		} catch(NullPointerException e) {
			
		}
	}
}
