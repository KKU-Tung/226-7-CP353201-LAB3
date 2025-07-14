package Test;

import static org.junit.jupiter.api.Assertions.*;
import main.RomanNumerals;
import org.junit.jupiter.api.Test;

class Test_Pos3 {
	 RomanNumerals test = new RomanNumerals();

	@Test
	void TC3_1() {
		assertEquals(6,  test.convertRomanNumToInt("VI"));
	}
	@Test
	void TC3_2() {
		assertEquals(15,  test.convertRomanNumToInt("XV"));
	}
	@Test
	void TC3_3() {
		assertEquals(60,  test.convertRomanNumToInt("LX"));
	}
	@Test
	void TC3_4() {
		assertEquals(600,  test.convertRomanNumToInt("DC"));
	}
	@Test
	void TC3_5() {
		assertEquals(1500,  test.convertRomanNumToInt("MD"));
	}

}
