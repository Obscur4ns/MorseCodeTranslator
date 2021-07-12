package harshMapsTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hashMaps.MorseCodeTranslator;

public class MorseCodeTranslatorTest {
	public MorseCodeTranslator translator = new MorseCodeTranslator();

	@Test
	public void testTranslate() {
		assertEquals("JAVA IS COOL OK", translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
	}

	@Test
	public void testConvert() {
		assertEquals("", translator.convert(""));
	}

	@Test
	public void testConvert2() {
		assertEquals(". --. --. ...", translator.convert("EGGS"));
	}

	@Test
	public void testConvert3() {
		assertEquals(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-", translator.convert("JAVA IS COOL OK"));
	}
}
