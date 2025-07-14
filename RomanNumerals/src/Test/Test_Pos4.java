package Test;

import static org.junit.jupiter.api.Assertions.*;
import main.RomanNumerals;
import org.junit.jupiter.api.Test;

class Test_Pos4 {
	 RomanNumerals test = new RomanNumerals();

	@Test
	void TC4_1() {
		assertEquals(2,  test.convertRomanNumToInt("II"));
	}
	@Test
	void TC4_2() {
		assertEquals(20,  test.convertRomanNumToInt("XX"));
	}
	@Test
	void TC4_3() {
		assertEquals(200,  test.convertRomanNumToInt("CC"));
	}
	@Test
	void TC4_4() {
		assertEquals(2000 ,  test.convertRomanNumToInt("MM"));
	}
}