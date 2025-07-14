package Test;

import static org.junit.jupiter.api.Assertions.*;
import main.RomanNumerals;
import org.junit.jupiter.api.Test;

class Test_Pos2 {
	 RomanNumerals test = new RomanNumerals();

	@Test
	void TC2_1() {
		assertEquals(4,  test.convertRomanNumToInt("IV"));
	}
	@Test
	void TC2_2() {
		assertEquals(9,  test.convertRomanNumToInt("IX"));
	}
	@Test
	void TC2_3() {
		assertEquals(40,  test.convertRomanNumToInt("XL"));
	}
	@Test
	void TC2_4() {
		assertEquals(90,  test.convertRomanNumToInt("XC"));
	}
	@Test
	void TC2_5() {
		assertEquals(400,  test.convertRomanNumToInt("CD"));
	}
}
