package Test;

import static org.junit.jupiter.api.Assertions.*;
import main.RomanNumerals;
import org.junit.jupiter.api.Test;

class Test_Pos5 {
	 RomanNumerals test = new RomanNumerals();

	@Test
	void TC5_1() {
		assertEquals(3,  test.convertRomanNumToInt("III"));
	}
	@Test
	void TC5_2() {
		assertEquals(30,  test.convertRomanNumToInt("XXX"));
	}
	@Test
	void TC5_3() {
		assertEquals(300,  test.convertRomanNumToInt("CCC"));
	}
	@Test
	void TC5_4() {
		assertEquals(3000,  test.convertRomanNumToInt("MMM"));
	}

}
