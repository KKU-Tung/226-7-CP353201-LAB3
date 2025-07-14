package Test;

import static org.junit.jupiter.api.Assertions.*;
import main.RomanNumerals;
import org.junit.jupiter.api.Test;

class Test_Pos6 {
	 RomanNumerals test = new RomanNumerals();

	@Test
	void TC6_1() {
		assertEquals(7,  test.convertRomanNumToInt("VII"));
	}
	@Test
	void TC6_2() {
		assertEquals(8,  test.convertRomanNumToInt("VIII"));
	}
	@Test
	void TC6_3() {
		assertEquals(165,  test.convertRomanNumToInt("CLXV"));
	}
	@Test
	void TC6_4() {
		assertEquals(516,  test.convertRomanNumToInt("DXVI"));
	}
	@Test
	void TC6_5() {
		assertEquals(1666,  test.convertRomanNumToInt("MDCLXVI"));
	}

}
