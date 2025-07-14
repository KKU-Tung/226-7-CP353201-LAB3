package Test;

import static org.junit.jupiter.api.Assertions.*;
import main.RomanNumerals;
import org.junit.jupiter.api.Test;

class Test_Pos1 {
	 RomanNumerals test = new RomanNumerals();
//Single Digit Test
	@Test
	void TC1_1() {
		assertEquals(1,  test.convertRomanNumToInt("I"));
	}
	@Test
	void TC1_2() {
		assertEquals(5,  test.convertRomanNumToInt("V"));
	}
	@Test
	void TC1_3() {
		assertEquals(10,  test.convertRomanNumToInt("X"));
	}
	@Test
	void TC1_4() {
		assertEquals(50,  test.convertRomanNumToInt("L"));
	}
	@Test
	void TC1_5() {
		assertEquals(100,  test.convertRomanNumToInt("C"));
	}
	@Test
	void TC1_6() {
		assertEquals(500,  test.convertRomanNumToInt("D"));
	}
	@Test
	void TC1_7() {
		assertEquals(1000,  test.convertRomanNumToInt("M"));
	}
}
