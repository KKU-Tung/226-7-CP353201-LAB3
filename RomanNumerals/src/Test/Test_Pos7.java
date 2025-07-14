package Test;

import static org.junit.jupiter.api.Assertions.*;
import main.RomanNumerals;
import org.junit.jupiter.api.Test;

class Test_Pos7 {
	 RomanNumerals test = new RomanNumerals();

	@Test
	void TC7_1() {
		assertEquals(66,  test.convertRomanNumToInt("LXVI"));
	}
	@Test
	void TC7_2() {
		assertEquals(67,  test.convertRomanNumToInt("LXVII"));
	}
	@Test
	void TC7_3() {
		assertEquals(176,  test.convertRomanNumToInt("CLXXVI"));
	}
	@Test
	void TC7_4() {
		assertEquals(1770,  test.convertRomanNumToInt("MDCCLXX"));
	}
	@Test
	void TC7_5() {
		assertEquals(3888,  test.convertRomanNumToInt("MMMDCCCLXXXVIII"));
	}

}
